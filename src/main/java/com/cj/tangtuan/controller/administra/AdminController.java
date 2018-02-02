package com.cj.tangtuan.controller.administra;

import com.cj.tangtuan.entity.Admin;
import com.cj.tangtuan.entity.AdminRole;
import com.cj.tangtuan.service.AdminService;
import com.cj.tangtuan.utils.CookieTool;
import com.cj.tangtuan.utils.common.QueryBase;
import com.cj.tangtuan.utils.common.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by XD on 2017/12/6.
 * 管理员信息处理、角色管理、权限管理
 */

@Controller
@Slf4j
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;



  /*============================================ 页面跳转 start =======================================================*/

    //跳转到登陆页面
    @GetMapping()
    public ModelAndView toLogin(HttpServletRequest request, HttpServletResponse response){
        System.out.println("============================跳转到登陆页面======================================");
        ModelAndView mav = new ModelAndView();
        mav.setViewName(Status.Prefix+Status.IFLOGIN+Status.Suffix);

        String path = request.getContextPath();
        String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

        CookieTool.addCookie(response,"basePath",basePath,30*60);


        return mav;
    }



    /*========================================= 页面跳转 end ==========================================================*/



  /*=========================================== 人员管理 start ========================================================*/

    //添加管理员
    @PostMapping("/addAdmin")
    @ResponseBody
    public Object addAdmin(@RequestBody Admin admin){
        int i = adminService.addAdmin(admin);
        if(i==-1){
            return Status.send(0,"管理员"+admin.getAdminName()+"已存在","");
        }else if(i==1){
            return Status.send(0,"管理员"+admin.getAdminName()+"添加成功","");

        }else {
            return Status.send(0,"管理员"+admin.getAdminName()+"添加失败，请稍后再试","");

        }
    }

    //删除管理员，将type改为0,根据ID
    @PutMapping("/putAdmin")
    @ResponseBody
    public Map putAdmin(@RequestBody Admin admin){
        admin.setAdminState("0");
        int i = adminService.updateAdmin(admin);
        if(i>0){
            Status.MESSAGE = "操作成功";
        }else {
            Status.MESSAGE = "操作失败";
        }
        return Status.send(i,Status.MESSAGE,"");
    }

    //禁用(adminState=-1)、取消禁用管理员、修改管理员信息
    @PutMapping("/updateAdmin")
    @ResponseBody
    public Map updateAdmin(@RequestBody Admin admin){
        System.out.println(admin);
        if(!(admin.getAdminState().equals("-1")|admin.getAdminState().equals("1"))){
            admin.setAdminState("-1");
        }
        admin.setUpdateTime(new Date());
        int i = adminService.updateAdmin(admin);
        if(i>0){
            Status.MESSAGE = "操作成功";
        }else {
            Status.MESSAGE = "操作失败";
        }
        return Status.send(i,Status.MESSAGE,"");
    }

    //分页查询管理员列表
    @PostMapping("/findAllAdmin")
    @ResponseBody
    public QueryBase findAllAdmin(@RequestBody QueryBase qb){
        qb = adminService.findAllAdmin(qb);
        return qb;
    }


    /*========================================= 人员管理 end===========================================================*/


    /*========================================= 角色管理 start ========================================================*/
    //添加角色
    @PostMapping("/addRole")
    @ResponseBody
    public Map addRole(@RequestBody AdminRole adminRole){
        int i = adminService.addRole(adminRole);
        if(i==1){
            Status.MESSAGE = "添加成功";
        }else if(i==0){
            Status.MESSAGE = "添加失败";

        }else if(i==-1){
            Status.MESSAGE = "角色已存在";

        }

        return Status.send(1,Status.MESSAGE,"");
    }

    //删除角色
    @DeleteMapping("/deleteRole")
    @ResponseBody
    public Map deleteRole(@RequestBody AdminRole adminRole){
        //根据RoleId检查角色下是否有管理员存在
        int i = adminService.updateRole(adminRole);
        if (i==0){
            Status.MESSAGE = "删除角色失败";
        }else  if (i==1){
            Status.MESSAGE = "删除角色成功";
        }else if(i==-1){
            Status.MESSAGE = "角色下有管理员存在,无法删除";
        }
        return Status.send(1,Status.MESSAGE,"");
    }

    //修改管理员角色(修改角色名)
    @PutMapping("/updateAdminRole")
    @ResponseBody
    public Map updateAdminRole(@RequestBody Admin admin){

        int i = adminService.updateAdmin(admin);
        if(i>0){
            Status.MESSAGE = "操作成功";
        }else {
            Status.MESSAGE = "操作失败";
        }
        return Status.send(i,Status.MESSAGE,"");
    }

    //分类查询正常使用的角色列表
    @GetMapping("/findAllRole")
    @ResponseBody
    public List<AdminRole> findAllRole(AdminRole adminRole){
        List<AdminRole> adminRoles =  adminService.findAllRole(adminRole);
        return adminRoles;
    }
    /*========================================= 角色管理 end ==========================================================*/


    /*========================================= 角色权限管理 start ==========================================================*/


    /**
     * map
     * @return
     * roleId 传入角色ID
     */
    //查询所有的正常使用的目录及页面及当前角色的权限ID集合
    @GetMapping("/findRoleModulars")
    @ResponseBody
    public Map findRoleModulars(Long roleId){
        return adminService.findRoleModulars(roleId);
    }

    /**
     *
     * @param map
     * @return
     * roleId 要修改的角色ID
     * modulars 新的权限ID集合
     */
    //修改角色权限
    @PutMapping("/updateRoleModular")
    @ResponseBody
    public Object updateRoleModular(@RequestBody Map map){ //Map包括roleId modularId的集合


        int i = adminService.updateRoleModular(map);

        if(i==0){
            Status.MESSAGE = "修改失败，请稍后再试";
        }else {
            Status.MESSAGE = "修改成功，下次登录生效";
        }
        return Status.send(i,Status.MESSAGE,"");
    }

    /*========================================= 角色权限管理 end ==========================================================*/




    //登陆
    @PostMapping("/ifLogin")
    public ModelAndView ifLogin(HttpServletRequest request, HttpServletResponse response, Admin admin) throws IOException {


        int i = adminService.findAdmin(request,admin);

        if (i>0){


            CookieTool.addCookie(response,"token",(String)request.getSession().getAttribute("Token"),30*60);

            return new ModelAndView(Status.Prefix+Status.IFMAIN+Status.Suffix);
        }else {
            System.out.println("============================跳转到登陆页面======================================");
            return new ModelAndView(Status.Prefix+Status.IFLOGIN+Status.Suffix).addObject("message","账号或密码错误");
        }
    }




    //管理员修改密码
    @PutMapping("/updatePass")
    @ResponseBody
    public Object updatePass(@RequestBody Map map, HttpServletRequest request){

        int i = adminService.updatePass(request,map);

        String message = "";
        if(i==1){
            message = "修改成功";
        }else if(i==0){
            message = "修改失败";
        }else if (i==-1){
            message = "原密码错误";
        }else {
            message = "未知错误";
        }
        return Status.send(i,message,"");
    }

    //登陆成功后的查询
    @GetMapping("/loginSuccess")
    @ResponseBody
    public Map loginSuccess(Admin admin,HttpServletRequest request){
        return adminService.loginSuccess(admin,request);
    }

    //管理员注销
    @GetMapping("/ifLogout")
    public Object ifLogout(HttpServletRequest request){

        adminService.ifLogout(request);
        return "redirect:/admin";
    }
}
