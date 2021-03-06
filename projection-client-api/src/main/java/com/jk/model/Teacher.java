package com.jk.model;

import java.io.Serializable;

public class Teacher implements Serializable {

    private static final long serialVersionUID = 3884085340913885123L;

    private Integer teaId;

    private String teaNumber;

    private String teaPhone;

    private String teaImg;

    private String teaName;

    private Integer subjectId;
    /*临时字段课程名字*/
    private String subName;
    /*临时字段课程详细*/
    private String subjectname;

    private String teaShow;

    private Integer lvId;

    private String createTime;
    /*临时字段开课时间*/
    private String subjectTime;

    private Integer moneyId;

    private Integer stuCount;

    private Integer courseCount;

    private Integer tealevelId;

    private String shenfenzheng;

    private String identityimg;

    private Integer subId;

    private Integer courseid;
    /*临时字段老师等级*/
    private String teacherlevel;
    /*临时字段条查使用*/
    private String Datestart;

    private String Dateend;


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

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public String getTeaShow() {
        return teaShow;
    }

    public void setTeaShow(String teaShow) {
        this.teaShow = teaShow;
    }

    public Integer getLvId() {
        return lvId;
    }

    public void setLvId(Integer lvId) {
        this.lvId = lvId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSubjectTime() {
        return subjectTime;
    }

    public void setSubjectTime(String subjectTime) {
        this.subjectTime = subjectTime;
    }

    public Integer getMoneyId() {
        return moneyId;
    }

    public void setMoneyId(Integer moneyId) {
        this.moneyId = moneyId;
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

    public Integer getTealevelId() {
        return tealevelId;
    }

    public void setTealevelId(Integer tealevelId) {
        this.tealevelId = tealevelId;
    }

    public String getShenfenzheng() {
        return shenfenzheng;
    }

    public void setShenfenzheng(String shenfenzheng) {
        this.shenfenzheng = shenfenzheng;
    }

    public String getIdentityimg() {
        return identityimg;
    }

    public void setIdentityimg(String identityimg) {
        this.identityimg = identityimg;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
    }

    public String getTeacherlevel() {
        return teacherlevel;
    }

    public void setTeacherlevel(String teacherlevel) {
        this.teacherlevel = teacherlevel;
    }

    public String getDatestart() {
        return Datestart;
    }

    public void setDatestart(String datestart) {
        Datestart = datestart;
    }

    public String getDateend() {
        return Dateend;
    }

    public void setDateend(String dateend) {
        Dateend = dateend;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaId=" + teaId +
                ", teaNumber='" + teaNumber + '\'' +
                ", teaPhone='" + teaPhone + '\'' +
                ", teaImg='" + teaImg + '\'' +
                ", teaName='" + teaName + '\'' +
                ", subjectId=" + subjectId +
                ", subName='" + subName + '\'' +
                ", subjectname='" + subjectname + '\'' +
                ", teaShow='" + teaShow + '\'' +
                ", lvId=" + lvId +
                ", createTime='" + createTime + '\'' +
                ", subjectTime='" + subjectTime + '\'' +
                ", moneyId=" + moneyId +
                ", stuCount=" + stuCount +
                ", courseCount=" + courseCount +
                ", tealevelId=" + tealevelId +
                ", shenfenzheng='" + shenfenzheng + '\'' +
                ", identityimg='" + identityimg + '\'' +
                ", subId=" + subId +
                ", courseid=" + courseid +
                ", teacherlevel='" + teacherlevel + '\'' +
                ", Datestart='" + Datestart + '\'' +
                ", Dateend='" + Dateend + '\'' +
                '}';
    }
}
