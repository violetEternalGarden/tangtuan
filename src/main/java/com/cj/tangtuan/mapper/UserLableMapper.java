package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.UserLable;

public interface UserLableMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userLableId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserLable record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserLable record);

    /**
     *
     * @mbggenerated
     */
    UserLable selectByPrimaryKey(Long userLableId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserLable record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserLable record);
}