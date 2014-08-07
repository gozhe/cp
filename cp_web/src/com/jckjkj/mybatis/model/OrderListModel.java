package com.jckjkj.mybatis.model;

import java.util.Date;

public class OrderListModel {
    private String orderid;

    private String equid;

    private String faultid;

    private String faulttitle;

    private String faultdescription;

    private Integer faultgrade;

    private String faultclass;

    private Date createtime;

    private Date estcomptime;

    private Integer orderstate;

    private Integer auditopinion;

    private Date audittime;

    private Date comptime;

    private Integer repairresult;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    public String getEquid() {
        return equid;
    }

    public void setEquid(String equid) {
        this.equid = equid == null ? null : equid.trim();
    }

    public String getFaultid() {
        return faultid;
    }

    public void setFaultid(String faultid) {
        this.faultid = faultid == null ? null : faultid.trim();
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

    public Integer getFaultgrade() {
        return faultgrade;
    }

    public void setFaultgrade(Integer faultgrade) {
        this.faultgrade = faultgrade;
    }

    public String getFaultclass() {
        return faultclass;
    }

    public void setFaultclass(String faultclass) {
        this.faultclass = faultclass == null ? null : faultclass.trim();
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

    public Date getComptime() {
        return comptime;
    }

    public void setComptime(Date comptime) {
        this.comptime = comptime;
    }

    public Integer getRepairresult() {
        return repairresult;
    }

    public void setRepairresult(Integer repairresult) {
        this.repairresult = repairresult;
    }
}