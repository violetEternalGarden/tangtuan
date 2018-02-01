package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.UserPosition;

public interface UserPositionMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userPositionId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserPosition record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserPosition record);

    /**
     *
     * @mbggenerated
     */
    UserPosition selectByPrimaryKey(Long userPositionId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserPosition record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserPosition record);
}