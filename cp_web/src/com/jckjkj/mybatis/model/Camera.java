package com.jckjkj.mybatis.model;

public class Camera {
    private String cameraid;

    private String cameraname;

    public String getCameraid() {
        return cameraid;
    }

    public void setCameraid(String cameraid) {
        this.cameraid = cameraid == null ? null : cameraid.trim();
    }

    public String getCameraname() {
        return cameraname;
    }

    public void setCameraname(String cameraname) {
        this.cameraname = cameraname == null ? null : cameraname.trim();
    }
}