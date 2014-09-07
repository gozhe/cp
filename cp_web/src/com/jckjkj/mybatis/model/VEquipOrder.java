package com.jckjkj.mybatis.model;

import java.util.Date;

public class VEquipOrder {
    private Integer id;

    private String faultid;

    private String equid;

    private String faulttitle;

    private String faultdescription;

    private String faultgrade;

    private String faultclass;

    private String faultclass1;

    private String creater;

    private Date createtime;

    private Date estcomptime;

    private Integer orderstate;

    private Integer ordersource;

    private Integer stationId;

    private String mid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaultid() {
        return faultid;
    }

    public void setFaultid(String faultid) {
        this.faultid = faultid == null ? null : faultid.trim();
    }

    public String getEquid() {
        return equid;
    }

    public void setEquid(String equid) {
        this.equid = equid == null ? null : equid.trim();
    }

    public String getFaulttitle() {
        return faulttitle;
    }

    public void setFaulttitle(String faulttitle) {
        this.faulttitle = faulttitle == null ? null : faulttitle.trim();
    }

    public String getFaultdescription() {
        return faultdescription;
    }

    public void setFaultdescription(String faultdescription) {
        this.faultdescription = faultdescription == null ? null : faultdescription.trim();
    }

    public String getFaultgrade() {
        return faultgrade;
    }

    public void setFaultgrade(String faultgrade) {
        this.faultgrade = faultgrade == null ? null : faultgrade.trim();
    }

    public String getFaultclass() {
        return faultclass;
    }

    public void setFaultclass(String faultclass) {
        this.faultclass = faultclass == null ? null : faultclass.trim();
    }

    public String getFaultclass1() {
        return faultclass1;
    }

    public void setFaultclass1(String faultclass1) {
        this.faultclass1 = faultclass1 == null ? null : faultclass1.trim();
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getEstcomptime() {
        return estcomptime;
    }

    public void setEstcomptime(Date estcomptime) {
        this.estcomptime = estcomptime;
    }

    public Integer getOrderstate() {
        return orderstate;
    }

    public void setOrderstate(Integer orderstate) {
        this.orderstate = orderstate;
    }

    public Integer getOrdersource() {
        return ordersource;
    }

    public void setOrdersource(Integer ordersource) {
        this.ordersource = ordersource;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid == null ? null : mid.trim();
    }
}