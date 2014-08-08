package com.jckjkj.mybatis.model;

public class RepairResult {
    private Integer rrid;

    private String rrvalue;

    private String rrvaluedescribe;

    public Integer getRrid() {
        return rrid;
    }

    public void setRrid(Integer rrid) {
        this.rrid = rrid;
    }

    public String getRrvalue() {
        return rrvalue;
    }

    public void setRrvalue(String rrvalue) {
        this.rrvalue = rrvalue == null ? null : rrvalue.trim();
    }

    public String getRrvaluedescribe() {
        return rrvaluedescribe;
    }

    public void setRrvaluedescribe(String rrvaluedescribe) {
        this.rrvaluedescribe = rrvaluedescribe == null ? null : rrvaluedescribe.trim();
    }
}