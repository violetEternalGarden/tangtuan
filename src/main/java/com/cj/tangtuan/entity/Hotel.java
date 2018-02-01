package com.cj.tangtuan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Hotel {
    /**
     * 温泉镇信息表
     */
    private Long hotelId;

    /**
     * 温泉镇名称
     */
    private String hotelName;

    /**
     * 温泉镇描述
     */
    private String hotelDescribe;

    /**
     * 省编号
     */
    private String provinceId;

    /**
     * 市编号
     */
    private String cityId;

    /**
     * 区县编号
     */
    private String areaId;

    /**
     * 详细地址
     */
    private String detailedAddress;

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
     * 创建者ID
     */
    private Long crtAdminId;

    /**
     * 删除时间
     */
    private Date deleteTime;

    /**
     * 删除者ID
     */
    private Long delAdminId;

    /**
     * 状态，0-已删除，1-正常，默认为1
     */
    private String state;

    /**
     * 温泉镇信息表
     * @return hotel_id 温泉镇信息表
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * 温泉镇信息表
     * @param hotelId 温泉镇信息表
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 温泉镇名称
     * @return hotel_name 温泉镇名称
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 温泉镇名称
     * @param hotelName 温泉镇名称
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    /**
     * 温泉镇描述
     * @return hotel_describe 温泉镇描述
     */
    public String getHotelDescribe() {
        return hotelDescribe;
    }

    /**
     * 温泉镇描述
     * @param hotelDescribe 温泉镇描述
     */
    public void setHotelDescribe(String hotelDescribe) {
        this.hotelDescribe = hotelDescribe == null ? null : hotelDescribe.trim();
    }

    /**
     * 省编号
     * @return province_id 省编号
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 省编号
     * @param provinceId 省编号
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 市编号
     * @return city_id 市编号
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 市编号
     * @param cityId 市编号
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 区县编号
     * @return area_id 区县编号
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 区县编号
     * @param areaId 区县编号
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * 详细地址
     * @return detailed_address 详细地址
     */
    public String getDetailedAddress() {
        return detailedAddress;
    }

    /**
     * 详细地址
     * @param detailedAddress 详细地址
     */
    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
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
     * 创建者ID
     * @return crt_admin_id 创建者ID
     */
    public Long getCrtAdminId() {
        return crtAdminId;
    }

    /**
     * 创建者ID
     * @param crtAdminId 创建者ID
     */
    public void setCrtAdminId(Long crtAdminId) {
        this.crtAdminId = crtAdminId;
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
     * 删除者ID
     * @return del_admin_id 删除者ID
     */
    public Long getDelAdminId() {
        return delAdminId;
    }

    /**
     * 删除者ID
     * @param delAdminId 删除者ID
     */
    public void setDelAdminId(Long delAdminId) {
        this.delAdminId = delAdminId;
    }

    /**
     * 状态，0-已删除，1-正常，默认为1
     * @return state 状态，0-已删除，1-正常，默认为1
     */
    public String getState() {
        return state;
    }

    /**
     * 状态，0-已删除，1-正常，默认为1
     * @param state 状态，0-已删除，1-正常，默认为1
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}