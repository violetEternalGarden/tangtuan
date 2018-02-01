package com.cj.tangtuan.entity;

public class MsgImg {
    /**
     * 消息图片表，原创动态消息才有引用图片，评论无图
     */
    private Long msgImgId;

    /**
     * 消息ID
     */
    private Long msgId;

    /**
     * 图片路径
     */
    private String imgUrl;

    /**
     * 消息图片表，原创动态消息才有引用图片，评论无图
     * @return msg_img_id 消息图片表，原创动态消息才有引用图片，评论无图
     */
    public Long getMsgImgId() {
        return msgImgId;
    }

    /**
     * 消息图片表，原创动态消息才有引用图片，评论无图
     * @param msgImgId 消息图片表，原创动态消息才有引用图片，评论无图
     */
    public void setMsgImgId(Long msgImgId) {
        this.msgImgId = msgImgId;
    }

    /**
     * 消息ID
     * @return msg_id 消息ID
     */
    public Long getMsgId() {
        return msgId;
    }

    /**
     * 消息ID
     * @param msgId 消息ID
     */
    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    /**
     * 图片路径
     * @return img_url 图片路径
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片路径
     * @param imgUrl 图片路径
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }
}