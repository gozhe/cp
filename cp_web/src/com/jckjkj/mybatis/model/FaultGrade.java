package com.jckjkj.mybatis.model;

public class FaultGrade {
    private Integer id;

    private String faultgd;

    private Integer timelimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}