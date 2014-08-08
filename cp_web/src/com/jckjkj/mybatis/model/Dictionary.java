package com.jckjkj.mybatis.model;

public class Dictionary {
    private Integer dicid;

    private String dicname;

    private String dicvalue;

    public Integer getDicid() {
        return dicid;
    }

    public void setDicid(Integer dicid) {
        this.dicid = dicid;
    }

    public String getDicname() {
        return dicname;
    }

    public void setDicname(String dicname) {
        this.dicname = dicname == null ? null : dicname.trim();
    }

    public String getDicvalue() {
        return dicvalue;
    }

    public void setDicvalue(String dicvalue) {
        this.dicvalue = dicvalue == null ? null : dicvalue.trim();
    }
}