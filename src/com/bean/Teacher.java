package com.bean;

import java.util.List;

public class Teacher {
    private Integer tid;

    private Integer sid;

    private String tname;

    private String tpic;

    private Integer tflag;
    //一个教师多个学生
    private List<Student> stu;

    public List<Student> getStu() {
		return stu;
	}

	public void setStu(List<Student> stu) {
		this.stu = stu;
	}

	public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTpic() {
        return tpic;
    }

    public void setTpic(String tpic) {
        this.tpic = tpic == null ? null : tpic.trim();
    }

    public Integer getTflag() {
        return tflag;
    }

    public void setTflag(Integer tflag) {
        this.tflag = tflag;
    }
}