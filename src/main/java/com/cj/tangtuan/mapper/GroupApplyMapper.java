package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.GroupApply;

public interface GroupApplyMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupApply);

    /**
     *
     * @mbggenerated
     */
    int insert(GroupApply record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GroupApply record);

    /**
     *
     * @mbggenerated
     */
    GroupApply selectByPrimaryKey(Long groupApply);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupApply record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupApply record);
}