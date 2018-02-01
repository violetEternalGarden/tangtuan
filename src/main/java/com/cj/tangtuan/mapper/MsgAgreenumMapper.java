package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.MsgAgreenum;

public interface MsgAgreenumMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long msgAgreenumId);

    /**
     *
     * @mbggenerated
     */
    int insert(MsgAgreenum record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MsgAgreenum record);

    /**
     *
     * @mbggenerated
     */
    MsgAgreenum selectByPrimaryKey(Long msgAgreenumId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MsgAgreenum record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MsgAgreenum record);
}