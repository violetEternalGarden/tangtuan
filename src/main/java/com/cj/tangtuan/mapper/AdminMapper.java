package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Admin;

public interface AdminMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int insert(Admin record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Admin record);

    /**
     *
     * @mbggenerated
     */
    Admin selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Admin record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Admin record);
}