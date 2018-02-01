package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ArticleRelation;

public interface ArticleRelationMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long articleRelationId);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleRelation record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleRelation record);

    /**
     *
     * @mbggenerated
     */
    ArticleRelation selectByPrimaryKey(Long articleRelationId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleRelation record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleRelation record);
}