package com.jckjkj.mybatis.model;

public class ModuleModel {
    private Integer modelid;

    private String modelname;

    private Integer modelroleaccess;

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public String getModelname() {
        return modelname;
    }

    public void setModelname(String modelname) {
        this.modelname = modelname == null ? null : modelname.trim();
    }

    public Integer getModelroleaccess() {
        return modelroleaccess;
    }

    public void setModelroleaccess(Integer modelroleaccess) {
        this.modelroleaccess = modelroleaccess;
    }
}