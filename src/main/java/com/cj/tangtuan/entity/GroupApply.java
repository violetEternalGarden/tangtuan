package com.cj.tangtuan.entity;

import java.util.Date;

public class GroupApply {
    /**
     * 加群审核记录表
     */
    private Long groupApply;

    /**
     * 群ID
     */
    private Long groupId;

    /**
     * 群号
     */
    private Long groupNum;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 申请描述
     */
    private String describe;

    /**
     * 申请时间
     */
    private Date createTime;

    /**
     * 加群审核记录表
     * @return group_apply 加群审核记录表
     */
    public Long getGroupApply() {
        return groupApply;
    }

    /**
     * 加群审核记录表
     * @param groupApply 加群审核记录表
     */
    public void setGroupApply(Long groupApply) {
        this.groupApply = groupApply;
    }

    /**
     * 群ID
     * @return group_id 群ID
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 群ID
     * @param groupId 群ID
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 群号
     * @return group_num 群号
     */
    public Long getGroupNum() {
        return groupNum;
    }

    /**
     * 群号
     * @param groupNum 群号
     */
    public void setGroupNum(Long groupNum) {
        this.groupNum = groupNum;
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
     * 申请描述
     * @return describe 申请描述
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * 申请描述
     * @param describe 申请描述
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * 申请时间
     * @return create_time 申请时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 申请时间
     * @param createTime 申请时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}