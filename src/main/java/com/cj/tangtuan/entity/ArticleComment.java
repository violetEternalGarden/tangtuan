package com.cj.tangtuan.entity;

import java.util.Date;

public class ArticleComment {
    /**
     * 文章回复消息表
     */
    private Long arCommentId;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 回复消息内容
     */
    private String content;

    /**
     * 回复时间
     */
    private Date createTime;

    /**
     * 删除回复时间
     */
    private Date deleteTieme;

    /**
     * 删除者类型，1-自己，2-文章作者，3-管理员
     */
    private String delType;

    /**
     * 删除者ID
     */
    private Long delId;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 文章回复消息表
     * @return ar_comment_id 文章回复消息表
     */
    public Long getArCommentId() {
        return arCommentId;
    }

    /**
     * 文章回复消息表
     * @param arCommentId 文章回复消息表
     */
    public void setArCommentId(Long arCommentId) {
        this.arCommentId = arCommentId;
    }

    /**
     * 文章ID
     * @return article_id 文章ID
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * 文章ID
     * @param articleId 文章ID
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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
     * 回复消息内容
     * @return content 回复消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 回复消息内容
     * @param content 回复消息内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * 回复时间
     * @return create_time 回复时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 回复时间
     * @param createTime 回复时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 删除回复时间
     * @return delete_tieme 删除回复时间
     */
    public Date getDeleteTieme() {
        return deleteTieme;
    }

    /**
     * 删除回复时间
     * @param deleteTieme 删除回复时间
     */
    public void setDeleteTieme(Date deleteTieme) {
        this.deleteTieme = deleteTieme;
    }

    /**
     * 删除者类型，1-自己，2-文章作者，3-管理员
     * @return del_type 删除者类型，1-自己，2-文章作者，3-管理员
     */
    public String getDelType() {
        return delType;
    }

    /**
     * 删除者类型，1-自己，2-文章作者，3-管理员
     * @param delType 删除者类型，1-自己，2-文章作者，3-管理员
     */
    public void setDelType(String delType) {
        this.delType = delType == null ? null : delType.trim();
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