package com.cj.tangtuan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Activity {
    /**
     * 活动表
     */
    private Long activityId;

    /**
     * 管理员ID(活动创建人)
     */
    private Long adminId;

    /**
     * 用户ID(活动创建人)
     */
    private Long userId;

    /**
     * 活动标题
     */
    private String activityTitle;

    /**
     * 活动内容
     */
    private String activityContent;

    /**
     * 活动费用（价格）
     */
    private BigDecimal activityCost;

    /**
     * 地址省ID
     */
    private String provinceId;

    /**
     * 地址城市ID
     */
    private String cityId;

    /**
     * 地址区县ID
     */
    private String areaId;

    /**
     * 温泉镇ID
     */
    private Long hotSpringId;

    /**
     * 活动详细地址
     */
    private String activityAddress;

    /**
     * 集合地址
     */
    private String aggregateAddress;

    /**
     * 经度
     */
    private BigDecimal longitude;

    /**
     * 维度
     */
    private BigDecimal dimension;

    /**
     * 路线指引
     */
    private String activityGuide;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 报名结束时间
     */
    private Date signUpEndTime;

    /**
     * 人数
     */
    private Integer peopleNum;

    /**
     * 主办方
     */
    private String activitySponsor;

    /**
     * 联系电话
     */
    private String contactNumber;

    /**
     * 评论次数
     */
    private Integer commentCount;

    /**
     * 赞同次数
     */
    private Integer agreenumCount;

    /**
     * 报名状态，0-已结束，1-报名中，默认为1
     */
    private String singUpState;

    /**
     * 活动创建时间
     */
    private Date createTime;

    /**
     * 活动删除时间
     */
    private Date deleteTime;

    /**
     * 删除者类型，1-自己，3-管理员
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
     * 活动状态，0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 活动表
     * @return activity_id 活动表
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 活动表
     * @param activityId 活动表
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 管理员ID(活动创建人)
     * @return admin_id 管理员ID(活动创建人)
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 管理员ID(活动创建人)
     * @param adminId 管理员ID(活动创建人)
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * 用户ID(活动创建人)
     * @return user_id 用户ID(活动创建人)
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID(活动创建人)
     * @param userId 用户ID(活动创建人)
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 活动标题
     * @return activity_title 活动标题
     */
    public String getActivityTitle() {
        return activityTitle;
    }

    /**
     * 活动标题
     * @param activityTitle 活动标题
     */
    public void setActivityTitle(String activityTitle) {
        this.activityTitle = activityTitle == null ? null : activityTitle.trim();
    }

    /**
     * 活动内容
     * @return activity_content 活动内容
     */
    public String getActivityContent() {
        return activityContent;
    }

    /**
     * 活动内容
     * @param activityContent 活动内容
     */
    public void setActivityContent(String activityContent) {
        this.activityContent = activityContent == null ? null : activityContent.trim();
    }

    /**
     * 活动费用（价格）
     * @return activity_cost 活动费用（价格）
     */
    public BigDecimal getActivityCost() {
        return activityCost;
    }

    /**
     * 活动费用（价格）
     * @param activityCost 活动费用（价格）
     */
    public void setActivityCost(BigDecimal activityCost) {
        this.activityCost = activityCost;
    }

    /**
     * 地址省ID
     * @return province_id 地址省ID
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 地址省ID
     * @param provinceId 地址省ID
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 地址城市ID
     * @return city_id 地址城市ID
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 地址城市ID
     * @param cityId 地址城市ID
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 地址区县ID
     * @return area_id 地址区县ID
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 地址区县ID
     * @param areaId 地址区县ID
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * 温泉镇ID
     * @return hot_spring_id 温泉镇ID
     */
    public Long getHotSpringId() {
        return hotSpringId;
    }

    /**
     * 温泉镇ID
     * @param hotSpringId 温泉镇ID
     */
    public void setHotSpringId(Long hotSpringId) {
        this.hotSpringId = hotSpringId;
    }

    /**
     * 活动详细地址
     * @return activity_address 活动详细地址
     */
    public String getActivityAddress() {
        return activityAddress;
    }

    /**
     * 活动详细地址
     * @param activityAddress 活动详细地址
     */
    public void setActivityAddress(String activityAddress) {
        this.activityAddress = activityAddress == null ? null : activityAddress.trim();
    }

    /**
     * 集合地址
     * @return aggregate_address 集合地址
     */
    public String getAggregateAddress() {
        return aggregateAddress;
    }

    /**
     * 集合地址
     * @param aggregateAddress 集合地址
     */
    public void setAggregateAddress(String aggregateAddress) {
        this.aggregateAddress = aggregateAddress == null ? null : aggregateAddress.trim();
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
     * 维度
     * @return dimension 维度
     */
    public BigDecimal getDimension() {
        return dimension;
    }

    /**
     * 维度
     * @param dimension 维度
     */
    public void setDimension(BigDecimal dimension) {
        this.dimension = dimension;
    }

    /**
     * 路线指引
     * @return activity_guide 路线指引
     */
    public String getActivityGuide() {
        return activityGuide;
    }

    /**
     * 路线指引
     * @param activityGuide 路线指引
     */
    public void setActivityGuide(String activityGuide) {
        this.activityGuide = activityGuide == null ? null : activityGuide.trim();
    }

    /**
     * 开始时间
     * @return start_time 开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 开始时间
     * @param startTime 开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 结束时间
     * @return end_time 结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 结束时间
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 报名结束时间
     * @return sign_up_end_time 报名结束时间
     */
    public Date getSignUpEndTime() {
        return signUpEndTime;
    }

    /**
     * 报名结束时间
     * @param signUpEndTime 报名结束时间
     */
    public void setSignUpEndTime(Date signUpEndTime) {
        this.signUpEndTime = signUpEndTime;
    }

    /**
     * 人数
     * @return people_num 人数
     */
    public Integer getPeopleNum() {
        return peopleNum;
    }

    /**
     * 人数
     * @param peopleNum 人数
     */
    public void setPeopleNum(Integer peopleNum) {
        this.peopleNum = peopleNum;
    }

    /**
     * 主办方
     * @return activity_sponsor 主办方
     */
    public String getActivitySponsor() {
        return activitySponsor;
    }

    /**
     * 主办方
     * @param activitySponsor 主办方
     */
    public void setActivitySponsor(String activitySponsor) {
        this.activitySponsor = activitySponsor == null ? null : activitySponsor.trim();
    }

    /**
     * 联系电话
     * @return contact_number 联系电话
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 联系电话
     * @param contactNumber 联系电话
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    /**
     * 评论次数
     * @return comment_count 评论次数
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * 评论次数
     * @param commentCount 评论次数
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
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
     * 报名状态，0-已结束，1-报名中，默认为1
     * @return sing_up_state 报名状态，0-已结束，1-报名中，默认为1
     */
    public String getSingUpState() {
        return singUpState;
    }

    /**
     * 报名状态，0-已结束，1-报名中，默认为1
     * @param singUpState 报名状态，0-已结束，1-报名中，默认为1
     */
    public void setSingUpState(String singUpState) {
        this.singUpState = singUpState == null ? null : singUpState.trim();
    }

    /**
     * 活动创建时间
     * @return create_time 活动创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 活动创建时间
     * @param createTime 活动创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 活动删除时间
     * @return delete_time 活动删除时间
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * 活动删除时间
     * @param deleteTime 活动删除时间
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 删除者类型，1-自己，3-管理员
     * @return del_type 删除者类型，1-自己，3-管理员
     */
    public String getDelType() {
        return delType;
    }

    /**
     * 删除者类型，1-自己，3-管理员
     * @param delType 删除者类型，1-自己，3-管理员
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
     * 活动状态，0-已删除，1-正常，默认为1
     * @return state 活动状态，0-已删除，1-正常，默认为1
     */
    public String getState() {
        return state;
    }

    /**
     * 活动状态，0-已删除，1-正常，默认为1
     * @param state 活动状态，0-已删除，1-正常，默认为1
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}