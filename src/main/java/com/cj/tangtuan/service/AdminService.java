package com.cj.tangtuan.service;



import com.cj.tangtuan.entity.Admin;
import com.cj.tangtuan.entity.AdminRole;
import com.cj.tangtuan.utils.common.QueryBase;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by XD on 2017/12/8.
 */
public interface AdminService {

    //添加管理员
    public int addAdmin(Admin admin);

    //删除、取消删除管理员、修改用户角色
    public int updateAdmin(Admin admin);

    //查询所有管理员
    public QueryBase findAllAdmin(QueryBase qb);


    //添加角色
    public int addRole(AdminRole adminRole);

    //删除角色
    public int updateRole(AdminRole adminRole);

    //查询正常使用的角色
    public List<AdminRole> findAllRole(AdminRole adminRole);

    //查询所有的正常使用的目录及页面及当前角色的权限ID
    public Map findRoleModulars(Long roleId);

    //根据角色ID修改角色权限
    public int updateRoleModular(Map map);


    //管理员登陆
    public int findAdmin(HttpServletRequest request, Admin admin);

    //修改密码
    public int updatePass(HttpServletRequest request, Map map);

    //注销
    public void ifLogout(HttpServletRequest request);

    //主页查询
    public Map loginSuccess(Admin admin, HttpServletRequest request);




}
