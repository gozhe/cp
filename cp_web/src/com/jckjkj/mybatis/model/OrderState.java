package com.jckjkj.mybatis.model;

public class OrderState {
    private Integer id;

    private String osvalue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOsvalue() {
        return osvalue;
    }

    public void setOsvalue(String osvalue) {
        this.osvalue = osvalue == null ? null : osvalue.trim();
    }
}