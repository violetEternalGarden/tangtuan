package com.cj.tangtuan.entity;

public class ActivityRelation {
    /**
     * 活动的评论间关系表
     */
    private Long activityRelationId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 评论ID
     */
    private Long acCommentId;

    /**
     * 发表此评论的用户ID
     */
    private Long userId;

    /**
     * 被回复评论ID
     */
    private Long acCommentedId;

    /**
     * 被回复评论发布者ID
     */
    private Long useredId;

    /**
     * 活动的评论间关系表
     * @return activity_relation_id 活动的评论间关系表
     */
    public Long getActivityRelationId() {
        return activityRelationId;
    }

    /**
     * 活动的评论间关系表
     * @param activityRelationId 活动的评论间关系表
     */
    public void setActivityRelationId(Long activityRelationId) {
        this.activityRelationId = activityRelationId;
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
     * 评论ID
     * @return ac_comment_id 评论ID
     */
    public Long getAcCommentId() {
        return acCommentId;
    }

    /**
     * 评论ID
     * @param acCommentId 评论ID
     */
    public void setAcCommentId(Long acCommentId) {
        this.acCommentId = acCommentId;
    }

    /**
     * 发表此评论的用户ID
     * @return user_id 发表此评论的用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 发表此评论的用户ID
     * @param userId 发表此评论的用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 被回复评论ID
     * @return ac_commented_id 被回复评论ID
     */
    public Long getAcCommentedId() {
        return acCommentedId;
    }

    /**
     * 被回复评论ID
     * @param acCommentedId 被回复评论ID
     */
    public void setAcCommentedId(Long acCommentedId) {
        this.acCommentedId = acCommentedId;
    }

    /**
     * 被回复评论发布者ID
     * @return usered_id 被回复评论发布者ID
     */
    public Long getUseredId() {
        return useredId;
    }

    /**
     * 被回复评论发布者ID
     * @param useredId 被回复评论发布者ID
     */
    public void setUseredId(Long useredId) {
        this.useredId = useredId;
    }
}