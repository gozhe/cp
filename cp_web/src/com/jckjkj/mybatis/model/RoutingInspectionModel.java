package com.jckjkj.mybatis.model;

import java.util.Date;

public class RoutingInspectionModel {
    private Long rouid;

    private String equid;

    private Date signintime;

    private String singinlongitude;

    private String singinlatitude;

    private String equstate;

    private String rouphoto;

    private String roudescription;

    private String auditopinion;

    private Date audittime;

    private Integer persionid;

    public Long getRouid() {
        return rouid;
    }

    public void setRouid(Long rouid) {
        this.rouid = rouid;
    }

    public String getEquid() {
        return equid;
    }

    public void setEquid(String equid) {
        this.equid = equid == null ? null : equid.trim();
    }

    public Date getSignintime() {
        return signintime;
    }

    public void setSignintime(Date signintime) {
        this.signintime = signintime;
    }

    public String getSinginlongitude() {
        return singinlongitude;
    }

    public void setSinginlongitude(String singinlongitude) {
        this.singinlongitude = singinlongitude == null ? null : singinlongitude.trim();
    }

    public String getSinginlatitude() {
        return singinlatitude;
    }

    public void setSinginlatitude(String singinlatitude) {
        this.singinlatitude = singinlatitude == null ? null : singinlatitude.trim();
    }

    public String getEqustate() {
        return equstate;
    }

    public void setEqustate(String equstate) {
        this.equstate = equstate == null ? null : equstate.trim();
    }

    public String getRouphoto() {
        return rouphoto;
    }

    public void setRouphoto(String rouphoto) {
        this.rouphoto = rouphoto == null ? null : rouphoto.trim();
    }

    public String getRoudescription() {
        return roudescription;
    }

    public void setRoudescription(String roudescription) {
        this.roudescription = roudescription == null ? null : roudescription.trim();
    }

    public String getAuditopinion() {
        return auditopinion;
    }

    public void setAuditopinion(String auditopinion) {
        this.auditopinion = auditopinion == null ? null : auditopinion.trim();
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Integer getPersionid() {
        return persionid;
    }

    public void setPersionid(Integer persionid) {
        this.persionid = persionid;
    }
}