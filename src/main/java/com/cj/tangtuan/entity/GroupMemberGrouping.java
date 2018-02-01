package com.cj.tangtuan.entity;

public class GroupMemberGrouping {
    /**
     * 群成员分组信息
     */
    private Long groupMemberGrouping;

    /**
     * 分组名称(管理员-成员）
     */
    private String groupingName;

    /**
     * 群成员分组信息
     * @return group_member_grouping 群成员分组信息
     */
    public Long getGroupMemberGrouping() {
        return groupMemberGrouping;
    }

    /**
     * 群成员分组信息
     * @param groupMemberGrouping 群成员分组信息
     */
    public void setGroupMemberGrouping(Long groupMemberGrouping) {
        this.groupMemberGrouping = groupMemberGrouping;
    }

    /**
     * 分组名称(管理员-成员）
     * @return grouping_name 分组名称(管理员-成员）
     */
    public String getGroupingName() {
        return groupingName;
    }

    /**
     * 分组名称(管理员-成员）
     * @param groupingName 分组名称(管理员-成员）
     */
    public void setGroupingName(String groupingName) {
        this.groupingName = groupingName == null ? null : groupingName.trim();
    }
}