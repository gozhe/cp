package com.jckjkj.mybatis.model;

public class PaymentRatio {
    private Integer id;

    private Double passlow;

    private Double passhigh;

    private Double paymentratio;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPasslow() {
        return passlow;
    }

    public void setPasslow(Double passlow) {
        this.passlow = passlow;
    }

    public Double getPasshigh() {
        return passhigh;
    }

    public void setPasshigh(Double passhigh) {
        this.passhigh = passhigh;
    }

    public Double getPaymentratio() {
        return paymentratio;
    }

    public void setPaymentratio(Double paymentratio) {
        this.paymentratio = paymentratio;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}