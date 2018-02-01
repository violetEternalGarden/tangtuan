package com.cj.tangtuan.entity;

import java.util.Date;

public class Article {
    /**
     * 文章表
     */
    private Long articleId;

    /**
     * 温泉镇ID
     */
    private Long hotelId;

    /**
     * 文章标题
     */
    private String articleTitle;

    /**
     * 用户ID（发布者）
     */
    private Long userId;

    /**
     * 管理员ID（发布者）
     */
    private Long adminId;

    /**
     * 浏览次数
     */
    private Integer browseCount;

    /**
     * 回复次数
     */
    private Integer replyCount;

    /**
     * 收藏次数
     */
    private Integer collectnumCount;

    /**
     * 赞同次数
     */
    private Integer agreenumCount;

    /**
     * 发布时间
     */
    private Date createTime;

    /**
     * 删除时间
     */
    private Date delTime;

    /**
     * 删除者ID
     */
    private Long delId;

    /**
     * 0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 文章内容（富文本,最大16M）
     */
    private String articleContent;

    /**
     * 文章表
     * @return article_id 文章表
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * 文章表
     * @param articleId 文章表
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * 温泉镇ID
     * @return hotel_id 温泉镇ID
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * 温泉镇ID
     * @param hotelId 温泉镇ID
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 文章标题
     * @return article_title 文章标题
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 文章标题
     * @param articleTitle 文章标题
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * 用户ID（发布者）
     * @return user_id 用户ID（发布者）
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID（发布者）
     * @param userId 用户ID（发布者）
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 管理员ID（发布者）
     * @return admin_id 管理员ID（发布者）
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 管理员ID（发布者）
     * @param adminId 管理员ID（发布者）
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * 浏览次数
     * @return browse_count 浏览次数
     */
    public Integer getBrowseCount() {
        return browseCount;
    }

    /**
     * 浏览次数
     * @param browseCount 浏览次数
     */
    public void setBrowseCount(Integer browseCount) {
        this.browseCount = browseCount;
    }

    /**
     * 回复次数
     * @return reply_count 回复次数
     */
    public Integer getReplyCount() {
        return replyCount;
    }

    /**
     * 回复次数
     * @param replyCount 回复次数
     */
    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
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
     * @return del_time 删除时间
     */
    public Date getDelTime() {
        return delTime;
    }

    /**
     * 删除时间
     * @param delTime 删除时间
     */
    public void setDelTime(Date delTime) {
        this.delTime = delTime;
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

    /**
     * 文章内容（富文本,最大16M）
     * @return article_content 文章内容（富文本,最大16M）
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * 文章内容（富文本,最大16M）
     * @param articleContent 文章内容（富文本,最大16M）
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}