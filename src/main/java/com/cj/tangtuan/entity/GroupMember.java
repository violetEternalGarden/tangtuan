package com.cj.tangtuan.entity;

public class GroupMember {
    /**
     * 群成员表
     */
    private Long groupMember;

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
     * 成员分组ID
     */
    private Long groupingId;

    /**
     * 群成员表
     * @return group_member 群成员表
     */
    public Long getGroupMember() {
        return groupMember;
    }

    /**
     * 群成员表
     * @param groupMember 群成员表
     */
    public void setGroupMember(Long groupMember) {
        this.groupMember = groupMember;
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
     * 成员分组ID
     * @return grouping_id 成员分组ID
     */
    public Long getGroupingId() {
        return groupingId;
    }

    /**
     * 成员分组ID
     * @param groupingId 成员分组ID
     */
    public void setGroupingId(Long groupingId) {
        this.groupingId = groupingId;
    }
}