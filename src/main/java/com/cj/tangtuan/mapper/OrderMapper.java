package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Order;

public interface OrderMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long orderId);

    /**
     *
     * @mbggenerated
     */
    int insert(Order record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Order record);

    /**
     *
     * @mbggenerated
     */
    Order selectByPrimaryKey(Long orderId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Order record);
}