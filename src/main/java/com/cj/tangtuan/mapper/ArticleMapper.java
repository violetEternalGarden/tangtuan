package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Article;

public interface ArticleMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long articleId);

    /**
     *
     * @mbggenerated
     */
    int insert(Article record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Article record);

    /**
     *
     * @mbggenerated
     */
    Article selectByPrimaryKey(Long articleId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Article record);
}