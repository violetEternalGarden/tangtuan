package com.cj.tangtuan.entity;

import java.util.Date;

public class UserRelation {
    /**
     * 用户间关系表
     */
    private Long userRelationId;

    /**
     * 被关注者ID
     */
    private Long followId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 关注时间
     */
    private Date createTime;

    /**
     * 用户间关系表
     * @return user_relation_id 用户间关系表
     */
    public Long getUserRelationId() {
        return userRelationId;
    }

    /**
     * 用户间关系表
     * @param userRelationId 用户间关系表
     */
    public void setUserRelationId(Long userRelationId) {
        this.userRelationId = userRelationId;
    }

    /**
     * 被关注者ID
     * @return follow_id 被关注者ID
     */
    public Long getFollowId() {
        return followId;
    }

    /**
     * 被关注者ID
     * @param followId 被关注者ID
     */
    public void setFollowId(Long followId) {
        this.followId = followId;
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
     * 关注时间
     * @return create_time 关注时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 关注时间
     * @param createTime 关注时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}