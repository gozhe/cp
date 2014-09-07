package com.jckjkj.mybatis.model;

import java.util.Date;

public class VOrderRepair {
    private Integer id;

    private String equid;

    private String faultid;

    private String faulttitle;

    private String faultdescription;

    private String faultgrade;

    private String faultclass;

    private Date createtime;

    private String creater;

    private Date estcomptime;

    private Integer orderstate;

    private String faultclass1;

    private Integer ordersource;

    private String material;

    private String count;

    private String repairer;

    private Date repairtime;

    private String repaircontent;

    private byte[] repairphoto;

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

    public String getFaultgrade() {
        return faultgrade;
    }

    public void setFaultgrade(String faultgrade) {
        this.faultgrade = faultgrade == null ? null : faultgrade.trim();
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

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
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

    public String getFaultclass1() {
        return faultclass1;
    }

    public void setFaultclass1(String faultclass1) {
        this.faultclass1 = faultclass1 == null ? null : faultclass1.trim();
    }

    public Integer getOrdersource() {
        return ordersource;
    }

    public void setOrdersource(Integer ordersource) {
        this.ordersource = ordersource;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material == null ? null : material.trim();
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count == null ? null : count.trim();
    }

    public String getRepairer() {
        return repairer;
    }

    public void setRepairer(String repairer) {
        this.repairer = repairer == null ? null : repairer.trim();
    }

    public Date getRepairtime() {
        return repairtime;
    }

    public void setRepairtime(Date repairtime) {
        this.repairtime = repairtime;
    }

    public String getRepaircontent() {
        return repaircontent;
    }

    public void setRepaircontent(String repaircontent) {
        this.repaircontent = repaircontent == null ? null : repaircontent.trim();
    }

    public byte[] getRepairphoto() {
        return repairphoto;
    }

    public void setRepairphoto(byte[] repairphoto) {
        this.repairphoto = repairphoto;
    }
}