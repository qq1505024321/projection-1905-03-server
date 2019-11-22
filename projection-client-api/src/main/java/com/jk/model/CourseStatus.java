package com.jk.model;

import java.io.Serializable;

public class CourseStatus implements Serializable {

    private static final long serialVersionUID = -2371709440350831913L;
    private Integer staId;

    private String  staName;

    private Integer courseTypeId;

    public Integer getStaId() {
        return staId;
    }

    public void setStaId(Integer staId) {
        this.staId = staId;
    }

    public String getStaName() {
        return staName;
    }

    public void setStaName(String staName) {
        this.staName = staName;
    }

    public Integer getCourseTypeId() {
        return courseTypeId;
    }

    public void setCourseTypeId(Integer courseTypeId) {
        this.courseTypeId = courseTypeId;
    }

    @Override
    public String toString() {
        return "CourseStatus{" +
                "staId=" + staId +
                ", staName='" + staName + '\'' +
                ", courseTypeId=" + courseTypeId +
                '}';
    }
}
