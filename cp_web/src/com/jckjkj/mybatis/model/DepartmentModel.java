package com.jckjkj.mybatis.model;

import java.math.BigDecimal;

public class DepartmentModel {
    private String dptid;

    private String dptdescription;

    private String dptname;

    private String dptsuperior;

    private Integer cameracount;

    private BigDecimal contractvalue;

    private Integer contractmonth;

    private String stationlist;

    public String getDptid() {
        return dptid;
    }

    public void setDptid(String dptid) {
        this.dptid = dptid == null ? null : dptid.trim();
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

    public Integer getCameracount() {
        return cameracount;
    }

    public void setCameracount(Integer cameracount) {
        this.cameracount = cameracount;
    }

    public BigDecimal getContractvalue() {
        return contractvalue;
    }

    public void setContractvalue(BigDecimal contractvalue) {
        this.contractvalue = contractvalue;
    }

    public Integer getContractmonth() {
        return contractmonth;
    }

    public void setContractmonth(Integer contractmonth) {
        this.contractmonth = contractmonth;
    }

    public String getStationlist() {
        return stationlist;
    }

    public void setStationlist(String stationlist) {
        this.stationlist = stationlist == null ? null : stationlist.trim();
    }
}