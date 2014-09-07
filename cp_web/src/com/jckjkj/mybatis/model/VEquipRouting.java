package com.jckjkj.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class VEquipRouting {
    private Integer id;

    private String sysNo;

    private String comNo;

    private Integer stationId;

    private BigDecimal lng;

    private BigDecimal lat;

    private Integer routingstate;

    private String aoperson;

    private Date aodate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSysNo() {
        return sysNo;
    }

    public void setSysNo(String sysNo) {
        this.sysNo = sysNo == null ? null : sysNo.trim();
    }

    public String getComNo() {
        return comNo;
    }

    public void setComNo(String comNo) {
        this.comNo = comNo == null ? null : comNo.trim();
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public Integer getRoutingstate() {
        return routingstate;
    }

    public void setRoutingstate(Integer routingstate) {
        this.routingstate = routingstate;
    }

    public String getAoperson() {
        return aoperson;
    }

    public void setAoperson(String aoperson) {
        this.aoperson = aoperson == null ? null : aoperson.trim();
    }

    public Date getAodate() {
        return aodate;
    }

    public void setAodate(Date aodate) {
        this.aodate = aodate;
    }
}