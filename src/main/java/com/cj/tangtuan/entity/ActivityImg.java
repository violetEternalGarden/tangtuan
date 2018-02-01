package com.cj.tangtuan.entity;

public class ActivityImg {
    /**
     * 活动-图片表
     */
    private Long aiId;

    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动图片路径
     */
    private String imgUrl;

    /**
     * 1-不是封面图片，2-封面图片，默认为1
     */
    private String coverImg;

    /**
     * 活动-图片表
     * @return ai_id 活动-图片表
     */
    public Long getAiId() {
        return aiId;
    }

    /**
     * 活动-图片表
     * @param aiId 活动-图片表
     */
    public void setAiId(Long aiId) {
        this.aiId = aiId;
    }

    /**
     * 活动ID
     * @return activity_id 活动ID
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * 活动ID
     * @param activityId 活动ID
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * 活动图片路径
     * @return img_url 活动图片路径
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 活动图片路径
     * @param imgUrl 活动图片路径
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * 1-不是封面图片，2-封面图片，默认为1
     * @return cover_img 1-不是封面图片，2-封面图片，默认为1
     */
    public String getCoverImg() {
        return coverImg;
    }

    /**
     * 1-不是封面图片，2-封面图片，默认为1
     * @param coverImg 1-不是封面图片，2-封面图片，默认为1
     */
    public void setCoverImg(String coverImg) {
        this.coverImg = coverImg == null ? null : coverImg.trim();
    }
}