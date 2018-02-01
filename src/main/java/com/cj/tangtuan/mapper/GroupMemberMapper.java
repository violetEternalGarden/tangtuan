package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.GroupMember;

public interface GroupMemberMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupMember);

    /**
     *
     * @mbggenerated
     */
    int insert(GroupMember record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GroupMember record);

    /**
     *
     * @mbggenerated
     */
    GroupMember selectByPrimaryKey(Long groupMember);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupMember record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupMember record);
}