package com.cj.tangtuan.entity;

public class GroupGrade {
    /**
     * 群等级表
     */
    private Long groupGradeId;

    /**
     * 等级名称
     */
    private String gradeName;

    /**
     * 等级描述
     */
    private String gradeDescribe;

    /**
     * 等级人数限制
     */
    private Integer gradeNum;

    /**
     * 群等级表
     * @return group_grade_id 群等级表
     */
    public Long getGroupGradeId() {
        return groupGradeId;
    }

    /**
     * 群等级表
     * @param groupGradeId 群等级表
     */
    public void setGroupGradeId(Long groupGradeId) {
        this.groupGradeId = groupGradeId;
    }

    /**
     * 等级名称
     * @return grade_name 等级名称
     */
    public String getGradeName() {
        return gradeName;
    }

    /**
     * 等级名称
     * @param gradeName 等级名称
     */
    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    /**
     * 等级描述
     * @return grade_describe 等级描述
     */
    public String getGradeDescribe() {
        return gradeDescribe;
    }

    /**
     * 等级描述
     * @param gradeDescribe 等级描述
     */
    public void setGradeDescribe(String gradeDescribe) {
        this.gradeDescribe = gradeDescribe == null ? null : gradeDescribe.trim();
    }

    /**
     * 等级人数限制
     * @return grade_num 等级人数限制
     */
    public Integer getGradeNum() {
        return gradeNum;
    }

    /**
     * 等级人数限制
     * @param gradeNum 等级人数限制
     */
    public void setGradeNum(Integer gradeNum) {
        this.gradeNum = gradeNum;
    }
}