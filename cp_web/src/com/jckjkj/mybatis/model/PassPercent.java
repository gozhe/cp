package com.jckjkj.mybatis.model;

public class PassPercent {
    private Integer id;

    private String dptid;

    private Double passpercent7am;

    private Double passpercent12am;

    private Double passpercent5pm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDptid() {
        return dptid;
    }

    public void setDptid(String dptid) {
        this.dptid = dptid == null ? null : dptid.trim();
    }

    public Double getPasspercent7am() {
        return passpercent7am;
    }

    public void setPasspercent7am(Double passpercent7am) {
        this.passpercent7am = passpercent7am;
    }

    public Double getPasspercent12am() {
        return passpercent12am;
    }

    public void setPasspercent12am(Double passpercent12am) {
        this.passpercent12am = passpercent12am;
    }

    public Double getPasspercent5pm() {
        return passpercent5pm;
    }

    public void setPasspercent5pm(Double passpercent5pm) {
        this.passpercent5pm = passpercent5pm;
    }
}