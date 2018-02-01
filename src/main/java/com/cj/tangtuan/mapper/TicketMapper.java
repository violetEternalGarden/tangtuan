package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.Ticket;

public interface TicketMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long ticketId);

    /**
     *
     * @mbggenerated
     */
    int insert(Ticket record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(Ticket record);

    /**
     *
     * @mbggenerated
     */
    Ticket selectByPrimaryKey(Long ticketId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Ticket record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Ticket record);
}