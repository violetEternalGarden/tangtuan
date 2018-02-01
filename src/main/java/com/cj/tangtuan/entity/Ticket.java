package com.cj.tangtuan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    /**
     * 景区门票信息
     */
    private Long ticketId;

    /**
     * 使用时间
     */
    private Date useTime;

    /**
     * 门票价格
     */
    private BigDecimal ticketPrice;

    /**
     * 景区门票信息
     * @return ticket_id 景区门票信息
     */
    public Long getTicketId() {
        return ticketId;
    }

    /**
     * 景区门票信息
     * @param ticketId 景区门票信息
     */
    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * 使用时间
     * @return use_time 使用时间
     */
    public Date getUseTime() {
        return useTime;
    }

    /**
     * 使用时间
     * @param useTime 使用时间
     */
    public void setUseTime(Date useTime) {
        this.useTime = useTime;
    }

    /**
     * 门票价格
     * @return ticket_price 门票价格
     */
    public BigDecimal getTicketPrice() {
        return ticketPrice;
    }

    /**
     * 门票价格
     * @param ticketPrice 门票价格
     */
    public void setTicketPrice(BigDecimal ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}