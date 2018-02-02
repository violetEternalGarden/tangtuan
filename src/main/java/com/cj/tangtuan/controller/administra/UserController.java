package com.cj.tangtuan.controller.administra;


/**
 * 用户信息管理
 */
public class UserController {

    /**
     * ==============================用户基础信息
     *
     */

    /**
     * 分页、条件（用户名、创建时间等）查询用户信息
     * 参数：
     * 返回：用户列表展示页面
     *
     */
    public Object finAllUser(){
        return 0;
    }

    /**
     * 用户详情查询
     * 参数：用户ID
     * 返回：用户详情展示页面
     */
    public Object finUser(){
        return 0;
    }


    /**
     * 删除用户（封号）
     * 参数：用户ID
     * 返回:是否成功
     */
    public Object updUser(){
        return 0;
    }

    /**
     * ==============================用户活动管理
     */
    /**
     * 分页、条件查询用户发起的活动信息
     * 参数：用户ID
     * 返回：活动列表展示页面
     */
    public Object findAllUserActivity(){
        return 0;
    }

    /**
     * 查询活动详情
     * 参数：活动ID
     * 返回：活动详情展示页面
     */
    public Object findUserActivity(){
        return 0;
    }

    /**
     * 活动报名者信息
     * 参数：活动ID
     * 返回：活动报名者信息展示页面
     */
    public Object findAllUserActivitySingUp(){
        return 0;
    }


    /**
     * 删除活动
     * 参数：活动ID
     * 返回：是否成功
     */
    public Object delUserActivity(){
        return 0;
    }


    /**
     * =============================用户动态管理
     */
    /**
     * 分页、条件查询用户动态信息
     * 参数：用户ID
     * 返回：用户动态列表展示页面
     */
    public Object findAllUserMsg(){
        return 0;
    }

    /**
     * 用户动态详情查询
     * 参数:动态ID
     * 返回：动态详情展示页面
     */
    public Object findUserMsg(){
        return 0;
    }

    /**
     * 删除动态
     * 参数：动态ID
     * 返回：是否成功
     */
    public Object delUserMsg(){
        return 0;
    }

    /**
     * =========================================用户订单管理
     */
    /**
     * 分页、条件（门票、酒店、活动）查询用户订单信息
     * 参数：
     * 返回：订单列表展示页面
     */
    public Object findAllUserOrder(){
        return 0;
    }

    /**
     * 订单详情查询
     * 参数：订单ID
     * 返回：订单详情展示页面
     */
    public Object findUserOrder(){
        return 0;
    }






}
