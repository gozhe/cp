package com.jckjkj.mybatis.model;

public class Mobile {
    private Long mobileid;

    private String imei;

    private String phonenumber;

    private String dptid;

    public Long getMobileid() {
        return mobileid;
    }

    public void setMobileid(Long mobileid) {
        this.mobileid = mobileid;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei == null ? null : imei.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public String getDptid() {
        return dptid;
    }

    public void setDptid(String dptid) {
        this.dptid = dptid == null ? null : dptid.trim();
    }
}