package com.jckjkj.mybatis.model;

import java.util.Date;

public class EquipmentState {
    private Long equstateid;

    private String equid;

    private String warningclass;

    private String warninggrade;

    private String warningstate;

    private String warningsourcename;

    private String warningsourceip;

    private Integer warningcount;

    private Date recentlyfaulttime;

    private String warningcontent;

    private Boolean ifreparing;

    private Date refreshtime;

    private Object equtype;

    private Object equip;

    public Long getEqustateid() {
        return equstateid;
    }

    public void setEqustateid(Long equstateid) {
        this.equstateid = equstateid;
    }

    public String getEquid() {
        return equid;
    }

    public void setEquid(String equid) {
        this.equid = equid == null ? null : equid.trim();
    }

    public String getWarningclass() {
        return warningclass;
    }

    public void setWarningclass(String warningclass) {
        this.warningclass = warningclass == null ? null : warningclass.trim();
    }

    public String getWarninggrade() {
        return warninggrade;
    }

    public void setWarninggrade(String warninggrade) {
        this.warninggrade = warninggrade == null ? null : warninggrade.trim();
    }

    public String getWarningstate() {
        return warningstate;
    }

    public void setWarningstate(String warningstate) {
        this.warningstate = warningstate == null ? null : warningstate.trim();
    }

    public String getWarningsourcename() {
        return warningsourcename;
    }

    public void setWarningsourcename(String warningsourcename) {
        this.warningsourcename = warningsourcename == null ? null : warningsourcename.trim();
    }

    public String getWarningsourceip() {
        return warningsourceip;
    }

    public void setWarningsourceip(String warningsourceip) {
        this.warningsourceip = warningsourceip == null ? null : warningsourceip.trim();
    }

    public Integer getWarningcount() {
        return warningcount;
    }

    public void setWarningcount(Integer warningcount) {
        this.warningcount = warningcount;
    }

    public Date getRecentlyfaulttime() {
        return recentlyfaulttime;
    }

    public void setRecentlyfaulttime(Date recentlyfaulttime) {
        this.recentlyfaulttime = recentlyfaulttime;
    }

    public String getWarningcontent() {
        return warningcontent;
    }

    public void setWarningcontent(String warningcontent) {
        this.warningcontent = warningcontent == null ? null : warningcontent.trim();
    }

    public Boolean getIfreparing() {
        return ifreparing;
    }

    public void setIfreparing(Boolean ifreparing) {
        this.ifreparing = ifreparing;
    }

    public Date getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Date refreshtime) {
        this.refreshtime = refreshtime;
    }

    public Object getEqutype() {
        return equtype;
    }

    public void setEqutype(Object equtype) {
        this.equtype = equtype;
    }

    public Object getEquip() {
        return equip;
    }

    public void setEquip(Object equip) {
        this.equip = equip;
    }
}