package com.jckjkj.mybatis.model;

public class Department {
    private Integer id;

    private String dptid;

    private String dptname;

    private Integer dpttype;

    private String dptsuperior;

    private String dptdescription;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDptid() {
        return dptid;
    }

    public void setDptid(String dptid) {
        this.dptid = dptid == null ? null : dptid.trim();
    }

    public String getDptname() {
        return dptname;
    }

    public void setDptname(String dptname) {
        this.dptname = dptname == null ? null : dptname.trim();
    }

    public Integer getDpttype() {
        return dpttype;
    }

    public void setDpttype(Integer dpttype) {
        this.dpttype = dpttype;
    }

    public String getDptsuperior() {
        return dptsuperior;
    }

    public void setDptsuperior(String dptsuperior) {
        this.dptsuperior = dptsuperior == null ? null : dptsuperior.trim();
    }

    public String getDptdescription() {
        return dptdescription;
    }

    public void setDptdescription(String dptdescription) {
        this.dptdescription = dptdescription == null ? null : dptdescription.trim();
    }
}