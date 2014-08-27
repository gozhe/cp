package com.jckjkj.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Camera {
    private Integer id;

    private Integer stationId;

    private String sysNo;

    private String comNo;

    private String devName;

    private String ip;

    private String subnetMask;

    private String gateway;

    private String storageIp;

    private String forwardIp;

    private Integer port;

    private Integer addrCode;

    private String ntpIp;

    private String address;

    private Integer devBrand;

    private Integer devModel;

    private Integer devType;

    private String netDate;

    private BigDecimal lng;

    private BigDecimal lat;

    private BigDecimal lngOffset;

    private BigDecimal latOffset;

    private Integer contractor;

    private String description;

    private Integer orderSeq;

    private Integer channel;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public String getSysNo() {
        return sysNo;
    }

    public void setSysNo(String sysNo) {
        this.sysNo = sysNo == null ? null : sysNo.trim();
    }

    public String getComNo() {
        return comNo;
    }

    public void setComNo(String comNo) {
        this.comNo = comNo == null ? null : comNo.trim();
    }

    public String getDevName() {
        return devName;
    }

    public void setDevName(String devName) {
        this.devName = devName == null ? null : devName.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask == null ? null : subnetMask.trim();
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway == null ? null : gateway.trim();
    }

    public String getStorageIp() {
        return storageIp;
    }

    public void setStorageIp(String storageIp) {
        this.storageIp = storageIp == null ? null : storageIp.trim();
    }

    public String getForwardIp() {
        return forwardIp;
    }

    public void setForwardIp(String forwardIp) {
        this.forwardIp = forwardIp == null ? null : forwardIp.trim();
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getAddrCode() {
        return addrCode;
    }

    public void setAddrCode(Integer addrCode) {
        this.addrCode = addrCode;
    }

    public String getNtpIp() {
        return ntpIp;
    }

    public void setNtpIp(String ntpIp) {
        this.ntpIp = ntpIp == null ? null : ntpIp.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getDevBrand() {
        return devBrand;
    }

    public void setDevBrand(Integer devBrand) {
        this.devBrand = devBrand;
    }

    public Integer getDevModel() {
        return devModel;
    }

    public void setDevModel(Integer devModel) {
        this.devModel = devModel;
    }

    public Integer getDevType() {
        return devType;
    }

    public void setDevType(Integer devType) {
        this.devType = devType;
    }

    public String getNetDate() {
        return netDate;
    }

    public void setNetDate(String netDate) {
        this.netDate = netDate == null ? null : netDate.trim();
    }

    public BigDecimal getLng() {
        return lng;
    }

    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    public BigDecimal getLat() {
        return lat;
    }

    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    public BigDecimal getLngOffset() {
        return lngOffset;
    }

    public void setLngOffset(BigDecimal lngOffset) {
        this.lngOffset = lngOffset;
    }

    public BigDecimal getLatOffset() {
        return latOffset;
    }

    public void setLatOffset(BigDecimal latOffset) {
        this.latOffset = latOffset;
    }

    public Integer getContractor() {
        return contractor;
    }

    public void setContractor(Integer contractor) {
        this.contractor = contractor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getOrderSeq() {
        return orderSeq;
    }

    public void setOrderSeq(Integer orderSeq) {
        this.orderSeq = orderSeq;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}