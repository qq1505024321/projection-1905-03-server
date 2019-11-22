package com.jk.model;

import java.io.Serializable;

public class Audit implements Serializable {

    private static final long serialVersionUID = 5338628258659471336L;

    private Integer auditId;

    private String auditName;

    private String auditTime;

    private Integer courseAudit;

    private Integer auditStatus;

    private String startDate;

    private String endDate;

    public Integer getAuditId() {
        return auditId;
    }

    public void setAuditId(Integer auditId) {
        this.auditId = auditId;
    }

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public Integer getCourseAudit() {
        return courseAudit;
    }

    public void setCourseAudit(Integer courseAudit) {
        this.courseAudit = courseAudit;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Audit{" +
                "auditId=" + auditId +
                ", auditName='" + auditName + '\'' +
                ", auditTime='" + auditTime + '\'' +
                ", courseAudit=" + courseAudit +
                ", auditStatus=" + auditStatus +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
