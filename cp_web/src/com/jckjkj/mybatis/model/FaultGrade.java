package com.jckjkj.mybatis.model;

public class FaultGrade {
    private Integer fgid;

    private String faultgd;

    private Integer timelimit;

    private String fgdescribe;

    public Integer getFgid() {
        return fgid;
    }

    public void setFgid(Integer fgid) {
        this.fgid = fgid;
    }

    public String getFaultgd() {
        return faultgd;
    }

    public void setFaultgd(String faultgd) {
        this.faultgd = faultgd == null ? null : faultgd.trim();
    }

    public Integer getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    public String getFgdescribe() {
        return fgdescribe;
    }

    public void setFgdescribe(String fgdescribe) {
        this.fgdescribe = fgdescribe == null ? null : fgdescribe.trim();
    }
}