package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Lable;

public interface LableMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long lableId);

    /**
     *
     * @mbggenerated
     */
    int insert(Lable record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Lable record);

    /**
     *
     * @mbggenerated
     */
    Lable selectByPrimaryKey(Long lableId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Lable record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Lable record);
}