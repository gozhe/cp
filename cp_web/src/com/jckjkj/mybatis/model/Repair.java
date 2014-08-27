package com.jckjkj.mybatis.model;

public class Repair {
    private Integer id;

    private String orderid;

    private String material;

    private String count;

    private String repaircontent;

    private byte[] repairphoto;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
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

    public byte[] getRepairphoto() {
        return repairphoto;
    }

    public void setRepairphoto(byte[] repairphoto) {
        this.repairphoto = repairphoto;
    }
}