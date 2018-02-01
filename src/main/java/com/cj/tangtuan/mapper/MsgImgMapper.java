package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.MsgImg;

public interface MsgImgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long msgImgId);

    /**
     *
     * @mbggenerated
     */
    int insert(MsgImg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(MsgImg record);

    /**
     *
     * @mbggenerated
     */
    MsgImg selectByPrimaryKey(Long msgImgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MsgImg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MsgImg record);
}