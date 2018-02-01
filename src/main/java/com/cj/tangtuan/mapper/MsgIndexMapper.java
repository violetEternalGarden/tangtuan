package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.MsgIndex;

public interface MsgIndexMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long msgIndexId);

    /**
     *
     * @mbggenerated
     */
    int insert(MsgIndex record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MsgIndex record);

    /**
     *
     * @mbggenerated
     */
    MsgIndex selectByPrimaryKey(Long msgIndexId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MsgIndex record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MsgIndex record);
}