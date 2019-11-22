package com.jk.model;

import java.io.Serializable;

public class SubjectCourse implements Serializable {

    private static final long serialVersionUID = -9074252930993041382L;

    private Integer id;

    private Integer subjuctId;

    private Integer courseId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSubjuctId() {
        return subjuctId;
    }

    public void setSubjuctId(Integer subjuctId) {
        this.subjuctId = subjuctId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Override
    public String toString() {
        return "SubjectCourse{" +
                "id=" + id +
                ", subjuctId=" + subjuctId +
                ", courseId=" + courseId +
                '}';
    }
}
