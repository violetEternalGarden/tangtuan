package com.cj.tangtuan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Room {
    /**
     * 酒店房间信息表
     */
    private Long roomId;

    /**
     * 入住时间
     */
    private Date useTime;

    /**
     * 价格
     */
    private BigDecimal roomPrice;

    /**
     * 酒店房间信息表
     * @return room_id 酒店房间信息表
     */
    public Long getRoomId() {
        return roomId;
    }

    /**
     * 酒店房间信息表
     * @param roomId 酒店房间信息表
     */
    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    /**
     * 入住时间
     * @return use_time 入住时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 入住时间
     * @param useTime 入住时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 价格
     * @return room_price 价格
     */
    public BigDecimal getRoomPrice() {
        return roomPrice;
    }

    /**
     * 价格
     * @param roomPrice 价格
     */
    public void setRoomPrice(BigDecimal roomPrice) {
        this.roomPrice = roomPrice;
    }
}