package com.jckjkj.mybatis.model;

public class RepairResult {
    private Integer id;

    private String rrvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRrvalue() {
        return rrvalue;
    }

    public void setRrvalue(String rrvalue) {
        this.rrvalue = rrvalue == null ? null : rrvalue.trim();
    }
}