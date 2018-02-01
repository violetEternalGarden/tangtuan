package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.ArticleCollectnum;

public interface ArticleCollectnumMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long articleCollectnumId);

    /**
     *
     * @mbggenerated
     */
    int insert(ArticleCollectnum record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(ArticleCollectnum record);

    /**
     *
     * @mbggenerated
     */
    ArticleCollectnum selectByPrimaryKey(Long articleCollectnumId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleCollectnum record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleCollectnum record);
}