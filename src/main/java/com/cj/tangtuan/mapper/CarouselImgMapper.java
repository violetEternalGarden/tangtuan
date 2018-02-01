package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.CarouselImg;

public interface CarouselImgMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long ciId);

    /**
     *
     * @mbggenerated
     */
    int insert(CarouselImg record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(CarouselImg record);

    /**
     *
     * @mbggenerated
     */
    CarouselImg selectByPrimaryKey(Long ciId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CarouselImg record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CarouselImg record);
}