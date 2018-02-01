package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ActivityRelation;

public interface ActivityRelationMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long activityRelationId);

    /**
     *
     * @mbggenerated
     */
    int insert(ActivityRelation record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ActivityRelation record);

    /**
     *
     * @mbggenerated
     */
    ActivityRelation selectByPrimaryKey(Long activityRelationId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityRelation record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityRelation record);
}