package com.jckjkj.mybatis.model;

import java.util.Date;

public class RoutingAudit {
    private Integer id;

    private Integer routingid;

    private String aoperson;

    private Date aodate;

    private Integer routingstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoutingid() {
        return routingid;
    }

    public void setRoutingid(Integer routingid) {
        this.routingid = routingid;
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

    public Integer getRoutingstate() {
        return routingstate;
    }

    public void setRoutingstate(Integer routingstate) {
        this.routingstate = routingstate;
    }
}