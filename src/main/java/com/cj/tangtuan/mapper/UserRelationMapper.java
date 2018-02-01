package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.UserRelation;

public interface UserRelationMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userRelationId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserRelation record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserRelation record);

    /**
     *
     * @mbggenerated
     */
    UserRelation selectByPrimaryKey(Long userRelationId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserRelation record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserRelation record);
}