package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.DqProvince;

public interface DqProvinceMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int insert(DqProvince record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(DqProvince record);

    /**
     *
     * @mbggenerated
     */
    DqProvince selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(DqProvince record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(DqProvince record);
}