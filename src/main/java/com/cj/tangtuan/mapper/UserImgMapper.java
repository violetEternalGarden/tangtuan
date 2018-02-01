package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.UserImg;

public interface UserImgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userImgId);

    /**
     *
     * @mbggenerated
     */
    int insert(UserImg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(UserImg record);

    /**
     *
     * @mbggenerated
     */
    UserImg selectByPrimaryKey(Long userImgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserImg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserImg record);
}