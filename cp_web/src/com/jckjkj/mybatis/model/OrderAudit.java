package com.jckjkj.mybatis.model;

import java.util.Date;

public class OrderAudit {
    private Integer id;

    private String faultid;

    private Integer auditopinion;

    private Date audittime;

    private Integer repairresult;

    private Date completetime;

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

    public Integer getAuditopinion() {
        return auditopinion;
    }

    public void setAuditopinion(Integer auditopinion) {
        this.auditopinion = auditopinion;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public Integer getRepairresult() {
        return repairresult;
    }

    public void setRepairresult(Integer repairresult) {
        this.repairresult = repairresult;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }
}