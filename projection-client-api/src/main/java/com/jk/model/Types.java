package com.jk.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Spliterator;

public class Types implements Serializable {

     private static final long serialVersionUID = 8739624026902950325L;
     private  Integer classifyId;

     private  String  classifyName;

     private  Integer classifySort;

     private   Date   classifyTime;

     public static long getSerialVersionUID() {
          return serialVersionUID;
     }

     public Integer getClassifyId() {
          return classifyId;
     }

     public void setClassifyId(Integer classifyId) {
          this.classifyId = classifyId;
     }

     public String getClassifyName() {
          return classifyName;
     }

     public void setClassifyName(String classifyName) {
          this.classifyName = classifyName;
     }

     public Integer getClassifySort() {
          return classifySort;
     }

     public void setClassifySort(Integer classifySort) {
          this.classifySort = classifySort;
     }

     public Date getClassifyTime() {
          return classifyTime;
     }

     public void setClassifyTime(Date classifyTime) {
          this.classifyTime = classifyTime;
     }

     @Override
     public String toString() {
          return "Types{" +
                  "classifyId=" + classifyId +
                  ", classifyName='" + classifyName + '\'' +
                  ", classifySort=" + classifySort +
                  ", classifyTime=" + classifyTime +
                  '}';
     }
}
