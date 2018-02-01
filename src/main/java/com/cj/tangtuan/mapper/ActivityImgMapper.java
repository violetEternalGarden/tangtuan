package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ActivityImg;

public interface ActivityImgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long aiId);

    /**
     *
     * @mbggenerated
     */
    int insert(ActivityImg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ActivityImg record);

    /**
     *
     * @mbggenerated
     */
    ActivityImg selectByPrimaryKey(Long aiId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityImg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityImg record);
}