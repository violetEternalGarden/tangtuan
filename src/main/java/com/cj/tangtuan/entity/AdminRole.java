package com.cj.tangtuan.entity;

import java.util.Date;

public class AdminRole {
    /**
     * 管理员角色表
     */
    private Integer id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色分类，1-用户，2-管理员
     */
    private String type;

    /**
     * 状态（1-正常，0-已删除）
     */
    private String state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 管理员角色表
     * @return id 管理员角色表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 管理员角色表
     * @param id 管理员角色表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 角色名称
     * @return role_name 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    /**
     * 角色分类，1-用户，2-管理员
     * @return type 角色分类，1-用户，2-管理员
     */
    public String getType() {
        return type;
    }

    /**
     * 角色分类，1-用户，2-管理员
     * @param type 角色分类，1-用户，2-管理员
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 状态（1-正常，0-已删除）
     * @return state 状态（1-正常，0-已删除）
     */
    public String getState() {
        return state;
    }

    /**
     * 状态（1-正常，0-已删除）
     * @param state 状态（1-正常，0-已删除）
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
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
}