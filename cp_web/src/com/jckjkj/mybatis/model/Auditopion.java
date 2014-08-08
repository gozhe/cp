package com.jckjkj.mybatis.model;

public class Auditopion {
    private Integer aoid;

    private String aoopinion;

    private String aodescription;

    public Integer getAoid() {
        return aoid;
    }

    public void setAoid(Integer aoid) {
        this.aoid = aoid;
    }

    public String getAoopinion() {
        return aoopinion;
    }

    public void setAoopinion(String aoopinion) {
        this.aoopinion = aoopinion == null ? null : aoopinion.trim();
    }

    public String getAodescription() {
        return aodescription;
    }

    public void setAodescription(String aodescription) {
        this.aodescription = aodescription == null ? null : aodescription.trim();
    }
}