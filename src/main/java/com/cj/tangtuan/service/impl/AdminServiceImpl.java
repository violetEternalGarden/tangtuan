package com.cj.tangtuan.service.impl;

import com.cj.tangtuan.entity.Admin;
import com.cj.tangtuan.entity.AdminModular;
import com.cj.tangtuan.entity.AdminRole;
import com.cj.tangtuan.entity.other.AdminModulars;
import com.cj.tangtuan.mapper.AdminMapper;
import com.cj.tangtuan.mapper.AdminModularMapper;
import com.cj.tangtuan.mapper.AdminRoleMapper;
import com.cj.tangtuan.mapper.AdminRoleModularMapper;
import com.cj.tangtuan.service.AdminService;
import com.cj.tangtuan.utils.admin.MD5Util;
import com.cj.tangtuan.utils.admin.SecurityUtil;
import com.cj.tangtuan.utils.common.QueryBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by XD on 2017/12/8.
 */

@Service
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminRoleModularMapper adminRoleModularMapper;

    @Autowired
    private AdminModularMapper adminModularMapper;

    @Autowired
    private AdminRoleMapper adminRoleMapper;




    //添加管理员
    @Override
    @Transactional
    public int addAdmin(Admin admin) {
        //检查用户名是否已存在
        Integer i = adminMapper.findAdminByName(admin.getAdminName());
        if(i!=null){//此用户名已存在
            return -1;
        }else {
            //设置角色
            admin.setCreateTime(new Date());
            //添加用户
            int j = adminMapper.insertSelective(admin);
            System.out.println("====================================admin=================================================");
            System.out.println(admin);
            System.out.println("====================================admin=================================================");
            if(j>0){
                //生成密码安全吗
                String saltVal = SecurityUtil.getNewPsw();
                //生成加密后的密码
                String pwd = SecurityUtil.getStoreLogpwd(admin.getId().toString(),admin.getAdminPass(),saltVal);

                admin.setAdminPass(pwd);
                admin.setSaltVal(saltVal);

                //修改管理员信息，更新加密后的密码和密码保护码
                int k = adminMapper.updateByPrimaryKeySelective(admin);
                if(k>0){

                    return 1;
                }
            }
        }
        return 0;
    }

    //删除、取消删除管理员、修改用户角色
    @Override
    public int updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }
    //查询所有管理员
    @Override
    public QueryBase findAllAdmin(QueryBase qb) {
        //查询总条数
        qb.setTotalRow(adminMapper.findAdminSize());

        //查询符合条件的集合
        qb.setResults(adminMapper.findAllAdmin(qb));

        return qb;
    }

    //添加角色
    @Override
    public int addRole(AdminRole adminRole) {
        //查询此角色是否已存在
        AdminRole adminRole1 = adminRoleMapper.findRoleName(adminRole);
        if(adminRole1!=null){

        }else { //不存在，则添加
            adminRole.setCreateTime(new Date());
            int i = adminRoleMapper.insertSelective(adminRole);
            return i;
        }
        return -1;
    }

    //删除角色
    @Override
    public int updateRole(AdminRole adminRole) {
        //根据RoleId检查角色下是否有管理员存在
        int i = adminRoleModularMapper.findRoleModular(adminRole);
        if(i==0){ //无管理员、则删除
            int j = adminRoleMapper.updateRole(adminRole);
            return j;

        }else {  //有管理员
            return -1;
        }

    }
    //查询正常使用的角色
    @Override
    public List<AdminRole> findAllRole(AdminRole adminRole) {
        return adminRoleMapper.findAllRole(adminRole);
    }

    //查询所有的正常使用的目录及页面及当前角色的权限ID
    @Override
    public Map findRoleModulars(Long roleId) {

        //根据roleId查询所有该角色下的权限信息
        List modular = adminRoleModularMapper.findAllAdminRoleModularModularId(roleId);

        //查询所有的可使用的权限页面信息
        List<AdminModular> modulars = adminModularMapper.findAllRoleModulars();

        //将目录和权限封装为列表样式
        List<AdminModulars> catas = encapsulation(modulars);

        Map map = new HashMap();
        map.put("modular",modular);
        map.put("catas",catas);
        return map;
    }

    //修改角色权限
    @Override
    @Transactional
    public int updateRoleModular(Map map) {

        //处理数据，将id字符串转集合
        String str = (String)map.get("modulars");
        map.put("modulars", Arrays.asList(str.split(",")));

        //先删除该角色ID下的所有数据
        int i = adminRoleModularMapper.deleteRoleModular(map);
        //再新增传入的数据
        int j = adminRoleModularMapper.addRoleModular(map);
        if(i>-1&&j>0){
            return 1;
        }
        return 0;
    }

    //管理员登陆
    @Override
    public int findAdmin(HttpServletRequest request, Admin admin) {
        //检查用户名是否已存在
        Admin admin1 = adminMapper.findAdmin(admin);

        if(admin1==null){//用户不存在
            return -1;
        }else {
            String pwd = SecurityUtil.getStoreLogpwd(admin1.getId().toString(),admin.getAdminPass(),admin1.getSaltVal());
            if(admin1.getAdminPass().equals(pwd)){


                HttpSession session = request.getSession();

                //生成Token
                String Token = MD5Util.md5Hex(session.getId()+admin1.getAdminName()+ UUID.randomUUID());

                //将用户ID、用户名、Token、角色Id绑定到session
                session.setAttribute("adminId",admin1.getId());
                session.setAttribute("adminName",admin1.getAdminName());
                session.setAttribute("roleId",admin1.getRoleId());
                session.setAttribute("Token",Token);
                return 1;
            }else {
                return 0;
            }
        }

    }

    //修改密码
    @Override
    public int updatePass(HttpServletRequest request, Map map) {
//        HttpSession session = MySessionContext.getSession((String) map.get("sessionId"));
        HttpSession session = request.getSession();
        String adminName = (String)session.getAttribute("adminName");
        String oldPass = (String)map.get("oldPass");
        String newPass = (String)map.get("newPass");


        Admin admin = new Admin();
        admin.setAdminName(adminName);

        Admin admin1 = adminMapper.findAdmin(admin);
        String oldpwd = SecurityUtil.getStoreLogpwd(admin1.getId().toString(),oldPass,admin1.getSaltVal());
        if(admin1.getAdminPass().equals(oldPass)){ //旧密码正确
            String newpwd = SecurityUtil.getStoreLogpwd(admin1.getId().toString(),newPass,admin1.getSaltVal());
            admin1.setAdminPass(newPass);
            //修改管理员密码
            int k = adminMapper.updateByPrimaryKeySelective(admin1);
            if(k>0){
                return 1;
            }else {
                return 0;
            }
        }else {
            //旧密码错误
            return -1;
        }



    }

    //注销
    @Override
    public void ifLogout(HttpServletRequest request){
        //销毁此session
        request.getSession().invalidate();
    }

    //主页查询
    @Override
    public Map loginSuccess(Admin admin,HttpServletRequest request) {

        //用于封装返回的结果集
        Map map = new HashMap();

//        //从session中获取用户名
//        String adminName = (String)request.getSession().getAttribute("adminName");
//        Admin admin = new Admin();
//        admin.setAdminName(adminName);

        //用adminName查询
        Admin admin1 = adminMapper.findAdmin(admin);

        //根据角色信息查询管理员权限页面id
        List roleIds = adminRoleModularMapper.findAllAdminRoleModularModularId(admin1.getRoleId());

        if(roleIds.size()==0){

            map.put("catas",new ArrayList<>());
        }else {
            //查询权限页面信息
            List<AdminModular> modulars = adminModularMapper.findAllRoleModular(roleIds);

            //将目录和权限封装为列表样式
            List<AdminModulars> catas = encapsulation(modulars);

            //将权限列表封装到map
            map.put("catas",cleanCatas(catas));  //清理无权限的目录
        }

        return map;
    }

    //将目录和权限封装为列表样式
    public List<AdminModulars> encapsulation(List<AdminModular> modulars){
        List<AdminModulars> catas = adminModularMapper.findAllCatalog();

        for (AdminModulars adminModulars : catas){
            List list = new ArrayList<>();

            for (AdminModular adminModular : modulars){
                if(adminModulars.getId().equals(adminModular.getParentId())){
                    list.add(adminModular);
                }
            }

            adminModulars.setChildren(list);

        }
        return catas;
    }

    //清理无权限的目录
    public static List<AdminModulars> cleanCatas(List<AdminModulars> catas){

        Iterator<AdminModulars> it =  catas.iterator();
        while (it.hasNext()){
            AdminModulars modulars = it.next();
            if(modulars.getChildren().size()==0){
                it.remove();
            }
        }
        return catas;
    }
}


