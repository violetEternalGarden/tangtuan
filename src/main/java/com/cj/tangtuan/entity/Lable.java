package com.cj.tangtuan.entity;

public class Lable {
    /**
     * 标签表
     */
    private Long lableId;

    /**
     * 标签名称
     */
    private String lableName;

    /**
     * 标签表
     * @return lable_id 标签表
     */
    public Long getLableId() {
        return lableId;
    }

    /**
     * 标签表
     * @param lableId 标签表
     */
    public void setLableId(Long lableId) {
        this.lableId = lableId;
    }

    /**
     * 标签名称
     * @return lable_name 标签名称
     */
    public String getLableName() {
        return lableName;
    }

    /**
     * 标签名称
     * @param lableName 标签名称
     */
    public void setLableName(String lableName) {
        this.lableName = lableName == null ? null : lableName.trim();
    }
}