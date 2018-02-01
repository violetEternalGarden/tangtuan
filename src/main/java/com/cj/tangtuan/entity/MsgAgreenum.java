package com.cj.tangtuan.entity;

import java.util.Date;

public class MsgAgreenum {
    /**
     * 消息赞同表
     */
    private Long msgAgreenumId;

    /**
     * 消息ID
     */
    private Long msgId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 点赞时间
     */
    private Date createTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 消息赞同表
     * @return msg_agreenum_id 消息赞同表
     */
    public Long getMsgAgreenumId() {
        return msgAgreenumId;
    }

    /**
     * 消息赞同表
     * @param msgAgreenumId 消息赞同表
     */
    public void setMsgAgreenumId(Long msgAgreenumId) {
        this.msgAgreenumId = msgAgreenumId;
    }

    /**
     * 消息ID
     * @return msg_id 消息ID
     */
    public Long getMsgId() {
        return msgId;
    }

    /**
     * 消息ID
     * @param msgId 消息ID
     */
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
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