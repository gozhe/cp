package com.jckjkj.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CameraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CameraExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andSysNoIsNull() {
            addCriterion("sys_no is null");
            return (Criteria) this;
        }

        public Criteria andSysNoIsNotNull() {
            addCriterion("sys_no is not null");
            return (Criteria) this;
        }

        public Criteria andSysNoEqualTo(String value) {
            addCriterion("sys_no =", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotEqualTo(String value) {
            addCriterion("sys_no <>", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThan(String value) {
            addCriterion("sys_no >", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoGreaterThanOrEqualTo(String value) {
            addCriterion("sys_no >=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThan(String value) {
            addCriterion("sys_no <", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLessThanOrEqualTo(String value) {
            addCriterion("sys_no <=", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoLike(String value) {
            addCriterion("sys_no like", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotLike(String value) {
            addCriterion("sys_no not like", value, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoIn(List<String> values) {
            addCriterion("sys_no in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotIn(List<String> values) {
            addCriterion("sys_no not in", values, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoBetween(String value1, String value2) {
            addCriterion("sys_no between", value1, value2, "sysNo");
            return (Criteria) this;
        }

        public Criteria andSysNoNotBetween(String value1, String value2) {
            addCriterion("sys_no not between", value1, value2, "sysNo");
            return (Criteria) this;
        }

        public Criteria andComNoIsNull() {
            addCriterion("com_no is null");
            return (Criteria) this;
        }

        public Criteria andComNoIsNotNull() {
            addCriterion("com_no is not null");
            return (Criteria) this;
        }

        public Criteria andComNoEqualTo(String value) {
            addCriterion("com_no =", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoNotEqualTo(String value) {
            addCriterion("com_no <>", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoGreaterThan(String value) {
            addCriterion("com_no >", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoGreaterThanOrEqualTo(String value) {
            addCriterion("com_no >=", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoLessThan(String value) {
            addCriterion("com_no <", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoLessThanOrEqualTo(String value) {
            addCriterion("com_no <=", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoLike(String value) {
            addCriterion("com_no like", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoNotLike(String value) {
            addCriterion("com_no not like", value, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoIn(List<String> values) {
            addCriterion("com_no in", values, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoNotIn(List<String> values) {
            addCriterion("com_no not in", values, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoBetween(String value1, String value2) {
            addCriterion("com_no between", value1, value2, "comNo");
            return (Criteria) this;
        }

        public Criteria andComNoNotBetween(String value1, String value2) {
            addCriterion("com_no not between", value1, value2, "comNo");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNull() {
            addCriterion("dev_name is null");
            return (Criteria) this;
        }

        public Criteria andDevNameIsNotNull() {
            addCriterion("dev_name is not null");
            return (Criteria) this;
        }

        public Criteria andDevNameEqualTo(String value) {
            addCriterion("dev_name =", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotEqualTo(String value) {
            addCriterion("dev_name <>", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThan(String value) {
            addCriterion("dev_name >", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameGreaterThanOrEqualTo(String value) {
            addCriterion("dev_name >=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThan(String value) {
            addCriterion("dev_name <", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLessThanOrEqualTo(String value) {
            addCriterion("dev_name <=", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameLike(String value) {
            addCriterion("dev_name like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotLike(String value) {
            addCriterion("dev_name not like", value, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameIn(List<String> values) {
            addCriterion("dev_name in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotIn(List<String> values) {
            addCriterion("dev_name not in", values, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameBetween(String value1, String value2) {
            addCriterion("dev_name between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andDevNameNotBetween(String value1, String value2) {
            addCriterion("dev_name not between", value1, value2, "devName");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskIsNull() {
            addCriterion("subnet_mask is null");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskIsNotNull() {
            addCriterion("subnet_mask is not null");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskEqualTo(String value) {
            addCriterion("subnet_mask =", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskNotEqualTo(String value) {
            addCriterion("subnet_mask <>", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskGreaterThan(String value) {
            addCriterion("subnet_mask >", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskGreaterThanOrEqualTo(String value) {
            addCriterion("subnet_mask >=", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskLessThan(String value) {
            addCriterion("subnet_mask <", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskLessThanOrEqualTo(String value) {
            addCriterion("subnet_mask <=", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskLike(String value) {
            addCriterion("subnet_mask like", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskNotLike(String value) {
            addCriterion("subnet_mask not like", value, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskIn(List<String> values) {
            addCriterion("subnet_mask in", values, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskNotIn(List<String> values) {
            addCriterion("subnet_mask not in", values, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskBetween(String value1, String value2) {
            addCriterion("subnet_mask between", value1, value2, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andSubnetMaskNotBetween(String value1, String value2) {
            addCriterion("subnet_mask not between", value1, value2, "subnetMask");
            return (Criteria) this;
        }

        public Criteria andGatewayIsNull() {
            addCriterion("gateway is null");
            return (Criteria) this;
        }

        public Criteria andGatewayIsNotNull() {
            addCriterion("gateway is not null");
            return (Criteria) this;
        }

        public Criteria andGatewayEqualTo(String value) {
            addCriterion("gateway =", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayNotEqualTo(String value) {
            addCriterion("gateway <>", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayGreaterThan(String value) {
            addCriterion("gateway >", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayGreaterThanOrEqualTo(String value) {
            addCriterion("gateway >=", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayLessThan(String value) {
            addCriterion("gateway <", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayLessThanOrEqualTo(String value) {
            addCriterion("gateway <=", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayLike(String value) {
            addCriterion("gateway like", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayNotLike(String value) {
            addCriterion("gateway not like", value, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayIn(List<String> values) {
            addCriterion("gateway in", values, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayNotIn(List<String> values) {
            addCriterion("gateway not in", values, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayBetween(String value1, String value2) {
            addCriterion("gateway between", value1, value2, "gateway");
            return (Criteria) this;
        }

        public Criteria andGatewayNotBetween(String value1, String value2) {
            addCriterion("gateway not between", value1, value2, "gateway");
            return (Criteria) this;
        }

        public Criteria andStorageIpIsNull() {
            addCriterion("storage_ip is null");
            return (Criteria) this;
        }

        public Criteria andStorageIpIsNotNull() {
            addCriterion("storage_ip is not null");
            return (Criteria) this;
        }

        public Criteria andStorageIpEqualTo(String value) {
            addCriterion("storage_ip =", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpNotEqualTo(String value) {
            addCriterion("storage_ip <>", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpGreaterThan(String value) {
            addCriterion("storage_ip >", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpGreaterThanOrEqualTo(String value) {
            addCriterion("storage_ip >=", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpLessThan(String value) {
            addCriterion("storage_ip <", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpLessThanOrEqualTo(String value) {
            addCriterion("storage_ip <=", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpLike(String value) {
            addCriterion("storage_ip like", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpNotLike(String value) {
            addCriterion("storage_ip not like", value, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpIn(List<String> values) {
            addCriterion("storage_ip in", values, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpNotIn(List<String> values) {
            addCriterion("storage_ip not in", values, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpBetween(String value1, String value2) {
            addCriterion("storage_ip between", value1, value2, "storageIp");
            return (Criteria) this;
        }

        public Criteria andStorageIpNotBetween(String value1, String value2) {
            addCriterion("storage_ip not between", value1, value2, "storageIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpIsNull() {
            addCriterion("forward_ip is null");
            return (Criteria) this;
        }

        public Criteria andForwardIpIsNotNull() {
            addCriterion("forward_ip is not null");
            return (Criteria) this;
        }

        public Criteria andForwardIpEqualTo(String value) {
            addCriterion("forward_ip =", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpNotEqualTo(String value) {
            addCriterion("forward_ip <>", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpGreaterThan(String value) {
            addCriterion("forward_ip >", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpGreaterThanOrEqualTo(String value) {
            addCriterion("forward_ip >=", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpLessThan(String value) {
            addCriterion("forward_ip <", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpLessThanOrEqualTo(String value) {
            addCriterion("forward_ip <=", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpLike(String value) {
            addCriterion("forward_ip like", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpNotLike(String value) {
            addCriterion("forward_ip not like", value, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpIn(List<String> values) {
            addCriterion("forward_ip in", values, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpNotIn(List<String> values) {
            addCriterion("forward_ip not in", values, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpBetween(String value1, String value2) {
            addCriterion("forward_ip between", value1, value2, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andForwardIpNotBetween(String value1, String value2) {
            addCriterion("forward_ip not between", value1, value2, "forwardIp");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIsNull() {
            addCriterion("addr_code is null");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIsNotNull() {
            addCriterion("addr_code is not null");
            return (Criteria) this;
        }

        public Criteria andAddrCodeEqualTo(Integer value) {
            addCriterion("addr_code =", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotEqualTo(Integer value) {
            addCriterion("addr_code <>", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeGreaterThan(Integer value) {
            addCriterion("addr_code >", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("addr_code >=", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLessThan(Integer value) {
            addCriterion("addr_code <", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeLessThanOrEqualTo(Integer value) {
            addCriterion("addr_code <=", value, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeIn(List<Integer> values) {
            addCriterion("addr_code in", values, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotIn(List<Integer> values) {
            addCriterion("addr_code not in", values, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeBetween(Integer value1, Integer value2) {
            addCriterion("addr_code between", value1, value2, "addrCode");
            return (Criteria) this;
        }

        public Criteria andAddrCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("addr_code not between", value1, value2, "addrCode");
            return (Criteria) this;
        }

        public Criteria andNtpIpIsNull() {
            addCriterion("ntp_ip is null");
            return (Criteria) this;
        }

        public Criteria andNtpIpIsNotNull() {
            addCriterion("ntp_ip is not null");
            return (Criteria) this;
        }

        public Criteria andNtpIpEqualTo(String value) {
            addCriterion("ntp_ip =", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpNotEqualTo(String value) {
            addCriterion("ntp_ip <>", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpGreaterThan(String value) {
            addCriterion("ntp_ip >", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpGreaterThanOrEqualTo(String value) {
            addCriterion("ntp_ip >=", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpLessThan(String value) {
            addCriterion("ntp_ip <", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpLessThanOrEqualTo(String value) {
            addCriterion("ntp_ip <=", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpLike(String value) {
            addCriterion("ntp_ip like", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpNotLike(String value) {
            addCriterion("ntp_ip not like", value, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpIn(List<String> values) {
            addCriterion("ntp_ip in", values, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpNotIn(List<String> values) {
            addCriterion("ntp_ip not in", values, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpBetween(String value1, String value2) {
            addCriterion("ntp_ip between", value1, value2, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andNtpIpNotBetween(String value1, String value2) {
            addCriterion("ntp_ip not between", value1, value2, "ntpIp");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDevBrandIsNull() {
            addCriterion("dev_brand is null");
            return (Criteria) this;
        }

        public Criteria andDevBrandIsNotNull() {
            addCriterion("dev_brand is not null");
            return (Criteria) this;
        }

        public Criteria andDevBrandEqualTo(Integer value) {
            addCriterion("dev_brand =", value, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandNotEqualTo(Integer value) {
            addCriterion("dev_brand <>", value, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandGreaterThan(Integer value) {
            addCriterion("dev_brand >", value, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_brand >=", value, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandLessThan(Integer value) {
            addCriterion("dev_brand <", value, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandLessThanOrEqualTo(Integer value) {
            addCriterion("dev_brand <=", value, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandIn(List<Integer> values) {
            addCriterion("dev_brand in", values, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandNotIn(List<Integer> values) {
            addCriterion("dev_brand not in", values, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandBetween(Integer value1, Integer value2) {
            addCriterion("dev_brand between", value1, value2, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevBrandNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_brand not between", value1, value2, "devBrand");
            return (Criteria) this;
        }

        public Criteria andDevModelIsNull() {
            addCriterion("dev_model is null");
            return (Criteria) this;
        }

        public Criteria andDevModelIsNotNull() {
            addCriterion("dev_model is not null");
            return (Criteria) this;
        }

        public Criteria andDevModelEqualTo(Integer value) {
            addCriterion("dev_model =", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelNotEqualTo(Integer value) {
            addCriterion("dev_model <>", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelGreaterThan(Integer value) {
            addCriterion("dev_model >", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_model >=", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelLessThan(Integer value) {
            addCriterion("dev_model <", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelLessThanOrEqualTo(Integer value) {
            addCriterion("dev_model <=", value, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelIn(List<Integer> values) {
            addCriterion("dev_model in", values, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelNotIn(List<Integer> values) {
            addCriterion("dev_model not in", values, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelBetween(Integer value1, Integer value2) {
            addCriterion("dev_model between", value1, value2, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevModelNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_model not between", value1, value2, "devModel");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNull() {
            addCriterion("dev_type is null");
            return (Criteria) this;
        }

        public Criteria andDevTypeIsNotNull() {
            addCriterion("dev_type is not null");
            return (Criteria) this;
        }

        public Criteria andDevTypeEqualTo(Integer value) {
            addCriterion("dev_type =", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotEqualTo(Integer value) {
            addCriterion("dev_type <>", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThan(Integer value) {
            addCriterion("dev_type >", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dev_type >=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThan(Integer value) {
            addCriterion("dev_type <", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dev_type <=", value, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeIn(List<Integer> values) {
            addCriterion("dev_type in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotIn(List<Integer> values) {
            addCriterion("dev_type not in", values, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeBetween(Integer value1, Integer value2) {
            addCriterion("dev_type between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andDevTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dev_type not between", value1, value2, "devType");
            return (Criteria) this;
        }

        public Criteria andNetDateIsNull() {
            addCriterion("net_date is null");
            return (Criteria) this;
        }

        public Criteria andNetDateIsNotNull() {
            addCriterion("net_date is not null");
            return (Criteria) this;
        }

        public Criteria andNetDateEqualTo(String value) {
            addCriterion("net_date =", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateNotEqualTo(String value) {
            addCriterion("net_date <>", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateGreaterThan(String value) {
            addCriterion("net_date >", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateGreaterThanOrEqualTo(String value) {
            addCriterion("net_date >=", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateLessThan(String value) {
            addCriterion("net_date <", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateLessThanOrEqualTo(String value) {
            addCriterion("net_date <=", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateLike(String value) {
            addCriterion("net_date like", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateNotLike(String value) {
            addCriterion("net_date not like", value, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateIn(List<String> values) {
            addCriterion("net_date in", values, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateNotIn(List<String> values) {
            addCriterion("net_date not in", values, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateBetween(String value1, String value2) {
            addCriterion("net_date between", value1, value2, "netDate");
            return (Criteria) this;
        }

        public Criteria andNetDateNotBetween(String value1, String value2) {
            addCriterion("net_date not between", value1, value2, "netDate");
            return (Criteria) this;
        }

        public Criteria andLngIsNull() {
            addCriterion("lng is null");
            return (Criteria) this;
        }

        public Criteria andLngIsNotNull() {
            addCriterion("lng is not null");
            return (Criteria) this;
        }

        public Criteria andLngEqualTo(BigDecimal value) {
            addCriterion("lng =", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotEqualTo(BigDecimal value) {
            addCriterion("lng <>", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThan(BigDecimal value) {
            addCriterion("lng >", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lng >=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThan(BigDecimal value) {
            addCriterion("lng <", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lng <=", value, "lng");
            return (Criteria) this;
        }

        public Criteria andLngIn(List<BigDecimal> values) {
            addCriterion("lng in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotIn(List<BigDecimal> values) {
            addCriterion("lng not in", values, "lng");
            return (Criteria) this;
        }

        public Criteria andLngBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLngNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng not between", value1, value2, "lng");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(BigDecimal value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(BigDecimal value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(BigDecimal value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(BigDecimal value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<BigDecimal> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<BigDecimal> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLngOffsetIsNull() {
            addCriterion("lng_offset is null");
            return (Criteria) this;
        }

        public Criteria andLngOffsetIsNotNull() {
            addCriterion("lng_offset is not null");
            return (Criteria) this;
        }

        public Criteria andLngOffsetEqualTo(BigDecimal value) {
            addCriterion("lng_offset =", value, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetNotEqualTo(BigDecimal value) {
            addCriterion("lng_offset <>", value, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetGreaterThan(BigDecimal value) {
            addCriterion("lng_offset >", value, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lng_offset >=", value, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetLessThan(BigDecimal value) {
            addCriterion("lng_offset <", value, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lng_offset <=", value, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetIn(List<BigDecimal> values) {
            addCriterion("lng_offset in", values, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetNotIn(List<BigDecimal> values) {
            addCriterion("lng_offset not in", values, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng_offset between", value1, value2, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLngOffsetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lng_offset not between", value1, value2, "lngOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetIsNull() {
            addCriterion("lat_offset is null");
            return (Criteria) this;
        }

        public Criteria andLatOffsetIsNotNull() {
            addCriterion("lat_offset is not null");
            return (Criteria) this;
        }

        public Criteria andLatOffsetEqualTo(BigDecimal value) {
            addCriterion("lat_offset =", value, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetNotEqualTo(BigDecimal value) {
            addCriterion("lat_offset <>", value, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetGreaterThan(BigDecimal value) {
            addCriterion("lat_offset >", value, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lat_offset >=", value, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetLessThan(BigDecimal value) {
            addCriterion("lat_offset <", value, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lat_offset <=", value, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetIn(List<BigDecimal> values) {
            addCriterion("lat_offset in", values, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetNotIn(List<BigDecimal> values) {
            addCriterion("lat_offset not in", values, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat_offset between", value1, value2, "latOffset");
            return (Criteria) this;
        }

        public Criteria andLatOffsetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lat_offset not between", value1, value2, "latOffset");
            return (Criteria) this;
        }

        public Criteria andContractorIsNull() {
            addCriterion("contractor is null");
            return (Criteria) this;
        }

        public Criteria andContractorIsNotNull() {
            addCriterion("contractor is not null");
            return (Criteria) this;
        }

        public Criteria andContractorEqualTo(Integer value) {
            addCriterion("contractor =", value, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorNotEqualTo(Integer value) {
            addCriterion("contractor <>", value, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorGreaterThan(Integer value) {
            addCriterion("contractor >", value, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorGreaterThanOrEqualTo(Integer value) {
            addCriterion("contractor >=", value, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorLessThan(Integer value) {
            addCriterion("contractor <", value, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorLessThanOrEqualTo(Integer value) {
            addCriterion("contractor <=", value, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorIn(List<Integer> values) {
            addCriterion("contractor in", values, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorNotIn(List<Integer> values) {
            addCriterion("contractor not in", values, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorBetween(Integer value1, Integer value2) {
            addCriterion("contractor between", value1, value2, "contractor");
            return (Criteria) this;
        }

        public Criteria andContractorNotBetween(Integer value1, Integer value2) {
            addCriterion("contractor not between", value1, value2, "contractor");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNull() {
            addCriterion("order_seq is null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIsNotNull() {
            addCriterion("order_seq is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSeqEqualTo(Integer value) {
            addCriterion("order_seq =", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotEqualTo(Integer value) {
            addCriterion("order_seq <>", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThan(Integer value) {
            addCriterion("order_seq >", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_seq >=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThan(Integer value) {
            addCriterion("order_seq <", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqLessThanOrEqualTo(Integer value) {
            addCriterion("order_seq <=", value, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqIn(List<Integer> values) {
            addCriterion("order_seq in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotIn(List<Integer> values) {
            addCriterion("order_seq not in", values, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqBetween(Integer value1, Integer value2) {
            addCriterion("order_seq between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andOrderSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("order_seq not between", value1, value2, "orderSeq");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}