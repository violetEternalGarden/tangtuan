package com.cj.tangtuan.entity;

public class PayRecord {
    /**
     * 支付记录表
     */
    private Long payRecordId;

    /**
     * 订单ID
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 支付记录表
     * @return pay_record_id 支付记录表
     */
    public Long getPayRecordId() {
        return payRecordId;
    }

    /**
     * 支付记录表
     * @param payRecordId 支付记录表
     */
    public void setPayRecordId(Long payRecordId) {
        this.payRecordId = payRecordId;
    }

    /**
     * 订单ID
     * @return order_id 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单ID
     * @param orderId 订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 订单编号
     * @return order_code 订单编号
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 订单编号
     * @param orderCode 订单编号
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }
}