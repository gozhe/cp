package com.jckjkj.mybatis.model;

import java.util.Date;

public class RoutingInspection {
    private Integer id;

    private String equid;

    private Date signintime;

    private String singinlongitude;

    private String singinlatitude;

    private String equstate;

    private String rouphoto;

    private String roudescription;

    private Integer personid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getPersonid() {
        return personid;
    }

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }
}