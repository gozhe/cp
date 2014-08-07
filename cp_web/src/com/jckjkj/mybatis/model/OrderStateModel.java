package com.jckjkj.mybatis.model;

public class OrderStateModel {
    private Integer osid;

    private String osvalue;

    private String osdescription;

    public Integer getOsid() {
        return osid;
    }

    public void setOsid(Integer osid) {
        this.osid = osid;
    }

    public String getOsvalue() {
        return osvalue;
    }

    public void setOsvalue(String osvalue) {
        this.osvalue = osvalue == null ? null : osvalue.trim();
    }

    public String getOsdescription() {
        return osdescription;
    }

    public void setOsdescription(String osdescription) {
        this.osdescription = osdescription == null ? null : osdescription.trim();
    }
}