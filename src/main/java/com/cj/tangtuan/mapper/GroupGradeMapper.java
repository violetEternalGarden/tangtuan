package com.cj.tangtuan.mapper;

import com.cj.tangtuan.entity.GroupGrade;

public interface GroupGradeMapper {
    /**
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupGradeId);

    /**
     *
     * @mbggenerated
     */
    int insert(GroupGrade record);

    /**
     *
     * @mbggenerated
     */
    int insertSelective(GroupGrade record);

    /**
     *
     * @mbggenerated
     */
    GroupGrade selectByPrimaryKey(Long groupGradeId);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GroupGrade record);

    /**
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GroupGrade record);
}