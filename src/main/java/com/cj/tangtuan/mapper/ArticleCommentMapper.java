package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ArticleComment;

public interface ArticleCommentMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long arCommentId);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleComment record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleComment record);

    /**
     *
     * @mbggenerated
     */
    ArticleComment selectByPrimaryKey(Long arCommentId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleComment record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleComment record);
}