package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.DqArea;

public interface DqAreaMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(DqArea record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(DqArea record);

    /**
     *
     * @mbggenerated
     */
    DqArea selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DqArea record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DqArea record);
}