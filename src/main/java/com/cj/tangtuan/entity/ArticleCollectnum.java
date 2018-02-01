package com.cj.tangtuan.entity;

import java.util.Date;

public class ArticleCollectnum {
    /**
     * 文章收藏表
     */
    private Long articleCollectnumId;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 收藏时间
     */
    private Date createTime;

    /**
     * 删除收藏时间
     */
    private Date deleteTime;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 文章收藏表
     * @return article_collectnum_id 文章收藏表
     */
    public Long getArticleCollectnumId() {
        return articleCollectnumId;
    }

    /**
     * 文章收藏表
     * @param articleCollectnumId 文章收藏表
     */
    public void setArticleCollectnumId(Long articleCollectnumId) {
        this.articleCollectnumId = articleCollectnumId;
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
     * 收藏时间
     * @return create_time 收藏时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 收藏时间
     * @param createTime 收藏时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 删除收藏时间
     * @return delete_time 删除收藏时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 删除收藏时间
     * @param deleteTime 删除收藏时间
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