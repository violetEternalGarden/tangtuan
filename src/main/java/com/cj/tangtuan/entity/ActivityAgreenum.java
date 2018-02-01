package com.cj.tangtuan.entity;

import java.util.Date;

public class ActivityAgreenum {
    /**
     * 活动点赞信息记录表
     */
    private Long activityAgreenum;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 点赞时间
     */
    private Date createTime;

    /**
     * 活动点赞信息记录表
     * @return activity_agreenum 活动点赞信息记录表
     */
    public Long getActivityAgreenum() {
        return activityAgreenum;
    }

    /**
     * 活动点赞信息记录表
     * @param activityAgreenum 活动点赞信息记录表
     */
    public void setActivityAgreenum(Long activityAgreenum) {
        this.activityAgreenum = activityAgreenum;
    }

    /**
     * 活动ID
     * @return activity_id 活动ID
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 活动ID
     * @param activityId 活动ID
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
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
     * 点赞时间
     * @return create_time 点赞时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 点赞时间
     * @param createTime 点赞时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}