package com.jk.model;

import java.io.Serializable;

public class Teacher implements Serializable {
    private static final long serialVersionUID = 3884085340913885123L;

    private Integer teaId;
    private String teaNumber;
    private String teaPhone;
    private String teaImg;
    private String teaName;
    private String teaGrade;
    private Integer teaSubject;
    private String teaShow;
    private String createTime;
    private Integer money;
    private Integer stuCount;
    private Integer courseCount;
    private Integer stuStatus;

    public Integer getTeaId() {
        return teaId;
    }

    public void setTeaId(Integer teaId) {
        this.teaId = teaId;
    }

    public String getTeaNumber() {
        return teaNumber;
    }

    public void setTeaNumber(String teaNumber) {
        this.teaNumber = teaNumber;
    }

    public String getTeaPhone() {
        return teaPhone;
    }

    public void setTeaPhone(String teaPhone) {
        this.teaPhone = teaPhone;
    }

    public String getTeaImg() {
        return teaImg;
    }

    public void setTeaImg(String teaImg) {
        this.teaImg = teaImg;
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public String getTeaGrade() {
        return teaGrade;
    }

    public void setTeaGrade(String teaGrade) {
        this.teaGrade = teaGrade;
    }

    public Integer getTeaSubject() {
        return teaSubject;
    }

    public void setTeaSubject(Integer teaSubject) {
        this.teaSubject = teaSubject;
    }

    public String getTeaShow() {
        return teaShow;
    }

    public void setTeaShow(String teaShow) {
        this.teaShow = teaShow;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getStuCount() {
        return stuCount;
    }

    public void setStuCount(Integer stuCount) {
        this.stuCount = stuCount;
    }

    public Integer getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(Integer courseCount) {
        this.courseCount = courseCount;
    }

    public Integer getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(Integer stuStatus) {
        this.stuStatus = stuStatus;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId=" + teaId +
                ", teaNumber='" + teaNumber + '\'' +
                ", teaPhone='" + teaPhone + '\'' +
                ", teaImg='" + teaImg + '\'' +
                ", teaName='" + teaName + '\'' +
                ", teaGrade='" + teaGrade + '\'' +
                ", teaSubject=" + teaSubject +
                ", teaShow='" + teaShow + '\'' +
                ", createTime='" + createTime + '\'' +
                ", money=" + money +
                ", stuCount=" + stuCount +
                ", courseCount=" + courseCount +
                ", stuStatus=" + stuStatus +
                '}';
    }
}
