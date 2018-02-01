package com.cj.tangtuan.entity;

import java.util.Date;

public class ActivityComment {
    /**
     * 活动评论表
     */
    private Long acCommentId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 评论内容
     */
    private String comment;

    /**
     * 评论时间
     */
    private Date createTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 删除者类型，1-自己，2-活动发布者，3-管理员
     */
    private String delType;

    /**
     * 删除者ID
     */
    private Long delId;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 活动评论表
     * @return ac_comment_id 活动评论表
     */
    public Long getAcCommentId() {
        return acCommentId;
    }

    /**
     * 活动评论表
     * @param acCommentId 活动评论表
     */
    public void setAcCommentId(Long acCommentId) {
        this.acCommentId = acCommentId;
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
     * 评论内容
     * @return comment 评论内容
     */
    public String getComment() {
        return comment;
    }

    /**
     * 评论内容
     * @param comment 评论内容
     */
    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    /**
     * 评论时间
     * @return create_time 评论时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 评论时间
     * @param createTime 评论时间
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
     * 删除者类型，1-自己，2-活动发布者，3-管理员
     * @return del_type 删除者类型，1-自己，2-活动发布者，3-管理员
     */
    public String getDelType() {
        return delType;
    }

    /**
     * 删除者类型，1-自己，2-活动发布者，3-管理员
     * @param delType 删除者类型，1-自己，2-活动发布者，3-管理员
     */
    public void setDelType(String delType) {
        this.delType = delType == null ? null : delType.trim();
    }

    /**
     * 删除者ID
     * @return del_id 删除者ID
     */
    public Long getDelId() {
        return delId;
    }

    /**
     * 删除者ID
     * @param delId 删除者ID
     */
    public void setDelId(Long delId) {
        this.delId = delId;
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