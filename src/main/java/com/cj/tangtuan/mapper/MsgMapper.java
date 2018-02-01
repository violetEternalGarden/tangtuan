package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Msg;

public interface MsgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long msgId);

    /**
     *
     * @mbggenerated
     */
    int insert(Msg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Msg record);

    /**
     *
     * @mbggenerated
     */
    Msg selectByPrimaryKey(Long msgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Msg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Msg record);
}