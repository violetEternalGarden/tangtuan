package com.cj.tangtuan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Group {
    /**
     * 圈子列表（群）
     */
    private Long groupId;

    /**
     * 群号
     */
    private Long groupNum;

    /**
     * 名称
     */
    private Long groupName;

    /**
     * 描述
     */
    private String groupDescribe;

    /**
     * 背景图
     */
    private String groupBackground;

    /**
     * 成员数量
     */
    private Integer memberNum;

    /**
     * 动态数（帖子数）
     */
    private Integer msgNum;

    /**
     * 创始人ID
     */
    private Long userId;

    /**
     * 创始人昵称
     */
    private String userNike;

    /**
     * 创始人头像
     */
    private String userHead;

    /**
     * 省ID
     */
    private String provinceId;

    /**
     * 市ID
     */
    private String cityId;

    /**
     * 区县ID
     */
    private String areaId;

    /**
     * 群详细地址
     */
    private String activityAddress;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 纬度
     */
    private BigDecimal dimension;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 删除者分类，1-自己，3-管理员
     */
    private String delType;

    /**
     * 删除者ID
     */
    private Long delId;

    /**
     * 删除原因，管理员删除才填
     */
    private String delReason;

    /**
     * 1-加群不审核，2加群需管理员同意
     */
    private String auditingType;

    /**
     * 状态，0-已删除，1-正常
     */
    private String state;

    /**
     * 圈子列表（群）
     * @return group_id 圈子列表（群）
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 圈子列表（群）
     * @param groupId 圈子列表（群）
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 群号
     * @return group_num 群号
     */
    public Long getGroupNum() {
        return groupNum;
    }

    /**
     * 群号
     * @param groupNum 群号
     */
    public void setGroupNum(Long groupNum) {
        this.groupNum = groupNum;
    }

    /**
     * 名称
     * @return group_name 名称
     */
    public Long getGroupName() {
        return groupName;
    }

    /**
     * 名称
     * @param groupName 名称
     */
    public void setGroupName(Long groupName) {
        this.groupName = groupName;
    }

    /**
     * 描述
     * @return group_describe 描述
     */
    public String getGroupDescribe() {
        return groupDescribe;
    }

    /**
     * 描述
     * @param groupDescribe 描述
     */
    public void setGroupDescribe(String groupDescribe) {
        this.groupDescribe = groupDescribe == null ? null : groupDescribe.trim();
    }

    /**
     * 背景图
     * @return group_background 背景图
     */
    public String getGroupBackground() {
        return groupBackground;
    }

    /**
     * 背景图
     * @param groupBackground 背景图
     */
    public void setGroupBackground(String groupBackground) {
        this.groupBackground = groupBackground == null ? null : groupBackground.trim();
    }

    /**
     * 成员数量
     * @return member_num 成员数量
     */
    public Integer getMemberNum() {
        return memberNum;
    }

    /**
     * 成员数量
     * @param memberNum 成员数量
     */
    public void setMemberNum(Integer memberNum) {
        this.memberNum = memberNum;
    }

    /**
     * 动态数（帖子数）
     * @return msg_num 动态数（帖子数）
     */
    public Integer getMsgNum() {
        return msgNum;
    }

    /**
     * 动态数（帖子数）
     * @param msgNum 动态数（帖子数）
     */
    public void setMsgNum(Integer msgNum) {
        this.msgNum = msgNum;
    }

    /**
     * 创始人ID
     * @return user_id 创始人ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 创始人ID
     * @param userId 创始人ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 创始人昵称
     * @return user_nike 创始人昵称
     */
    public String getUserNike() {
        return userNike;
    }

    /**
     * 创始人昵称
     * @param userNike 创始人昵称
     */
    public void setUserNike(String userNike) {
        this.userNike = userNike == null ? null : userNike.trim();
    }

    /**
     * 创始人头像
     * @return user_head 创始人头像
     */
    public String getUserHead() {
        return userHead;
    }

    /**
     * 创始人头像
     * @param userHead 创始人头像
     */
    public void setUserHead(String userHead) {
        this.userHead = userHead == null ? null : userHead.trim();
    }

    /**
     * 省ID
     * @return province_id 省ID
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 省ID
     * @param provinceId 省ID
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 市ID
     * @return city_id 市ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 市ID
     * @param cityId 市ID
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 区县ID
     * @return area_id 区县ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 区县ID
     * @param areaId 区县ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * 群详细地址
     * @return activity_address 群详细地址
     */
    public String getActivityAddress() {
        return activityAddress;
    }

    /**
     * 群详细地址
     * @param activityAddress 群详细地址
     */
    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress == null ? null : activityAddress.trim();
    }

    /**
     * 经度
     * @return longitude 经度
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * 经度
     * @param longitude 经度
     */
    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    /**
     * 纬度
     * @return dimension 纬度
     */
    public BigDecimal getDimension() {
        return dimension;
    }

    /**
     * 纬度
     * @param dimension 纬度
     */
    public void setDimension(BigDecimal dimension) {
        this.dimension = dimension;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
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
     * 删除者分类，1-自己，3-管理员
     * @return del_type 删除者分类，1-自己，3-管理员
     */
    public String getDelType() {
        return delType;
    }

    /**
     * 删除者分类，1-自己，3-管理员
     * @param delType 删除者分类，1-自己，3-管理员
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
     * 1-加群不审核，2加群需管理员同意
     * @return auditing_type 1-加群不审核，2加群需管理员同意
     */
    public String getAuditingType() {
        return auditingType;
    }

    /**
     * 1-加群不审核，2加群需管理员同意
     * @param auditingType 1-加群不审核，2加群需管理员同意
     */
    public void setAuditingType(String auditingType) {
        this.auditingType = auditingType == null ? null : auditingType.trim();
    }

    /**
     * 状态，0-已删除，1-正常
     * @return state 状态，0-已删除，1-正常
     */
    public String getState() {
        return state;
    }

    /**
     * 状态，0-已删除，1-正常
     * @param state 状态，0-已删除，1-正常
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}