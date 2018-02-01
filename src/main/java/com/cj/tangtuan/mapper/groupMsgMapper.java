package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.GroupMsg;

public interface GroupMsgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupMsgId);

    /**
     *
     * @mbggenerated
     */
    int insert(GroupMsg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GroupMsg record);

    /**
     *
     * @mbggenerated
     */
    GroupMsg selectByPrimaryKey(Long groupMsgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupMsg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupMsg record);
}