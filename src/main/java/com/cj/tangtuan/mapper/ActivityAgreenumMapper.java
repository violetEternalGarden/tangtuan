package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ActivityAgreenum;

public interface ActivityAgreenumMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long activityAgreenum);

    /**
     *
     * @mbggenerated
     */
    int insert(ActivityAgreenum record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ActivityAgreenum record);

    /**
     *
     * @mbggenerated
     */
    ActivityAgreenum selectByPrimaryKey(Long activityAgreenum);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityAgreenum record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityAgreenum record);
}