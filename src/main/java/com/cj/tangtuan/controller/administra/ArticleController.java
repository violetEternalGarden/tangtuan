package com.cj.tangtuan.controller.administra;

/**
 * 文章信息管理
 */

public class ArticleController {


    /**
     * =================================文章基础信息
     */

    /**
     * 分页、分类查询文章信息
     * 参数：
     * 返回：文章信息展示页面
     */
    public Object findAllArticle(){
        return 0;
    }

    /**
     * 文章详情查询
     * 参数：文章ID
     * 返回：文章相关信息
     */
    public Object findArticle(){
        return 0;
    }

    /**
     * 发布文章
     * 参数：文章相关信息
     * 返回：是否成功
     */
    public Object addArticle(){
        return 0;
    }

    /**
     * 删除文章、删除后前端不在查询展示
     * 参数：文章ID
     * 返回：是否成功
     */
    public Object delArticle(){
        return 0;
    }

    /**
     * 修改文章
     * 参数：文章ID其他信息
     * 返回：是否成功
     */
    public Object updArticle(){
        return 0;
    }

    /**
     * =========================================文章收藏记录
     */

    /**
     * 文章收藏记录分页查询，从文章详情进入
     * 参数：文章ID
     * 返回：文章收藏信息展示页面
     */
    public Object findAllArticleCollectnum(){
        return 0;
    }

    /**
     * =======================================文章赞同记录
     */
    /**
     * 分页查询文章赞同记录信息，从文章详情进入
     * 参数：文章ID
     * 返回：文章赞同记录展示页面
     */
    public Object findAllArticleAgreenum(){
        return 0;
    }

    /**
     * ======================================文章评论管理
     */

    /**
     * 分页查询文章评论信息记录,包括评论层级关系
     * 参数：文章ID
     * 返回：文章评论记录展示页面
     */
    public Object findAllArticleComment(){
        return 0;
    }

    /**
     * 删除违规的文章评论信息
     * 参数：文章评论ID
     * 返回：是否成功
     */
    public Object delArticleComment(){
        return 0;
    }
}
