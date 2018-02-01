package com.cj.tangtuan.entity;

import java.util.Date;

public class GroupMsg {
    /**
     * 群消息表
     */
    private Long groupMsgId;

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
     * 消息内容
     */
    private String msg;

    /**
     * 发布时间
     */
    private Date createTime;

    /**
     * 状态，0-已删除，1-正常
     */
    private String state;

    /**
     * 群消息表
     * @return group_msg_id 群消息表
     */
    public Long getGroupMsgId() {
        return groupMsgId;
    }

    /**
     * 群消息表
     * @param groupMsgId 群消息表
     */
    public void setGroupMsgId(Long groupMsgId) {
        this.groupMsgId = groupMsgId;
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
     * 消息内容
     * @return msg 消息内容
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 消息内容
     * @param msg 消息内容
     */
    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    /**
     * 发布时间
     * @return create_time 发布时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 发布时间
     * @param createTime 发布时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 状态，0-已删除，1-正常
     * @return state 状态，0-已删除，1-正常
     */
    public String getState() {
        return state;
    }

    /**
     * 状态，0-已删除，1-正常
     * @param state 状态，0-已删除，1-正常
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}