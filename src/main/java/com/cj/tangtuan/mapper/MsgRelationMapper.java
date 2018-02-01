package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.MsgRelation;

public interface MsgRelationMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long msgRelationId);

    /**
     *
     * @mbggenerated
     */
    int insert(MsgRelation record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MsgRelation record);

    /**
     *
     * @mbggenerated
     */
    MsgRelation selectByPrimaryKey(Long msgRelationId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MsgRelation record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MsgRelation record);
}