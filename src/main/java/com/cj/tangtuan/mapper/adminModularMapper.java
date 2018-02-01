package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.adminModular;

public interface adminModularMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(adminModular record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(adminModular record);

    /**
     *
     * @mbggenerated
     */
    adminModular selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(adminModular record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(adminModular record);
}