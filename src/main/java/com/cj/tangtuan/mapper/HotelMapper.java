package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Hotel;

public interface HotelMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long hotelId);

    /**
     *
     * @mbggenerated
     */
    int insert(Hotel record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Hotel record);

    /**
     *
     * @mbggenerated
     */
    Hotel selectByPrimaryKey(Long hotelId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Hotel record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Hotel record);
}