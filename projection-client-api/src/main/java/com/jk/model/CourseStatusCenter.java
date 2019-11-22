package com.jk.model;

import java.io.Serializable;

public class CourseStatusCenter implements Serializable {

    private static final long serialVersionUID = 8030157606477486670L;
    private Integer id;

    private Integer statusid;

    private Integer couseid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStatusid() {
        return statusid;
    }

    public void setStatusid(Integer statusid) {
        this.statusid = statusid;
    }

    public Integer getCouseid() {
        return couseid;
    }

    public void setCouseid(Integer couseid) {
        this.couseid = couseid;
    }


    @Override
    public String toString() {
        return "CourseStatusCenter{" +
                "id=" + id +
                ", statusid=" + statusid +
                ", couseid=" + couseid +
                '}';
    }
}
