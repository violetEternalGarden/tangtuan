package com.cj.tangtuan.entity;

import java.util.Date;

public class UserMsg {
    /**
     * 用户接收消息表
     */
    private Long userMsgId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 接受私信用户ID
     */
    private Long acceptUserId;

    /**
     * 消息类型，1-私信，2-系统通知
     */
    private String msgType;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 发送时间
     */
    private Date privateletterTime;

    /**
     * 消息状态，0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 用户接收消息表
     * @return user_msg_id 用户接收消息表
     */
    public Long getUserMsgId() {
        return userMsgId;
    }

    /**
     * 用户接收消息表
     * @param userMsgId 用户接收消息表
     */
    public void setUserMsgId(Long userMsgId) {
        this.userMsgId = userMsgId;
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
     * 接受私信用户ID
     * @return accept_user_id 接受私信用户ID
     */
    public Long getAcceptUserId() {
        return acceptUserId;
    }

    /**
     * 接受私信用户ID
     * @param acceptUserId 接受私信用户ID
     */
    public void setAcceptUserId(Long acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    /**
     * 消息类型，1-私信，2-系统通知
     * @return msg_type 消息类型，1-私信，2-系统通知
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * 消息类型，1-私信，2-系统通知
     * @param msgType 消息类型，1-私信，2-系统通知
     */
    public void setMsgType(String msgType) {
        this.msgType = msgType == null ? null : msgType.trim();
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
     * 发送时间
     * @return privateletter_time 发送时间
     */
    public Date getPrivateletterTime() {
        return privateletterTime;
    }

    /**
     * 发送时间
     * @param privateletterTime 发送时间
     */
    public void setPrivateletterTime(Date privateletterTime) {
        this.privateletterTime = privateletterTime;
    }

    /**
     * 消息状态，0-已删除，1-正常，默认为1
     * @return state 消息状态，0-已删除，1-正常，默认为1
     */
    public String getState() {
        return state;
    }

    /**
     * 消息状态，0-已删除，1-正常，默认为1
     * @param state 消息状态，0-已删除，1-正常，默认为1
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}