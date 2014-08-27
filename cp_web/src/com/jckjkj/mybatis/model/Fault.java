package com.jckjkj.mybatis.model;

public class Fault {
    private Integer id;

    private String equipid;

    private Integer faultcount1;

    private Integer faultcount2;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEquipid() {
        return equipid;
    }

    public void setEquipid(String equipid) {
        this.equipid = equipid == null ? null : equipid.trim();
    }

    public Integer getFaultcount1() {
        return faultcount1;
    }

    public void setFaultcount1(Integer faultcount1) {
        this.faultcount1 = faultcount1;
    }

    public Integer getFaultcount2() {
        return faultcount2;
    }

    public void setFaultcount2(Integer faultcount2) {
        this.faultcount2 = faultcount2;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}