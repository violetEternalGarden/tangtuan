package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.User;

public interface UserMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated
     */
    int insert(User record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated
     */
    User selectByPrimaryKey(Long userId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(User record);
}