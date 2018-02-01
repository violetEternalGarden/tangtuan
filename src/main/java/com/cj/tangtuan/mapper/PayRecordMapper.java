package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.PayRecord;

public interface PayRecordMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long payRecordId);

    /**
     *
     * @mbggenerated
     */
    int insert(PayRecord record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(PayRecord record);

    /**
     *
     * @mbggenerated
     */
    PayRecord selectByPrimaryKey(Long payRecordId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(PayRecord record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(PayRecord record);
}