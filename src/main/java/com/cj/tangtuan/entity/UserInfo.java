package com.cj.tangtuan.entity;

import java.math.BigDecimal;

public class UserInfo {
    /**
     * 用户信息扩展表
     */
    private Long userInfoId;

    /**
     * 用户ID，user表主键
     */
    private Long userId;

    /**
     * 姓名
     */
    private String userFull;

    /**
     * 性别，1-男，2-女
     */
    private String userSex;

    /**
     * 昵称
     */
    private String userNike;

    /**
     * 头像地址
     */
    private String userHead;

    /**
     * 身份证号码
     */
    private String userCard;

    /**
     * 身份证正面地址
     */
    private String cardPositive;

    /**
     * 身份证反面地址
     */
    private String cardOpposite;

    /**
     * 身份证正面手持地址
     */
    private String cardPositiveHold;

    /**
     * 身份证反面手持地址
     */
    private String cardOppositeHold;

    /**
     * 用户检验视频地址
     */
    private String userCheckVideo;

    /**
     * 生日
     */
    private String userBirthday;

    /**
     * 剩余总积分
     */
    private Long userIntegral;

    /**
     * 总余额
     */
    private BigDecimal userBalance;

    /**
     * 支付密码
     */
    private String userPayPass;

    /**
     * 粉丝数量
     */
    private Integer fansCount;

    /**
     * 关注数量
     */
    private Integer followCount;

    /**
     * 发布消息数量
     */
    private Integer msgCount;

    /**
     * 用户信息扩展表
     * @return user_info_id 用户信息扩展表
     */
    public Long getUserInfoId() {
        return userInfoId;
    }

    /**
     * 用户信息扩展表
     * @param userInfoId 用户信息扩展表
     */
    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    /**
     * 用户ID，user表主键
     * @return user_id 用户ID，user表主键
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID，user表主键
     * @param userId 用户ID，user表主键
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 姓名
     * @return user_full 姓名
     */
    public String getUserFull() {
        return userFull;
    }

    /**
     * 姓名
     * @param userFull 姓名
     */
    public void setUserFull(String userFull) {
        this.userFull = userFull == null ? null : userFull.trim();
    }

    /**
     * 性别，1-男，2-女
     * @return user_sex 性别，1-男，2-女
     */
    public String getUserSex() {
        return userSex;
    }

    /**
     * 性别，1-男，2-女
     * @param userSex 性别，1-男，2-女
     */
    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    /**
     * 昵称
     * @return user_nike 昵称
     */
    public String getUserNike() {
        return userNike;
    }

    /**
     * 昵称
     * @param userNike 昵称
     */
    public void setUserNike(String userNike) {
        this.userNike = userNike == null ? null : userNike.trim();
    }

    /**
     * 头像地址
     * @return user_head 头像地址
     */
    public String getUserHead() {
        return userHead;
    }

    /**
     * 头像地址
     * @param userHead 头像地址
     */
    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    /**
     * 身份证号码
     * @return user_card 身份证号码
     */
    public String getUserCard() {
        return userCard;
    }

    /**
     * 身份证号码
     * @param userCard 身份证号码
     */
    public void setUserCard(String userCard) {
        this.userCard = userCard == null ? null : userCard.trim();
    }

    /**
     * 身份证正面地址
     * @return card_positive 身份证正面地址
     */
    public String getCardPositive() {
        return cardPositive;
    }

    /**
     * 身份证正面地址
     * @param cardPositive 身份证正面地址
     */
    public void setCardPositive(String cardPositive) {
        this.cardPositive = cardPositive == null ? null : cardPositive.trim();
    }

    /**
     * 身份证反面地址
     * @return card_opposite 身份证反面地址
     */
    public String getCardOpposite() {
        return cardOpposite;
    }

    /**
     * 身份证反面地址
     * @param cardOpposite 身份证反面地址
     */
    public void setCardOpposite(String cardOpposite) {
        this.cardOpposite = cardOpposite == null ? null : cardOpposite.trim();
    }

    /**
     * 身份证正面手持地址
     * @return card_positive_hold 身份证正面手持地址
     */
    public String getCardPositiveHold() {
        return cardPositiveHold;
    }

    /**
     * 身份证正面手持地址
     * @param cardPositiveHold 身份证正面手持地址
     */
    public void setCardPositiveHold(String cardPositiveHold) {
        this.cardPositiveHold = cardPositiveHold == null ? null : cardPositiveHold.trim();
    }

    /**
     * 身份证反面手持地址
     * @return card_opposite_hold 身份证反面手持地址
     */
    public String getCardOppositeHold() {
        return cardOppositeHold;
    }

    /**
     * 身份证反面手持地址
     * @param cardOppositeHold 身份证反面手持地址
     */
    public void setCardOppositeHold(String cardOppositeHold) {
        this.cardOppositeHold = cardOppositeHold == null ? null : cardOppositeHold.trim();
    }

    /**
     * 用户检验视频地址
     * @return user_check_video 用户检验视频地址
     */
    public String getUserCheckVideo() {
        return userCheckVideo;
    }

    /**
     * 用户检验视频地址
     * @param userCheckVideo 用户检验视频地址
     */
    public void setUserCheckVideo(String userCheckVideo) {
        this.userCheckVideo = userCheckVideo == null ? null : userCheckVideo.trim();
    }

    /**
     * 生日
     * @return user_birthday 生日
     */
    public String getUserBirthday() {
        return userBirthday;
    }

    /**
     * 生日
     * @param userBirthday 生日
     */
    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday == null ? null : userBirthday.trim();
    }

    /**
     * 剩余总积分
     * @return user_integral 剩余总积分
     */
    public Long getUserIntegral() {
        return userIntegral;
    }

    /**
     * 剩余总积分
     * @param userIntegral 剩余总积分
     */
    public void setUserIntegral(Long userIntegral) {
        this.userIntegral = userIntegral;
    }

    /**
     * 总余额
     * @return user_balance 总余额
     */
    public BigDecimal getUserBalance() {
        return userBalance;
    }

    /**
     * 总余额
     * @param userBalance 总余额
     */
    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    /**
     * 支付密码
     * @return user_pay_pass 支付密码
     */
    public String getUserPayPass() {
        return userPayPass;
    }

    /**
     * 支付密码
     * @param userPayPass 支付密码
     */
    public void setUserPayPass(String userPayPass) {
        this.userPayPass = userPayPass == null ? null : userPayPass.trim();
    }

    /**
     * 粉丝数量
     * @return fans_count 粉丝数量
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * 粉丝数量
     * @param fansCount 粉丝数量
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * 关注数量
     * @return follow_count 关注数量
     */
    public Integer getFollowCount() {
        return followCount;
    }

    /**
     * 关注数量
     * @param followCount 关注数量
     */
    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    /**
     * 发布消息数量
     * @return msg_count 发布消息数量
     */
    public Integer getMsgCount() {
        return msgCount;
    }

    /**
     * 发布消息数量
     * @param msgCount 发布消息数量
     */
    public void setMsgCount(Integer msgCount) {
        this.msgCount = msgCount;
    }
}