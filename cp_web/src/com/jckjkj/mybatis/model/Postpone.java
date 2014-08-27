package com.jckjkj.mybatis.model;

public class Postpone {
    private Integer id;

    private String orderid;

    private Integer timelimit;

    private String reason;

    private String personid;

    private Integer audiopinion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public Integer getTimelimit() {
        return timelimit;
    }

    public void setTimelimit(Integer timelimit) {
        this.timelimit = timelimit;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public Integer getAudiopinion() {
        return audiopinion;
    }

    public void setAudiopinion(Integer audiopinion) {
        this.audiopinion = audiopinion;
    }
}