package com.data.model;

import java.io.Serializable;

public class Score implements Serializable {
    public static final long serialVersionUID = 275931126L;

    /**
     * : score.id
     * @author MyBatis Generator
     */
    private Integer id;

    /**
     * : score.stu_id
     * @author MyBatis Generator
     */
    private Integer stuId;

    /**
     * : score.c_name
     * @author MyBatis Generator
     */
    private String cName;

    /**
     * : score.grade
     * @author MyBatis Generator
     */
    private Integer grade;

    /**
     * 获取: score.id
     * @return : score.id
     * @author MyBatis Generator
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置: score.id
     * @param id 映射数据库字段: score.id
     * @author MyBatis Generator
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取: score.stu_id
     * @return : score.stu_id
     * @author MyBatis Generator
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * 设置: score.stu_id
     * @param stuId 映射数据库字段: score.stu_id
     * @author MyBatis Generator
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * 获取: score.c_name
     * @return : score.c_name
     * @author MyBatis Generator
     */
    public String getcName() {
        return cName;
    }

    /**
     * 设置: score.c_name
     * @param cName 映射数据库字段: score.c_name
     * @author MyBatis Generator
     */
    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    /**
     * 获取: score.grade
     * @return : score.grade
     * @author MyBatis Generator
     */
    public Integer getGrade() {
        return grade;
    }

    /**
     * 设置: score.grade
     * @param grade 映射数据库字段: score.grade
     * @author MyBatis Generator
     */
    public void setGrade(Integer grade) {
        this.grade = grade;
    }
}