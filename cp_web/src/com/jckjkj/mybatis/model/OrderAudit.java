package com.jckjkj.mybatis.model;

import java.util.Date;

public class OrderAudit {
    private Integer id;

    private String faultid;

    private String aoopinion;

    private Date aodate;

    private Date completedate;

    private String repairresult;

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

    public String getAoopinion() {
        return aoopinion;
    }

    public void setAoopinion(String aoopinion) {
        this.aoopinion = aoopinion == null ? null : aoopinion.trim();
    }

    public Date getAodate() {
        return aodate;
    }

    public void setAodate(Date aodate) {
        this.aodate = aodate;
    }

    public Date getCompletedate() {
        return completedate;
    }

    public void setCompletedate(Date completedate) {
        this.completedate = completedate;
    }

    public String getRepairresult() {
        return repairresult;
    }

    public void setRepairresult(String repairresult) {
        this.repairresult = repairresult == null ? null : repairresult.trim();
    }
}