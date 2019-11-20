package com.jk.model;

import java.io.Serializable;

/*这是老师等级的实体类*/
public class TeacherLv implements Serializable {

    private static final long serialVersionUID = -2961908273920491588L;
    private Integer teacherlevelid;
    private String teacherlevel;

    public Integer getTeacherlevelid() {
        return teacherlevelid;
    }

    public void setTeacherlevelid(Integer teacherlevelid) {
        this.teacherlevelid = teacherlevelid;
    }

    public String getTeacherlevel() {
        return teacherlevel;
    }

    public void setTeacherlevel(String teacherlevel) {
        this.teacherlevel = teacherlevel;
    }

    @Override
    public String toString() {
        return "TeacherLv{" +
                "teacherlevelid=" + teacherlevelid +
                ", teacherlevel='" + teacherlevel + '\'' +
                '}';
    }
}
