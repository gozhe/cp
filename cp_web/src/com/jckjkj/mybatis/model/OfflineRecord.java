package com.jckjkj.mybatis.model;

import java.util.Date;

public class OfflineRecord {
    private String equid;

    private Boolean online;

    private Date recorddate;

    private String warningtitle;

    private String warningdescribe;

    public String getEquid() {
        return equid;
    }

    public void setEquid(String equid) {
        this.equid = equid == null ? null : equid.trim();
    }

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public Date getRecorddate() {
        return recorddate;
    }

    public void setRecorddate(Date recorddate) {
        this.recorddate = recorddate;
    }

    public String getWarningtitle() {
        return warningtitle;
    }

    public void setWarningtitle(String warningtitle) {
        this.warningtitle = warningtitle == null ? null : warningtitle.trim();
    }

    public String getWarningdescribe() {
        return warningdescribe;
    }

    public void setWarningdescribe(String warningdescribe) {
        this.warningdescribe = warningdescribe == null ? null : warningdescribe.trim();
    }
}