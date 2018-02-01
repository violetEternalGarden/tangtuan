package com.cj.tangtuan.entity;

import java.util.Date;

public class CarouselImg {
    /**
     * 首页轮播图
     */
    private Long ciId;

    /**
     * 图片名称
     */
    private String imgName;

    /**
     * 图片说明
     */
    private String imgExplain;

    /**
     * 图片路径
     */
    private String imgUrl;

    /**
     * 链接地址
     */
    private String linkUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 操作人员ID
     */
    private Long adminId;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 首页轮播图
     * @return ci_id 首页轮播图
     */
    public Long getCiId() {
        return ciId;
    }

    /**
     * 首页轮播图
     * @param ciId 首页轮播图
     */
    public void setCiId(Long ciId) {
        this.ciId = ciId;
    }

    /**
     * 图片名称
     * @return img_name 图片名称
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * 图片名称
     * @param imgName 图片名称
     */
    public void setImgName(String imgName) {
        this.imgName = imgName == null ? null : imgName.trim();
    }

    /**
     * 图片说明
     * @return img_explain 图片说明
     */
    public String getImgExplain() {
        return imgExplain;
    }

    /**
     * 图片说明
     * @param imgExplain 图片说明
     */
    public void setImgExplain(String imgExplain) {
        this.imgExplain = imgExplain == null ? null : imgExplain.trim();
    }

    /**
     * 图片路径
     * @return img_url 图片路径
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片路径
     * @param imgUrl 图片路径
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 链接地址
     * @return link_url 链接地址
     */
    public String getLinkUrl() {
        return linkUrl;
    }

    /**
     * 链接地址
     * @param linkUrl 链接地址
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl == null ? null : linkUrl.trim();
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
     * 删除时间
     * @return delete_time 删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 删除时间
     * @param deleteTime 删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 操作人员ID
     * @return admin_id 操作人员ID
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 操作人员ID
     * @param adminId 操作人员ID
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * 0-已删除，1-正常，默认为1
     * @return state 0-已删除，1-正常，默认为1
     */
    public String getState() {
        return state;
    }

    /**
     * 0-已删除，1-正常，默认为1
     * @param state 0-已删除，1-正常，默认为1
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}