package com.bean;

public class Student {
    private Integer sid;

    private String sname;

    private String spic;

    private Integer sflag;
    //增加一个教师的属性
    private Teacher tea;

    public Teacher getTea() {
		return tea;
	}

	public void setTea(Teacher tea) {
		this.tea = tea;
	}

	public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSpic() {
        return spic;
    }

    public void setSpic(String spic) {
        this.spic = spic == null ? null : spic.trim();
    }

    public Integer getSflag() {
        return sflag;
    }

    public void setSflag(Integer sflag) {
        this.sflag = sflag;
    }
}