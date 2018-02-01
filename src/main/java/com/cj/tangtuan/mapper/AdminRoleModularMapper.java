package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.AdminRoleModular;

public interface AdminRoleModularMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(AdminRoleModular record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(AdminRoleModular record);

    /**
     *
     * @mbggenerated
     */
    AdminRoleModular selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AdminRoleModular record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AdminRoleModular record);
}