package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.AdminRole;

public interface AdminRoleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(AdminRole record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AdminRole record);

    /**
     *
     * @mbggenerated
     */
    AdminRole selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdminRole record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdminRole record);
}