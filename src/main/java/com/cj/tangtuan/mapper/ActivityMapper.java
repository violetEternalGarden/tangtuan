package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Activity;

public interface ActivityMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long activityId);

    /**
     *
     * @mbggenerated
     */
    int insert(Activity record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Activity record);

    /**
     *
     * @mbggenerated
     */
    Activity selectByPrimaryKey(Long activityId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Activity record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Activity record);
}