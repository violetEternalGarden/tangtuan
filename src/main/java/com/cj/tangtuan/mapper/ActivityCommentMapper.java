package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ActivityComment;

public interface ActivityCommentMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long acCommentId);

    /**
     *
     * @mbggenerated
     */
    int insert(ActivityComment record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ActivityComment record);

    /**
     *
     * @mbggenerated
     */
    ActivityComment selectByPrimaryKey(Long acCommentId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ActivityComment record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ActivityComment record);
}