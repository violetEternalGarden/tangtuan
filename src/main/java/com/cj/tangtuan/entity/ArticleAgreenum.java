package com.cj.tangtuan.entity;

import java.util.Date;

public class ArticleAgreenum {
    /**
     * 文章赞同信息记录表
     */
    private Long articleAgreenumId;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 赞同时间
     */
    private Date createTime;

    /**
     * 文章赞同信息记录表
     * @return article_agreenum_id 文章赞同信息记录表
     */
    public Long getArticleAgreenumId() {
        return articleAgreenumId;
    }

    /**
     * 文章赞同信息记录表
     * @param articleAgreenumId 文章赞同信息记录表
     */
    public void setArticleAgreenumId(Long articleAgreenumId) {
        this.articleAgreenumId = articleAgreenumId;
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
     * 赞同时间
     * @return create_time 赞同时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 赞同时间
     * @param createTime 赞同时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}