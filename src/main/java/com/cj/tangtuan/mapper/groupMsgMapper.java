package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.groupMsg;

public interface groupMsgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupMsgId);

    /**
     *
     * @mbggenerated
     */
    int insert(groupMsg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(groupMsg record);

    /**
     *
     * @mbggenerated
     */
    groupMsg selectByPrimaryKey(Long groupMsgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(groupMsg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(groupMsg record);
}