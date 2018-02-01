package com.cj.tangtuan.entity;

import java.util.Date;

public class MsgAtusers {
    /**
     * 消息被at用户表
     */
    private Long atusersId;

    /**
     * 消息ID
     */
    private Long msgId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 被At用户ID
     */
    private Long userAtid;

    /**
     * 被At时间
     */
    private Date atTime;

    /**
     * 消息被at用户表
     * @return atusers_id 消息被at用户表
     */
    public Long getAtusersId() {
        return atusersId;
    }

    /**
     * 消息被at用户表
     * @param atusersId 消息被at用户表
     */
    public void setAtusersId(Long atusersId) {
        this.atusersId = atusersId;
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
     * 被At用户ID
     * @return user_atid 被At用户ID
     */
    public Long getUserAtid() {
        return userAtid;
    }

    /**
     * 被At用户ID
     * @param userAtid 被At用户ID
     */
    public void setUserAtid(Long userAtid) {
        this.userAtid = userAtid;
    }

    /**
     * 被At时间
     * @return at_time 被At时间
     */
    public Date getAtTime() {
        return atTime;
    }

    /**
     * 被At时间
     * @param atTime 被At时间
     */
    public void setAtTime(Date atTime) {
        this.atTime = atTime;
    }
}