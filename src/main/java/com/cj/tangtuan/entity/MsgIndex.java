package com.cj.tangtuan.entity;

import java.util.Date;

public class MsgIndex {
    /**
     * 用户消息索引表
     */
    private Long msgIndexId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 消息发布者ID
     */
    private Long msgUserId;

    /**
     * 消息ID
     */
    private Long msgId;

    /**
     * 发布时间
     */
    private Date time;

    /**
     * 用户消息索引表
     * @return msg_index_id 用户消息索引表
     */
    public Long getMsgIndexId() {
        return msgIndexId;
    }

    /**
     * 用户消息索引表
     * @param msgIndexId 用户消息索引表
     */
    public void setMsgIndexId(Long msgIndexId) {
        this.msgIndexId = msgIndexId;
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
     * 消息发布者ID
     * @return msg_user_id 消息发布者ID
     */
    public Long getMsgUserId() {
        return msgUserId;
    }

    /**
     * 消息发布者ID
     * @param msgUserId 消息发布者ID
     */
    public void setMsgUserId(Long msgUserId) {
        this.msgUserId = msgUserId;
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
     * 发布时间
     * @return time 发布时间
     */
    public Date getTime() {
        return time;
    }

    /**
     * 发布时间
     * @param time 发布时间
     */
    public void setTime(Date time) {
        this.time = time;
    }
}