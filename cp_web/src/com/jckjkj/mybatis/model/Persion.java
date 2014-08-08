package com.jckjkj.mybatis.model;

public class Persion {
    private Long persionid;

    private String pername;

    private String dptid;

    public Long getPersionid() {
        return persionid;
    }

    public void setPersionid(Long persionid) {
        this.persionid = persionid;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername == null ? null : pername.trim();
    }

    public String getDptid() {
        return dptid;
    }

    public void setDptid(String dptid) {
        this.dptid = dptid == null ? null : dptid.trim();
    }
}