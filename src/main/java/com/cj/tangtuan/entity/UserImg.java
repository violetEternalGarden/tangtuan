package com.cj.tangtuan.entity;

import java.util.Date;

public class UserImg {
    /**
     * 用户相关图片存储表
     */
    private Long userImgId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 图片路径
     */
    private String imgUrl;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 用户相关图片存储表
     * @return user_img_id 用户相关图片存储表
     */
    public Long getUserImgId() {
        return userImgId;
    }

    /**
     * 用户相关图片存储表
     * @param userImgId 用户相关图片存储表
     */
    public void setUserImgId(Long userImgId) {
        this.userImgId = userImgId;
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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