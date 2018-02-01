package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ActivityLableRelation;

public interface ActivityLableRelationMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long alrId);

    /**
     *
     * @mbggenerated
     */
    int insert(ActivityLableRelation record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ActivityLableRelation record);

    /**
     *
     * @mbggenerated
     */
    ActivityLableRelation selectByPrimaryKey(Long alrId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityLableRelation record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityLableRelation record);
}