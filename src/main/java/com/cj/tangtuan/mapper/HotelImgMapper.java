package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.HotelImg;

public interface HotelImgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long hotelImgId);

    /**
     *
     * @mbggenerated
     */
    int insert(HotelImg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(HotelImg record);

    /**
     *
     * @mbggenerated
     */
    HotelImg selectByPrimaryKey(Long hotelImgId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(HotelImg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(HotelImg record);
}