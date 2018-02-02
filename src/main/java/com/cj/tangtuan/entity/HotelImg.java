package com.cj.tangtuan.entity;

public class HotelImg {
    /**
     * 温泉镇图片库
     */
    private Long hotelImgId;

    /**
     * 温泉镇ID
     */
    private Long hotelId;

    /**
     * 图片路径
     */
    private Long imgUrl;

    /**
     * 图片类型，1-标题图片，2-普通图片
     */
    private String imgType;

    /**
     * 温泉镇图片库
     * @return hotel_img_id 温泉镇图片库
     */
    public Long getHotelImgId() {
        return hotelImgId;
    }

    /**
     * 温泉镇图片库
     * @param hotelImgId 温泉镇图片库
     */
    public void setHotelImgId(Long hotelImgId) {
        this.hotelImgId = hotelImgId;
    }

    /**
     * 温泉镇ID
     * @return hotel_id 温泉镇ID
     */
    public Long getHotelId() {
        return hotelId;
    }

    /**
     * 温泉镇ID
     * @param hotelId 温泉镇ID
     */
    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * 图片路径
     * @return img_url 图片路径
     */
    public Long getImgUrl() {
        return imgUrl;
    }

    /**
     * 图片路径
     * @param imgUrl 图片路径
     */
    public void setImgUrl(Long imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * 图片类型，1-标题图片，2-普通图片
     * @return img_type 图片类型，1-标题图片，2-普通图片
     */
    public String getImgType() {
        return imgType;
    }

    /**
     * 图片类型，1-标题图片，2-普通图片
     * @param imgType 图片类型，1-标题图片，2-普通图片
     */
    public void setImgType(String imgType) {
        this.imgType = imgType == null ? null : imgType.trim();
    }
}