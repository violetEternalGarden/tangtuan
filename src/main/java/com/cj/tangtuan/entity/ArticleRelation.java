package com.cj.tangtuan.entity;

public class ArticleRelation {
    /**
     * 文章评论关系表
     */
    private Long articleRelationId;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 文章回复消息ID
     */
    private Long arCommentId;

    /**
     * 文章回复用户ID
     */
    private Long userId;

    /**
     * 文章回复父级消息ID
     */
    private Long arCommentedId;

    /**
     * 父级消息发表者ID
     */
    private Long useredId;

    /**
     * 文章评论关系表
     * @return article_relation_id 文章评论关系表
     */
    public Long getArticleRelationId() {
        return articleRelationId;
    }

    /**
     * 文章评论关系表
     * @param articleRelationId 文章评论关系表
     */
    public void setArticleRelationId(Long articleRelationId) {
        this.articleRelationId = articleRelationId;
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
     * 文章回复消息ID
     * @return ar_comment_id 文章回复消息ID
     */
    public Long getArCommentId() {
        return arCommentId;
    }

    /**
     * 文章回复消息ID
     * @param arCommentId 文章回复消息ID
     */
    public void setArCommentId(Long arCommentId) {
        this.arCommentId = arCommentId;
    }

    /**
     * 文章回复用户ID
     * @return user_id 文章回复用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 文章回复用户ID
     * @param userId 文章回复用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 文章回复父级消息ID
     * @return ar_commented_id 文章回复父级消息ID
     */
    public Long getArCommentedId() {
        return arCommentedId;
    }

    /**
     * 文章回复父级消息ID
     * @param arCommentedId 文章回复父级消息ID
     */
    public void setArCommentedId(Long arCommentedId) {
        this.arCommentedId = arCommentedId;
    }

    /**
     * 父级消息发表者ID
     * @return usered_id 父级消息发表者ID
     */
    public Long getUseredId() {
        return useredId;
    }

    /**
     * 父级消息发表者ID
     * @param useredId 父级消息发表者ID
     */
    public void setUseredId(Long useredId) {
        this.useredId = useredId;
    }
}