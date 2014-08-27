package com.jckjkj.mybatis.model;

public class Department {
    private String id;

    private String dptdescription;

    private String dptname;

    private String dptsuperior;

    private Integer dpttype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDptdescription() {
        return dptdescription;
    }

    public void setDptdescription(String dptdescription) {
        this.dptdescription = dptdescription == null ? null : dptdescription.trim();
    }

    public String getDptname() {
        return dptname;
    }

    public void setDptname(String dptname) {
        this.dptname = dptname == null ? null : dptname.trim();
    }

    public String getDptsuperior() {
        return dptsuperior;
    }

    public void setDptsuperior(String dptsuperior) {
        this.dptsuperior = dptsuperior == null ? null : dptsuperior.trim();
    }

    public Integer getDpttype() {
        return dpttype;
    }

    public void setDpttype(Integer dpttype) {
        this.dpttype = dpttype;
    }
}