package com.jckjkj.mybatis.model;

public class RoleModel {
    private Long roleid;

    private String rolename;

    private String roledescription;

    private Integer roleaccess;

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRoledescription() {
        return roledescription;
    }

    public void setRoledescription(String roledescription) {
        this.roledescription = roledescription == null ? null : roledescription.trim();
    }

    public Integer getRoleaccess() {
        return roleaccess;
    }

    public void setRoleaccess(Integer roleaccess) {
        this.roleaccess = roleaccess;
    }
}