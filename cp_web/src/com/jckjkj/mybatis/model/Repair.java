package com.jckjkj.mybatis.model;

import java.util.Date;

public class Repair {
    private Integer id;

    private String faultid;

    private String material;

    private String count;

    private String repaircontent;

    private Date repairtime;

    private String repairer;

    private byte[] repairphoto;

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

    public String getRepaircontent() {
        return repaircontent;
    }

    public void setRepaircontent(String repaircontent) {
        this.repaircontent = repaircontent == null ? null : repaircontent.trim();
    }

    public Date getRepairtime() {
        return repairtime;
    }

    public void setRepairtime(Date repairtime) {
        this.repairtime = repairtime;
    }

    public String getRepairer() {
        return repairer;
    }

    public void setRepairer(String repairer) {
        this.repairer = repairer == null ? null : repairer.trim();
    }

    public byte[] getRepairphoto() {
        return repairphoto;
    }

    public void setRepairphoto(byte[] repairphoto) {
        this.repairphoto = repairphoto;
    }
}