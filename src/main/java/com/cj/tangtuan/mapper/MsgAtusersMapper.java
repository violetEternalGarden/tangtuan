package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.MsgAtusers;

public interface MsgAtusersMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long atusersId);

    /**
     *
     * @mbggenerated
     */
    int insert(MsgAtusers record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MsgAtusers record);

    /**
     *
     * @mbggenerated
     */
    MsgAtusers selectByPrimaryKey(Long atusersId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MsgAtusers record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MsgAtusers record);
}