package com.cj.tangtuan.entity;

import java.util.Date;

public class User {
    /**
     * 用户基础表
     */
    private Long userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 密码安全码
     */
    private String saltVal;

    /**
     * 用户角色(role表主键）
     */
    private String roleId;

    /**
     * 手机号登陆
     */
    private String userMobile;

    /**
     * 邮箱登陆
     */
    private String userEmail;

    /**
     * QQ登陆
     */
    private String userQq;

    /**
     * 微信登陆
     */
    private String userWx;

    /**
     * 新浪微博登陆
     */
    private String userXl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 最后登陆IP
     */
    private String userLoginIp;

    /**
     * 最后登陆时间
     */
    private Date userLoginTime;

    /**
     * 状态，1-正常，0-禁用
     */
    private String state;

    /**
     * 用户基础表
     * @return user_id 用户基础表
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户基础表
     * @param userId 用户基础表
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户名
     * @return user_name 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 密码
     * @return user_pass 密码
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * 密码
     * @param userPass 密码
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * 密码安全码
     * @return salt_val 密码安全码
     */
    public String getSaltVal() {
        return saltVal;
    }

    /**
     * 密码安全码
     * @param saltVal 密码安全码
     */
    public void setSaltVal(String saltVal) {
        this.saltVal = saltVal == null ? null : saltVal.trim();
    }

    /**
     * 用户角色(role表主键）
     * @return role_id 用户角色(role表主键）
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * 用户角色(role表主键）
     * @param roleId 用户角色(role表主键）
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    /**
     * 手机号登陆
     * @return user_mobile 手机号登陆
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 手机号登陆
     * @param userMobile 手机号登陆
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * 邮箱登陆
     * @return user_email 邮箱登陆
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 邮箱登陆
     * @param userEmail 邮箱登陆
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * QQ登陆
     * @return user_qq QQ登陆
     */
    public String getUserQq() {
        return userQq;
    }

    /**
     * QQ登陆
     * @param userQq QQ登陆
     */
    public void setUserQq(String userQq) {
        this.userQq = userQq == null ? null : userQq.trim();
    }

    /**
     * 微信登陆
     * @return user_wx 微信登陆
     */
    public String getUserWx() {
        return userWx;
    }

    /**
     * 微信登陆
     * @param userWx 微信登陆
     */
    public void setUserWx(String userWx) {
        this.userWx = userWx == null ? null : userWx.trim();
    }

    /**
     * 新浪微博登陆
     * @return user_xl 新浪微博登陆
     */
    public String getUserXl() {
        return userXl;
    }

    /**
     * 新浪微博登陆
     * @param userXl 新浪微博登陆
     */
    public void setUserXl(String userXl) {
        this.userXl = userXl == null ? null : userXl.trim();
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 最后更新时间
     * @return update_time 最后更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 最后更新时间
     * @param updateTime 最后更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 最后登陆IP
     * @return user_login_ip 最后登陆IP
     */
    public String getUserLoginIp() {
        return userLoginIp;
    }

    /**
     * 最后登陆IP
     * @param userLoginIp 最后登陆IP
     */
    public void setUserLoginIp(String userLoginIp) {
        this.userLoginIp = userLoginIp == null ? null : userLoginIp.trim();
    }

    /**
     * 最后登陆时间
     * @return user_login_time 最后登陆时间
     */
    public Date getUserLoginTime() {
        return userLoginTime;
    }

    /**
     * 最后登陆时间
     * @param userLoginTime 最后登陆时间
     */
    public void setUserLoginTime(Date userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

    /**
     * 状态，1-正常，0-禁用
     * @return state 状态，1-正常，0-禁用
     */
    public String getState() {
        return state;
    }

    /**
     * 状态，1-正常，0-禁用
     * @param state 状态，1-正常，0-禁用
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}