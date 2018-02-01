package com.cj.tangtuan.entity;

public class UserLable {
    /**
     * 用户-标签关联表
     */
    private Long userLableId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 标签ID
     */
    private Long lableId;

    /**
     * 用户-标签关联表
     * @return user_lable_id 用户-标签关联表
     */
    public Long getUserLableId() {
        return userLableId;
    }

    /**
     * 用户-标签关联表
     * @param userLableId 用户-标签关联表
     */
    public void setUserLableId(Long userLableId) {
        this.userLableId = userLableId;
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
     * 标签ID
     * @return lable_id 标签ID
     */
    public Long getLableId() {
        return lableId;
    }

    /**
     * 标签ID
     * @param lableId 标签ID
     */
    public void setLableId(Long lableId) {
        this.lableId = lableId;
    }
}