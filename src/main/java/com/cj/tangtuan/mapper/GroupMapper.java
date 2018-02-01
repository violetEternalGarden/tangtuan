package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Group;

public interface GroupMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupId);

    /**
     *
     * @mbggenerated
     */
    int insert(Group record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Group record);

    /**
     *
     * @mbggenerated
     */
    Group selectByPrimaryKey(Long groupId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Group record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Group record);
}