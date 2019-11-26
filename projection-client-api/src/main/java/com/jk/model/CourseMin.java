package com.jk.model;

import java.io.Serializable;

public class CourseMin implements Serializable {

    private static final long serialVersionUID = 3260340495751570218L;
    private Integer subId;

    private String  subName;

    private String  subImg;

    private String  subInfo;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubImg() {
        return subImg;
    }

    public void setSubImg(String subImg) {
        this.subImg = subImg;
    }

    public String getSubInfo() {
        return subInfo;
    }

    public void setSubInfo(String subInfo) {
        this.subInfo = subInfo;
    }

    @Override
    public String toString() {
        return "CourseMin{" +
                "subId=" + subId +
                ", subName='" + subName + '\'' +
                ", subImg='" + subImg + '\'' +
                ", subInfo='" + subInfo + '\'' +
                '}';
    }
}
