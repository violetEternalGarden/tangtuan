package com.cj.tangtuan.entity;

import java.util.Date;

public class ActivitySingUp {
    /**
     * 活动报名信息表
     */
    private Long asuId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 报名时间
     */
    private Date createTime;

    /**
     * 活动报名信息表
     * @return asu_id 活动报名信息表
     */
    public Long getAsuId() {
        return asuId;
    }

    /**
     * 活动报名信息表
     * @param asuId 活动报名信息表
     */
    public void setAsuId(Long asuId) {
        this.asuId = asuId;
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
     * 报名时间
     * @return create_time 报名时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 报名时间
     * @param createTime 报名时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}