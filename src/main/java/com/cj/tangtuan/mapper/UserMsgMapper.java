package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.UserMsg;

public interface UserMsgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userMsgId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserMsg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserMsg record);

    /**
     *
     * @mbggenerated
     */
    UserMsg selectByPrimaryKey(Long userMsgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserMsg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserMsg record);
}