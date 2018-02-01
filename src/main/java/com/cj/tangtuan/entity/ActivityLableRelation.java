package com.cj.tangtuan.entity;

public class ActivityLableRelation {
    /**
     * 活动-标签关联表
     */
    private Long alrId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 标签ID
     */
    private Long lableId;

    /**
     * 活动-标签关联表
     * @return alr_id 活动-标签关联表
     */
    public Long getAlrId() {
        return alrId;
    }

    /**
     * 活动-标签关联表
     * @param alrId 活动-标签关联表
     */
    public void setAlrId(Long alrId) {
        this.alrId = alrId;
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