package com.cj.tangtuan.entity;

import java.util.Date;

public class MsgRelation {
    /**
     * 消息间关系表
     */
    private Long msgRelationId;

    /**
     * 引用消息用户编号，此msgID的userID
     */
    private Long referenceId;

    /**
     * 引用消息编号，msgID
     */
    private Long referenceMsgId;

    /**
     * 消息发布者编号，父级userID
     */
    private Long referencedId;

    /**
     * 被引用消息编号，父级msgID
     */
    private Long referencedMsgId;

    /**
     * 1-评论，2-转发
     */
    private String type;

    /**
     * 发布时间
     */
    private Date createTime;

    /**
     * 转发或者评论页码，为Transferred_count%page_count
     */
    private Integer pageIndex;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 消息间关系表
     * @return msg_relation_id 消息间关系表
     */
    public Long getMsgRelationId() {
        return msgRelationId;
    }

    /**
     * 消息间关系表
     * @param msgRelationId 消息间关系表
     */
    public void setMsgRelationId(Long msgRelationId) {
        this.msgRelationId = msgRelationId;
    }

    /**
     * 引用消息用户编号，此msgID的userID
     * @return reference_id 引用消息用户编号，此msgID的userID
     */
    public Long getReferenceId() {
        return referenceId;
    }

    /**
     * 引用消息用户编号，此msgID的userID
     * @param referenceId 引用消息用户编号，此msgID的userID
     */
    public void setReferenceId(Long referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * 引用消息编号，msgID
     * @return reference _msg_id 引用消息编号，msgID
     */
    public Long getReferenceMsgId() {
        return referenceMsgId;
    }

    /**
     * 引用消息编号，msgID
     * @param referenceMsgId 引用消息编号，msgID
     */
    public void setReferenceMsgId(Long referenceMsgId) {
        this.referenceMsgId = referenceMsgId;
    }

    /**
     * 消息发布者编号，父级userID
     * @return referenced_id 消息发布者编号，父级userID
     */
    public Long getReferencedId() {
        return referencedId;
    }

    /**
     * 消息发布者编号，父级userID
     * @param referencedId 消息发布者编号，父级userID
     */
    public void setReferencedId(Long referencedId) {
        this.referencedId = referencedId;
    }

    /**
     * 被引用消息编号，父级msgID
     * @return referenced _msg_id 被引用消息编号，父级msgID
     */
    public Long getReferencedMsgId() {
        return referencedMsgId;
    }

    /**
     * 被引用消息编号，父级msgID
     * @param referencedMsgId 被引用消息编号，父级msgID
     */
    public void setReferencedMsgId(Long referencedMsgId) {
        this.referencedMsgId = referencedMsgId;
    }

    /**
     * 1-评论，2-转发
     * @return type 1-评论，2-转发
     */
    public String getType() {
        return type;
    }

    /**
     * 1-评论，2-转发
     * @param type 1-评论，2-转发
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
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
     * 转发或者评论页码，为Transferred_count%page_count
     * @return page_index 转发或者评论页码，为Transferred_count%page_count
     */
    public Integer getPageIndex() {
        return pageIndex;
    }

    /**
     * 转发或者评论页码，为Transferred_count%page_count
     * @param pageIndex 转发或者评论页码，为Transferred_count%page_count
     */
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
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