package com.cj.tangtuan.entity;

import java.math.BigDecimal;

public class UserPosition {
    /**
     * 用户位置信息表
     */
    private Long userPositionId;

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
     * 详细地址
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
     * 用户位置信息表
     * @return user_position_id 用户位置信息表
     */
    public Long getUserPositionId() {
        return userPositionId;
    }

    /**
     * 用户位置信息表
     * @param userPositionId 用户位置信息表
     */
    public void setUserPositionId(Long userPositionId) {
        this.userPositionId = userPositionId;
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
     * 详细地址
     * @return activity_address 详细地址
     */
    public String getActivityAddress() {
        return activityAddress;
    }

    /**
     * 详细地址
     * @param activityAddress 详细地址
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
}