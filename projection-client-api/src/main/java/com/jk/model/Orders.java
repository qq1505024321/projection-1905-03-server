package com.jk.model;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author ccl
 * @create 2019/11/20
 * @since 1.0.0
 */
public class Orders implements Serializable {

    private static final long serialVersionUID = -3099499695010490986L;

    private Integer id;
    private Long orderNumber;//订单编号
    private String coursename;//课程名
    private String courselevel;//课程等级
    private String teacher;//老师
    private String teacherlevel;//老师等级
    private Double price;//
    private Integer status;//订单状态
    private String createtime;//下单时间
    private String subjectname;

    private String endDate;

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourselevel() {
        return courselevel;
    }

    public void setCourselevel(String courselevel) {
        this.courselevel = courselevel;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTeacherlevel() {
        return teacherlevel;
    }

    public void setTeacherlevel(String teacherlevel) {
        this.teacherlevel = teacherlevel;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                ", coursename='" + coursename + '\'' +
                ", courselevel='" + courselevel + '\'' +
                ", teacher='" + teacher + '\'' +
                ", teacherlevel='" + teacherlevel + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", createtime='" + createtime + '\'' +
                ", subjectname='" + subjectname + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}