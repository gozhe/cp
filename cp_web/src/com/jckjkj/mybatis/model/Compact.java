package com.jckjkj.mybatis.model;

import java.util.Date;

public class Compact {
    private Integer id;

    private String compid;

    private String compactname;

    private String dptid;

    private Date starttime;

    private Date endtime;

    private Integer monthcount;

    private String contractamount;

    private Integer cameracount;

    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompid() {
        return compid;
    }

    public void setCompid(String compid) {
        this.compid = compid == null ? null : compid.trim();
    }

    public String getCompactname() {
        return compactname;
    }

    public void setCompactname(String compactname) {
        this.compactname = compactname == null ? null : compactname.trim();
    }

    public String getDptid() {
        return dptid;
    }

    public void setDptid(String dptid) {
        this.dptid = dptid == null ? null : dptid.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getMonthcount() {
        return monthcount;
    }

    public void setMonthcount(Integer monthcount) {
        this.monthcount = monthcount;
    }

    public String getContractamount() {
        return contractamount;
    }

    public void setContractamount(String contractamount) {
        this.contractamount = contractamount == null ? null : contractamount.trim();
    }

    public Integer getCameracount() {
        return cameracount;
    }

    public void setCameracount(Integer cameracount) {
        this.cameracount = cameracount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}