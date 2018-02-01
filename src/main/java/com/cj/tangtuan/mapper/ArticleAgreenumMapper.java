package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ArticleAgreenum;

public interface ArticleAgreenumMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long articleAgreenumId);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleAgreenum record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleAgreenum record);

    /**
     *
     * @mbggenerated
     */
    ArticleAgreenum selectByPrimaryKey(Long articleAgreenumId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleAgreenum record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleAgreenum record);
}