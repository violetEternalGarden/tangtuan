package com.cj.tangtuan.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    /**
     * 订单表
     */
    private Long orderId;

    /**
     * 订单编号
     */
    private String orderCode;

    /**
     * 订单总额（实付）
     */
    private BigDecimal orderPrice;

    /**
     * 订单优惠金额
     */
    private BigDecimal orderPrePrice;

    /**
     * 订单原价
     */
    private BigDecimal orderOldPrice;

    /**
     * 订单状态，1-未支付，
     */
    private String orderStatus;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 支付时间
     */
    private Date payTime;

    /**
     * 发货时间
     */
    private Date sendExpressTime;

    /**
     * 收货时间
     */
    private Date getGoodsTime;

    /**
     * 收货地址ID
     */
    private Long shoppingAddrId;

    /**
     * 收货省
     */
    private String provinceId;

    /**
     * 收货市
     */
    private String cityId;

    /**
     * 收货区
     */
    private String areaId;

    /**
     * 详细地址
     */
    private String shippingAddress;

    /**
     * 收货人
     */
    private String shippingPerson;

    /**
     * 收货电话
     */
    private String shippingPhone;

    /**
     * 收货手机
     */
    private String shippingMobile;

    /**
     * 发票抬头
     */
    private String invoiceTitle;

    /**
     * 发票内容
     */
    private String invoiceContent;

    /**
     * 发票类型，1-个人，2-公司
     */
    private String invoiceType;

    /**
     * 留言
     */
    private String customerRemark;

    /**
     * 支付方式，1-支付宝，2-微信
     */
    private Long payId;

    /**
     * 使用积分
     */
    private Long orderIntegral;

    /**
     * 使用优惠券（优惠券ID，逗号分隔）
     */
    private String couponNo;

    /**
     * 是否已评价，0-未评价，1-已评价
     */
    private String evaluateFlag;

    /**
     * 运费
     */
    private BigDecimal expressPrice;

    /**
     * 邮编
     */
    private String shippingPostcode;

    /**
     * 订单取消时间
     */
    private Date orderCancelTime;

    /**
     * 取消原因
     */
    private String orderCancelRemark;

    /**
     * 退单金额
     */
    private BigDecimal backPrice;

    /**
     * 1-在线支付，2-货到付款
     */
    private String orderLinePay;

    /**
     * 订单完成获得积分
     */
    private Long orderGetPoint;

    /**
     * 积分价值
     */
    private BigDecimal pointWorth;

    /**
     * 会员折扣金额
     */
    private BigDecimal discountPrice;

    /**
     * 优惠券金额
     */
    private BigDecimal couponPrice;

    /**
     * 1-退款中，2-退款成功
     */
    private String backOrderStatus;

    /**
     * 订单完成时间
     */
    private Date finishTime;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 0-已删除，1-未删除
     */
    private String delState;

    /**
     * 订单表
     * @return order_id 订单表
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 订单表
     * @param orderId 订单表
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

    /**
     * 订单总额（实付）
     * @return order_price 订单总额（实付）
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * 订单总额（实付）
     * @param orderPrice 订单总额（实付）
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 订单优惠金额
     * @return order_pre_price 订单优惠金额
     */
    public BigDecimal getOrderPrePrice() {
        return orderPrePrice;
    }

    /**
     * 订单优惠金额
     * @param orderPrePrice 订单优惠金额
     */
    public void setOrderPrePrice(BigDecimal orderPrePrice) {
        this.orderPrePrice = orderPrePrice;
    }

    /**
     * 订单原价
     * @return order_old_price 订单原价
     */
    public BigDecimal getOrderOldPrice() {
        return orderOldPrice;
    }

    /**
     * 订单原价
     * @param orderOldPrice 订单原价
     */
    public void setOrderOldPrice(BigDecimal orderOldPrice) {
        this.orderOldPrice = orderOldPrice;
    }

    /**
     * 订单状态，1-未支付，
     * @return order_status 订单状态，1-未支付，
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态，1-未支付，
     * @param orderStatus 订单状态，1-未支付，
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * 用户ID
     * @return user_id 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     * @param userId 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 支付时间
     * @return pay_time 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 支付时间
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 发货时间
     * @return send_express_time 发货时间
     */
    public Date getSendExpressTime() {
        return sendExpressTime;
    }

    /**
     * 发货时间
     * @param sendExpressTime 发货时间
     */
    public void setSendExpressTime(Date sendExpressTime) {
        this.sendExpressTime = sendExpressTime;
    }

    /**
     * 收货时间
     * @return get_goods_time 收货时间
     */
    public Date getGetGoodsTime() {
        return getGoodsTime;
    }

    /**
     * 收货时间
     * @param getGoodsTime 收货时间
     */
    public void setGetGoodsTime(Date getGoodsTime) {
        this.getGoodsTime = getGoodsTime;
    }

    /**
     * 收货地址ID
     * @return shopping_addr_id 收货地址ID
     */
    public Long getShoppingAddrId() {
        return shoppingAddrId;
    }

    /**
     * 收货地址ID
     * @param shoppingAddrId 收货地址ID
     */
    public void setShoppingAddrId(Long shoppingAddrId) {
        this.shoppingAddrId = shoppingAddrId;
    }

    /**
     * 收货省
     * @return province_id 收货省
     */
    public String getProvinceId() {
        return provinceId;
    }

    /**
     * 收货省
     * @param provinceId 收货省
     */
    public void setProvinceId(String provinceId) {
        this.provinceId = provinceId == null ? null : provinceId.trim();
    }

    /**
     * 收货市
     * @return city_id 收货市
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * 收货市
     * @param cityId 收货市
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    /**
     * 收货区
     * @return area_id 收货区
     */
    public String getAreaId() {
        return areaId;
    }

    /**
     * 收货区
     * @param areaId 收货区
     */
    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    /**
     * 详细地址
     * @return shipping_address 详细地址
     */
    public String getShippingAddress() {
        return shippingAddress;
    }

    /**
     * 详细地址
     * @param shippingAddress 详细地址
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    /**
     * 收货人
     * @return shipping_person 收货人
     */
    public String getShippingPerson() {
        return shippingPerson;
    }

    /**
     * 收货人
     * @param shippingPerson 收货人
     */
    public void setShippingPerson(String shippingPerson) {
        this.shippingPerson = shippingPerson == null ? null : shippingPerson.trim();
    }

    /**
     * 收货电话
     * @return shipping_phone 收货电话
     */
    public String getShippingPhone() {
        return shippingPhone;
    }

    /**
     * 收货电话
     * @param shippingPhone 收货电话
     */
    public void setShippingPhone(String shippingPhone) {
        this.shippingPhone = shippingPhone == null ? null : shippingPhone.trim();
    }

    /**
     * 收货手机
     * @return shipping_mobile 收货手机
     */
    public String getShippingMobile() {
        return shippingMobile;
    }

    /**
     * 收货手机
     * @param shippingMobile 收货手机
     */
    public void setShippingMobile(String shippingMobile) {
        this.shippingMobile = shippingMobile == null ? null : shippingMobile.trim();
    }

    /**
     * 发票抬头
     * @return invoice_title 发票抬头
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 发票抬头
     * @param invoiceTitle 发票抬头
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    /**
     * 发票内容
     * @return invoice_content 发票内容
     */
    public String getInvoiceContent() {
        return invoiceContent;
    }

    /**
     * 发票内容
     * @param invoiceContent 发票内容
     */
    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    /**
     * 发票类型，1-个人，2-公司
     * @return invoice_type 发票类型，1-个人，2-公司
     */
    public String getInvoiceType() {
        return invoiceType;
    }

    /**
     * 发票类型，1-个人，2-公司
     * @param invoiceType 发票类型，1-个人，2-公司
     */
    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    /**
     * 留言
     * @return customer_remark 留言
     */
    public String getCustomerRemark() {
        return customerRemark;
    }

    /**
     * 留言
     * @param customerRemark 留言
     */
    public void setCustomerRemark(String customerRemark) {
        this.customerRemark = customerRemark == null ? null : customerRemark.trim();
    }

    /**
     * 支付方式，1-支付宝，2-微信
     * @return pay_id 支付方式，1-支付宝，2-微信
     */
    public Long getPayId() {
        return payId;
    }

    /**
     * 支付方式，1-支付宝，2-微信
     * @param payId 支付方式，1-支付宝，2-微信
     */
    public void setPayId(Long payId) {
        this.payId = payId;
    }

    /**
     * 使用积分
     * @return order_integral 使用积分
     */
    public Long getOrderIntegral() {
        return orderIntegral;
    }

    /**
     * 使用积分
     * @param orderIntegral 使用积分
     */
    public void setOrderIntegral(Long orderIntegral) {
        this.orderIntegral = orderIntegral;
    }

    /**
     * 使用优惠券（优惠券ID，逗号分隔）
     * @return coupon_no 使用优惠券（优惠券ID，逗号分隔）
     */
    public String getCouponNo() {
        return couponNo;
    }

    /**
     * 使用优惠券（优惠券ID，逗号分隔）
     * @param couponNo 使用优惠券（优惠券ID，逗号分隔）
     */
    public void setCouponNo(String couponNo) {
        this.couponNo = couponNo == null ? null : couponNo.trim();
    }

    /**
     * 是否已评价，0-未评价，1-已评价
     * @return evaluate_flag 是否已评价，0-未评价，1-已评价
     */
    public String getEvaluateFlag() {
        return evaluateFlag;
    }

    /**
     * 是否已评价，0-未评价，1-已评价
     * @param evaluateFlag 是否已评价，0-未评价，1-已评价
     */
    public void setEvaluateFlag(String evaluateFlag) {
        this.evaluateFlag = evaluateFlag == null ? null : evaluateFlag.trim();
    }

    /**
     * 运费
     * @return express_price 运费
     */
    public BigDecimal getExpressPrice() {
        return expressPrice;
    }

    /**
     * 运费
     * @param expressPrice 运费
     */
    public void setExpressPrice(BigDecimal expressPrice) {
        this.expressPrice = expressPrice;
    }

    /**
     * 邮编
     * @return shipping_postcode 邮编
     */
    public String getShippingPostcode() {
        return shippingPostcode;
    }

    /**
     * 邮编
     * @param shippingPostcode 邮编
     */
    public void setShippingPostcode(String shippingPostcode) {
        this.shippingPostcode = shippingPostcode == null ? null : shippingPostcode.trim();
    }

    /**
     * 订单取消时间
     * @return order_cancel_time 订单取消时间
     */
    public Date getOrderCancelTime() {
        return orderCancelTime;
    }

    /**
     * 订单取消时间
     * @param orderCancelTime 订单取消时间
     */
    public void setOrderCancelTime(Date orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    /**
     * 取消原因
     * @return order_cancel_remark 取消原因
     */
    public String getOrderCancelRemark() {
        return orderCancelRemark;
    }

    /**
     * 取消原因
     * @param orderCancelRemark 取消原因
     */
    public void setOrderCancelRemark(String orderCancelRemark) {
        this.orderCancelRemark = orderCancelRemark == null ? null : orderCancelRemark.trim();
    }

    /**
     * 退单金额
     * @return back_price 退单金额
     */
    public BigDecimal getBackPrice() {
        return backPrice;
    }

    /**
     * 退单金额
     * @param backPrice 退单金额
     */
    public void setBackPrice(BigDecimal backPrice) {
        this.backPrice = backPrice;
    }

    /**
     * 1-在线支付，2-货到付款
     * @return order_line_pay 1-在线支付，2-货到付款
     */
    public String getOrderLinePay() {
        return orderLinePay;
    }

    /**
     * 1-在线支付，2-货到付款
     * @param orderLinePay 1-在线支付，2-货到付款
     */
    public void setOrderLinePay(String orderLinePay) {
        this.orderLinePay = orderLinePay == null ? null : orderLinePay.trim();
    }

    /**
     * 订单完成获得积分
     * @return order_get_point 订单完成获得积分
     */
    public Long getOrderGetPoint() {
        return orderGetPoint;
    }

    /**
     * 订单完成获得积分
     * @param orderGetPoint 订单完成获得积分
     */
    public void setOrderGetPoint(Long orderGetPoint) {
        this.orderGetPoint = orderGetPoint;
    }

    /**
     * 积分价值
     * @return point_worth 积分价值
     */
    public BigDecimal getPointWorth() {
        return pointWorth;
    }

    /**
     * 积分价值
     * @param pointWorth 积分价值
     */
    public void setPointWorth(BigDecimal pointWorth) {
        this.pointWorth = pointWorth;
    }

    /**
     * 会员折扣金额
     * @return discount_price 会员折扣金额
     */
    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    /**
     * 会员折扣金额
     * @param discountPrice 会员折扣金额
     */
    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     * 优惠券金额
     * @return coupon_price 优惠券金额
     */
    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    /**
     * 优惠券金额
     * @param couponPrice 优惠券金额
     */
    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    /**
     * 1-退款中，2-退款成功
     * @return back_order_status 1-退款中，2-退款成功
     */
    public String getBackOrderStatus() {
        return backOrderStatus;
    }

    /**
     * 1-退款中，2-退款成功
     * @param backOrderStatus 1-退款中，2-退款成功
     */
    public void setBackOrderStatus(String backOrderStatus) {
        this.backOrderStatus = backOrderStatus == null ? null : backOrderStatus.trim();
    }

    /**
     * 订单完成时间
     * @return finish_time 订单完成时间
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * 订单完成时间
     * @param finishTime 订单完成时间
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * 订单创建时间
     * @return create_time 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 订单创建时间
     * @param createTime 订单创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 0-已删除，1-未删除
     * @return del_state 0-已删除，1-未删除
     */
    public String getDelState() {
        return delState;
    }

    /**
     * 0-已删除，1-未删除
     * @param delState 0-已删除，1-未删除
     */
    public void setDelState(String delState) {
        this.delState = delState == null ? null : delState.trim();
    }
}