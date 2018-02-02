package com.cj.tangtuan.controller.administra;

/**
 * 活动管理端业务
 */

public class ActivityController {

    /**
     * ==============================================活动主要信息
     */


    /**
     * 分页查询 所有 报名中、已结束 活动，按时间倒叙排列，检查报名已结束活动，修改其状态
     * 联查标签、温泉镇等表
     * 参数：
     * 返回：活动展示页面
     */
    public Object findAllActivity(){

        return 0;
    }

    /**
     * 根据活动名、活动时间、发起者等信息 分页查询 活动
     * 参数：查询条件
     * 返回：活动展示业面
     */
    public Object findActivityByCondition(){
        return 0;
    }

    /**
     * 查询活动详情
     * 参数：活动ID
     * 返回：活动详情页面
     */
    public Object findActivity(){
        return 0;
    }

    /**
     * 管理员 发布活动,温泉镇可选
     * 参数：活动信息
     * 返回：是否成功
     */
    public Object addActivity(){
        return 0;
    }

    /**
     * 删除活动
     * 参数：活动ID、删除原因
     * 返回：是否成功
     */
    public Object delActivity(){
        return 0;
    }

    /**
     * 修改活动信息
     * 参数：活动信息
     * 返回：是否修改成功
     */
    public Object updActivity(){
        return 0;
    }

    /**
     * ===================================================活动点赞记录
     */

    /**
     * 分页 查询活动点赞记录信息、联查 ，在活动详情页面点击进入
     * 参数：
     * 返回：活动点赞信息记录展示页面
     */
    public Object findAllActivityAgreenum(){

        return 0;

    }


    /**
     * ============================================活动评论管理
     */

    /**
     * 分页、条件 查询活动评论信息
     * 参数：活动ID 等
     * 返回：活动评论信息展示页面
     */
    public Object findAllActivityComment(){
        return 0;
    }

    /**
     * 删除违规评论，修改活动、评论间关联表信息
     * 参数：评论ID
     * 返回：是否成功
     */
    public Object delActivityComment(){
        return 0;
    }
}
