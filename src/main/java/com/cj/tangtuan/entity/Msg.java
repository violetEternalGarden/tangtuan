package com.cj.tangtuan.entity;

import java.util.Date;

public class Msg {
    /**
     * 消息表，用户的动态、评论、转发信息
     */
    private Long msgId;

    /**
     * 群号，发群动态才使用
     */
    private Long groupNum;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 消息内容
     */
    private String content;

    /**
     * 0-原创，1-评论，2-转发
     */
    private String type;

    /**
     * 评论过的数量
     */
    private Integer commentedCount;

    /**
     * 转发过的数量
     */
    private Integer transferredCount;

    /**
     * 阅读次数
     */
    private Integer readnumCount;

    /**
     * 赞同次数
     */
    private Integer agreenumCount;

    /**
     * 当前评论次数
     */
    private Integer commentCount;

    /**
     * 当前转发次数
     */
    private Integer transferCount;

    /**
     * 收藏次数
     */
    private Integer collectnumCount;

    /**
     * 发布时间
     */
    private Date createTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 删除者类型，1-自己，2-消息作者，3-管理员
     */
    private String delState;

    /**
     * 删除者ID
     */
    private Long delId;

    /**
     * 删除原因，管理员删除才填
     */
    private String delReason;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 消息表，用户的动态、评论、转发信息
     * @return msg_id 消息表，用户的动态、评论、转发信息
     */
    public Long getMsgId() {
        return msgId;
    }

    /**
     * 消息表，用户的动态、评论、转发信息
     * @param msgId 消息表，用户的动态、评论、转发信息
     */
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    /**
     * 群号，发群动态才使用
     * @return group_num 群号，发群动态才使用
     */
    public Long getGroupNum() {
        return groupNum;
    }

    /**
     * 群号，发群动态才使用
     * @param groupNum 群号，发群动态才使用
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
     * @return content 消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 消息内容
     * @param content 消息内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 0-原创，1-评论，2-转发
     * @return type 0-原创，1-评论，2-转发
     */
    public String getType() {
        return type;
    }

    /**
     * 0-原创，1-评论，2-转发
     * @param type 0-原创，1-评论，2-转发
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 评论过的数量
     * @return commented_count 评论过的数量
     */
    public Integer getCommentedCount() {
        return commentedCount;
    }

    /**
     * 评论过的数量
     * @param commentedCount 评论过的数量
     */
    public void setCommentedCount(Integer commentedCount) {
        this.commentedCount = commentedCount;
    }

    /**
     * 转发过的数量
     * @return transferred_count 转发过的数量
     */
    public Integer getTransferredCount() {
        return transferredCount;
    }

    /**
     * 转发过的数量
     * @param transferredCount 转发过的数量
     */
    public void setTransferredCount(Integer transferredCount) {
        this.transferredCount = transferredCount;
    }

    /**
     * 阅读次数
     * @return readnum_count 阅读次数
     */
    public Integer getReadnumCount() {
        return readnumCount;
    }

    /**
     * 阅读次数
     * @param readnumCount 阅读次数
     */
    public void setReadnumCount(Integer readnumCount) {
        this.readnumCount = readnumCount;
    }

    /**
     * 赞同次数
     * @return agreenum_count 赞同次数
     */
    public Integer getAgreenumCount() {
        return agreenumCount;
    }

    /**
     * 赞同次数
     * @param agreenumCount 赞同次数
     */
    public void setAgreenumCount(Integer agreenumCount) {
        this.agreenumCount = agreenumCount;
    }

    /**
     * 当前评论次数
     * @return comment_count 当前评论次数
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 当前评论次数
     * @param commentCount 当前评论次数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 当前转发次数
     * @return transfer_count 当前转发次数
     */
    public Integer getTransferCount() {
        return transferCount;
    }

    /**
     * 当前转发次数
     * @param transferCount 当前转发次数
     */
    public void setTransferCount(Integer transferCount) {
        this.transferCount = transferCount;
    }

    /**
     * 收藏次数
     * @return collectnum_count 收藏次数
     */
    public Integer getCollectnumCount() {
        return collectnumCount;
    }

    /**
     * 收藏次数
     * @param collectnumCount 收藏次数
     */
    public void setCollectnumCount(Integer collectnumCount) {
        this.collectnumCount = collectnumCount;
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
     * 删除者类型，1-自己，2-消息作者，3-管理员
     * @return del_state 删除者类型，1-自己，2-消息作者，3-管理员
     */
    public String getDelState() {
        return delState;
    }

    /**
     * 删除者类型，1-自己，2-消息作者，3-管理员
     * @param delState 删除者类型，1-自己，2-消息作者，3-管理员
     */
    public void setDelState(String delState) {
        this.delState = delState == null ? null : delState.trim();
    }

    /**
     * 删除者ID
     * @return del_id 删除者ID
     */
    public Long getDelId() {
        return delId;
    }

    /**
     * 删除者ID
     * @param delId 删除者ID
     */
    public void setDelId(Long delId) {
        this.delId = delId;
    }

    /**
     * 删除原因，管理员删除才填
     * @return del_reason 删除原因，管理员删除才填
     */
    public String getDelReason() {
        return delReason;
    }

    /**
     * 删除原因，管理员删除才填
     * @param delReason 删除原因，管理员删除才填
     */
    public void setDelReason(String delReason) {
        this.delReason = delReason == null ? null : delReason.trim();
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