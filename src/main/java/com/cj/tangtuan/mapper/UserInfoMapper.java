package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.UserInfo;

public interface UserInfoMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userInfoId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserInfo record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserInfo record);

    /**
     *
     * @mbggenerated
     */
    UserInfo selectByPrimaryKey(Long userInfoId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserInfo record);
}