package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.GroupMemberGrouping;

public interface GroupMemberGroupingMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupMemberGrouping);

    /**
     *
     * @mbggenerated
     */
    int insert(GroupMemberGrouping record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GroupMemberGrouping record);

    /**
     *
     * @mbggenerated
     */
    GroupMemberGrouping selectByPrimaryKey(Long groupMemberGrouping);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupMemberGrouping record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupMemberGrouping record);
}