package com.cj.tangtuan.entity;

import java.util.Date;

public class Admin {
    /**
     * 管理员基础表
     */
    private Long id;

    /**
     * 角色ID
     */
    private Long roleId;

    /**
     * 管理员账号
     */
    private String adminName;

    /**
     * 管理员密码
     */
    private String adminPass;

    /**
     * 密码安全码
     */
    private String saltVal;

    /**
     * 管理员分类，1-普通管理员
     */
    private String adminType;

    /**
     * 状态，1-正常，0-禁用（删除），-1-停用
     */
    private String adminState;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 最后更新时间
     */
    private Date updateTime;

    /**
     * 管理员基础表
     * @return id 管理员基础表
     */
    public Long getId() {
        return id;
    }

    /**
     * 管理员基础表
     * @param id 管理员基础表
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 角色ID
     * @return role_id 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 角色ID
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 管理员账号
     * @return admin_name 管理员账号
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 管理员账号
     * @param adminName 管理员账号
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * 管理员密码
     * @return admin_pass 管理员密码
     */
    public String getAdminPass() {
        return adminPass;
    }

    /**
     * 管理员密码
     * @param adminPass 管理员密码
     */
    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass == null ? null : adminPass.trim();
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
     * 管理员分类，1-普通管理员
     * @return admin_type 管理员分类，1-普通管理员
     */
    public String getAdminType() {
        return adminType;
    }

    /**
     * 管理员分类，1-普通管理员
     * @param adminType 管理员分类，1-普通管理员
     */
    public void setAdminType(String adminType) {
        this.adminType = adminType == null ? null : adminType.trim();
    }

    /**
     * 状态，1-正常，0-禁用（删除），-1-停用
     * @return admin_state 状态，1-正常，0-禁用（删除），-1-停用
     */
    public String getAdminState() {
        return adminState;
    }

    /**
     * 状态，1-正常，0-禁用（删除），-1-停用
     * @param adminState 状态，1-正常，0-禁用（删除），-1-停用
     */
    public void setAdminState(String adminState) {
        this.adminState = adminState == null ? null : adminState.trim();
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
}