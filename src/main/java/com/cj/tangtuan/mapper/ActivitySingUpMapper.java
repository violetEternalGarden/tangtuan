package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ActivitySingUp;

public interface ActivitySingUpMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long asuId);

    /**
     *
     * @mbggenerated
     */
    int insert(ActivitySingUp record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ActivitySingUp record);

    /**
     *
     * @mbggenerated
     */
    ActivitySingUp selectByPrimaryKey(Long asuId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivitySingUp record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivitySingUp record);
}