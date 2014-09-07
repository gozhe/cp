package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEquidIsNull() {
            addCriterion("equid is null");
            return (Criteria) this;
        }

        public Criteria andEquidIsNotNull() {
            addCriterion("equid is not null");
            return (Criteria) this;
        }

        public Criteria andEquidEqualTo(String value) {
            addCriterion("equid =", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotEqualTo(String value) {
            addCriterion("equid <>", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidGreaterThan(String value) {
            addCriterion("equid >", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidGreaterThanOrEqualTo(String value) {
            addCriterion("equid >=", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLessThan(String value) {
            addCriterion("equid <", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLessThanOrEqualTo(String value) {
            addCriterion("equid <=", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLike(String value) {
            addCriterion("equid like", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotLike(String value) {
            addCriterion("equid not like", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidIn(List<String> values) {
            addCriterion("equid in", values, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotIn(List<String> values) {
            addCriterion("equid not in", values, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidBetween(String value1, String value2) {
            addCriterion("equid between", value1, value2, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotBetween(String value1, String value2) {
            addCriterion("equid not between", value1, value2, "equid");
            return (Criteria) this;
        }

        public Criteria andStationidIsNull() {
            addCriterion("stationid is null");
            return (Criteria) this;
        }

        public Criteria andStationidIsNotNull() {
            addCriterion("stationid is not null");
            return (Criteria) this;
        }

        public Criteria andStationidEqualTo(Integer value) {
            addCriterion("stationid =", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotEqualTo(Integer value) {
            addCriterion("stationid <>", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThan(Integer value) {
            addCriterion("stationid >", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("stationid >=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThan(Integer value) {
            addCriterion("stationid <", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidLessThanOrEqualTo(Integer value) {
            addCriterion("stationid <=", value, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidIn(List<Integer> values) {
            addCriterion("stationid in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotIn(List<Integer> values) {
            addCriterion("stationid not in", values, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidBetween(Integer value1, Integer value2) {
            addCriterion("stationid between", value1, value2, "stationid");
            return (Criteria) this;
        }

        public Criteria andStationidNotBetween(Integer value1, Integer value2) {
            addCriterion("stationid not between", value1, value2, "stationid");
            return (Criteria) this;
        }

        public Criteria andEqutypeIsNull() {
            addCriterion("equtype is null");
            return (Criteria) this;
        }

        public Criteria andEqutypeIsNotNull() {
            addCriterion("equtype is not null");
            return (Criteria) this;
        }

        public Criteria andEqutypeEqualTo(String value) {
            addCriterion("equtype =", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotEqualTo(String value) {
            addCriterion("equtype <>", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeGreaterThan(String value) {
            addCriterion("equtype >", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeGreaterThanOrEqualTo(String value) {
            addCriterion("equtype >=", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeLessThan(String value) {
            addCriterion("equtype <", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeLessThanOrEqualTo(String value) {
            addCriterion("equtype <=", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeLike(String value) {
            addCriterion("equtype like", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotLike(String value) {
            addCriterion("equtype not like", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeIn(List<String> values) {
            addCriterion("equtype in", values, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotIn(List<String> values) {
            addCriterion("equtype not in", values, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeBetween(String value1, String value2) {
            addCriterion("equtype between", value1, value2, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotBetween(String value1, String value2) {
            addCriterion("equtype not between", value1, value2, "equtype");
            return (Criteria) this;
        }

        public Criteria andEquipIsNull() {
            addCriterion("equip is null");
            return (Criteria) this;
        }

        public Criteria andEquipIsNotNull() {
            addCriterion("equip is not null");
            return (Criteria) this;
        }

        public Criteria andEquipEqualTo(String value) {
            addCriterion("equip =", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotEqualTo(String value) {
            addCriterion("equip <>", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipGreaterThan(String value) {
            addCriterion("equip >", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipGreaterThanOrEqualTo(String value) {
            addCriterion("equip >=", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLessThan(String value) {
            addCriterion("equip <", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLessThanOrEqualTo(String value) {
            addCriterion("equip <=", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLike(String value) {
            addCriterion("equip like", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotLike(String value) {
            addCriterion("equip not like", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipIn(List<String> values) {
            addCriterion("equip in", values, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotIn(List<String> values) {
            addCriterion("equip not in", values, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipBetween(String value1, String value2) {
            addCriterion("equip between", value1, value2, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotBetween(String value1, String value2) {
            addCriterion("equip not between", value1, value2, "equip");
            return (Criteria) this;
        }

        public Criteria andEqunameIsNull() {
            addCriterion("equname is null");
            return (Criteria) this;
        }

        public Criteria andEqunameIsNotNull() {
            addCriterion("equname is not null");
            return (Criteria) this;
        }

        public Criteria andEqunameEqualTo(String value) {
            addCriterion("equname =", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameNotEqualTo(String value) {
            addCriterion("equname <>", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameGreaterThan(String value) {
            addCriterion("equname >", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameGreaterThanOrEqualTo(String value) {
            addCriterion("equname >=", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameLessThan(String value) {
            addCriterion("equname <", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameLessThanOrEqualTo(String value) {
            addCriterion("equname <=", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameLike(String value) {
            addCriterion("equname like", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameNotLike(String value) {
            addCriterion("equname not like", value, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameIn(List<String> values) {
            addCriterion("equname in", values, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameNotIn(List<String> values) {
            addCriterion("equname not in", values, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameBetween(String value1, String value2) {
            addCriterion("equname between", value1, value2, "equname");
            return (Criteria) this;
        }

        public Criteria andEqunameNotBetween(String value1, String value2) {
            addCriterion("equname not between", value1, value2, "equname");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskIsNull() {
            addCriterion("equsubnetmask is null");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskIsNotNull() {
            addCriterion("equsubnetmask is not null");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskEqualTo(String value) {
            addCriterion("equsubnetmask =", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskNotEqualTo(String value) {
            addCriterion("equsubnetmask <>", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskGreaterThan(String value) {
            addCriterion("equsubnetmask >", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskGreaterThanOrEqualTo(String value) {
            addCriterion("equsubnetmask >=", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskLessThan(String value) {
            addCriterion("equsubnetmask <", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskLessThanOrEqualTo(String value) {
            addCriterion("equsubnetmask <=", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskLike(String value) {
            addCriterion("equsubnetmask like", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskNotLike(String value) {
            addCriterion("equsubnetmask not like", value, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskIn(List<String> values) {
            addCriterion("equsubnetmask in", values, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskNotIn(List<String> values) {
            addCriterion("equsubnetmask not in", values, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskBetween(String value1, String value2) {
            addCriterion("equsubnetmask between", value1, value2, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqusubnetmaskNotBetween(String value1, String value2) {
            addCriterion("equsubnetmask not between", value1, value2, "equsubnetmask");
            return (Criteria) this;
        }

        public Criteria andEqugatewayIsNull() {
            addCriterion("equgateway is null");
            return (Criteria) this;
        }

        public Criteria andEqugatewayIsNotNull() {
            addCriterion("equgateway is not null");
            return (Criteria) this;
        }

        public Criteria andEqugatewayEqualTo(String value) {
            addCriterion("equgateway =", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayNotEqualTo(String value) {
            addCriterion("equgateway <>", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayGreaterThan(String value) {
            addCriterion("equgateway >", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayGreaterThanOrEqualTo(String value) {
            addCriterion("equgateway >=", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayLessThan(String value) {
            addCriterion("equgateway <", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayLessThanOrEqualTo(String value) {
            addCriterion("equgateway <=", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayLike(String value) {
            addCriterion("equgateway like", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayNotLike(String value) {
            addCriterion("equgateway not like", value, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayIn(List<String> values) {
            addCriterion("equgateway in", values, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayNotIn(List<String> values) {
            addCriterion("equgateway not in", values, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayBetween(String value1, String value2) {
            addCriterion("equgateway between", value1, value2, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEqugatewayNotBetween(String value1, String value2) {
            addCriterion("equgateway not between", value1, value2, "equgateway");
            return (Criteria) this;
        }

        public Criteria andEquosIsNull() {
            addCriterion("equos is null");
            return (Criteria) this;
        }

        public Criteria andEquosIsNotNull() {
            addCriterion("equos is not null");
            return (Criteria) this;
        }

        public Criteria andEquosEqualTo(String value) {
            addCriterion("equos =", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosNotEqualTo(String value) {
            addCriterion("equos <>", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosGreaterThan(String value) {
            addCriterion("equos >", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosGreaterThanOrEqualTo(String value) {
            addCriterion("equos >=", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosLessThan(String value) {
            addCriterion("equos <", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosLessThanOrEqualTo(String value) {
            addCriterion("equos <=", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosLike(String value) {
            addCriterion("equos like", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosNotLike(String value) {
            addCriterion("equos not like", value, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosIn(List<String> values) {
            addCriterion("equos in", values, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosNotIn(List<String> values) {
            addCriterion("equos not in", values, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosBetween(String value1, String value2) {
            addCriterion("equos between", value1, value2, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosNotBetween(String value1, String value2) {
            addCriterion("equos not between", value1, value2, "equos");
            return (Criteria) this;
        }

        public Criteria andEquosuserIsNull() {
            addCriterion("equosuser is null");
            return (Criteria) this;
        }

        public Criteria andEquosuserIsNotNull() {
            addCriterion("equosuser is not null");
            return (Criteria) this;
        }

        public Criteria andEquosuserEqualTo(String value) {
            addCriterion("equosuser =", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserNotEqualTo(String value) {
            addCriterion("equosuser <>", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserGreaterThan(String value) {
            addCriterion("equosuser >", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserGreaterThanOrEqualTo(String value) {
            addCriterion("equosuser >=", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserLessThan(String value) {
            addCriterion("equosuser <", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserLessThanOrEqualTo(String value) {
            addCriterion("equosuser <=", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserLike(String value) {
            addCriterion("equosuser like", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserNotLike(String value) {
            addCriterion("equosuser not like", value, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserIn(List<String> values) {
            addCriterion("equosuser in", values, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserNotIn(List<String> values) {
            addCriterion("equosuser not in", values, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserBetween(String value1, String value2) {
            addCriterion("equosuser between", value1, value2, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquosuserNotBetween(String value1, String value2) {
            addCriterion("equosuser not between", value1, value2, "equosuser");
            return (Criteria) this;
        }

        public Criteria andEquospwdIsNull() {
            addCriterion("equospwd is null");
            return (Criteria) this;
        }

        public Criteria andEquospwdIsNotNull() {
            addCriterion("equospwd is not null");
            return (Criteria) this;
        }

        public Criteria andEquospwdEqualTo(String value) {
            addCriterion("equospwd =", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdNotEqualTo(String value) {
            addCriterion("equospwd <>", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdGreaterThan(String value) {
            addCriterion("equospwd >", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdGreaterThanOrEqualTo(String value) {
            addCriterion("equospwd >=", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdLessThan(String value) {
            addCriterion("equospwd <", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdLessThanOrEqualTo(String value) {
            addCriterion("equospwd <=", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdLike(String value) {
            addCriterion("equospwd like", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdNotLike(String value) {
            addCriterion("equospwd not like", value, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdIn(List<String> values) {
            addCriterion("equospwd in", values, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdNotIn(List<String> values) {
            addCriterion("equospwd not in", values, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdBetween(String value1, String value2) {
            addCriterion("equospwd between", value1, value2, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEquospwdNotBetween(String value1, String value2) {
            addCriterion("equospwd not between", value1, value2, "equospwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserIsNull() {
            addCriterion("equsoftwareuser is null");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserIsNotNull() {
            addCriterion("equsoftwareuser is not null");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserEqualTo(String value) {
            addCriterion("equsoftwareuser =", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserNotEqualTo(String value) {
            addCriterion("equsoftwareuser <>", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserGreaterThan(String value) {
            addCriterion("equsoftwareuser >", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserGreaterThanOrEqualTo(String value) {
            addCriterion("equsoftwareuser >=", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserLessThan(String value) {
            addCriterion("equsoftwareuser <", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserLessThanOrEqualTo(String value) {
            addCriterion("equsoftwareuser <=", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserLike(String value) {
            addCriterion("equsoftwareuser like", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserNotLike(String value) {
            addCriterion("equsoftwareuser not like", value, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserIn(List<String> values) {
            addCriterion("equsoftwareuser in", values, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserNotIn(List<String> values) {
            addCriterion("equsoftwareuser not in", values, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserBetween(String value1, String value2) {
            addCriterion("equsoftwareuser between", value1, value2, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwareuserNotBetween(String value1, String value2) {
            addCriterion("equsoftwareuser not between", value1, value2, "equsoftwareuser");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdIsNull() {
            addCriterion("equsoftwarepwd is null");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdIsNotNull() {
            addCriterion("equsoftwarepwd is not null");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdEqualTo(String value) {
            addCriterion("equsoftwarepwd =", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdNotEqualTo(String value) {
            addCriterion("equsoftwarepwd <>", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdGreaterThan(String value) {
            addCriterion("equsoftwarepwd >", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdGreaterThanOrEqualTo(String value) {
            addCriterion("equsoftwarepwd >=", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdLessThan(String value) {
            addCriterion("equsoftwarepwd <", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdLessThanOrEqualTo(String value) {
            addCriterion("equsoftwarepwd <=", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdLike(String value) {
            addCriterion("equsoftwarepwd like", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdNotLike(String value) {
            addCriterion("equsoftwarepwd not like", value, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdIn(List<String> values) {
            addCriterion("equsoftwarepwd in", values, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdNotIn(List<String> values) {
            addCriterion("equsoftwarepwd not in", values, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdBetween(String value1, String value2) {
            addCriterion("equsoftwarepwd between", value1, value2, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarepwdNotBetween(String value1, String value2) {
            addCriterion("equsoftwarepwd not between", value1, value2, "equsoftwarepwd");
            return (Criteria) this;
        }

        public Criteria andEquportIsNull() {
            addCriterion("equport is null");
            return (Criteria) this;
        }

        public Criteria andEquportIsNotNull() {
            addCriterion("equport is not null");
            return (Criteria) this;
        }

        public Criteria andEquportEqualTo(String value) {
            addCriterion("equport =", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportNotEqualTo(String value) {
            addCriterion("equport <>", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportGreaterThan(String value) {
            addCriterion("equport >", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportGreaterThanOrEqualTo(String value) {
            addCriterion("equport >=", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportLessThan(String value) {
            addCriterion("equport <", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportLessThanOrEqualTo(String value) {
            addCriterion("equport <=", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportLike(String value) {
            addCriterion("equport like", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportNotLike(String value) {
            addCriterion("equport not like", value, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportIn(List<String> values) {
            addCriterion("equport in", values, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportNotIn(List<String> values) {
            addCriterion("equport not in", values, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportBetween(String value1, String value2) {
            addCriterion("equport between", value1, value2, "equport");
            return (Criteria) this;
        }

        public Criteria andEquportNotBetween(String value1, String value2) {
            addCriterion("equport not between", value1, value2, "equport");
            return (Criteria) this;
        }

        public Criteria andEquntpaddIsNull() {
            addCriterion("equntpadd is null");
            return (Criteria) this;
        }

        public Criteria andEquntpaddIsNotNull() {
            addCriterion("equntpadd is not null");
            return (Criteria) this;
        }

        public Criteria andEquntpaddEqualTo(String value) {
            addCriterion("equntpadd =", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddNotEqualTo(String value) {
            addCriterion("equntpadd <>", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddGreaterThan(String value) {
            addCriterion("equntpadd >", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddGreaterThanOrEqualTo(String value) {
            addCriterion("equntpadd >=", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddLessThan(String value) {
            addCriterion("equntpadd <", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddLessThanOrEqualTo(String value) {
            addCriterion("equntpadd <=", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddLike(String value) {
            addCriterion("equntpadd like", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddNotLike(String value) {
            addCriterion("equntpadd not like", value, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddIn(List<String> values) {
            addCriterion("equntpadd in", values, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddNotIn(List<String> values) {
            addCriterion("equntpadd not in", values, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddBetween(String value1, String value2) {
            addCriterion("equntpadd between", value1, value2, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEquntpaddNotBetween(String value1, String value2) {
            addCriterion("equntpadd not between", value1, value2, "equntpadd");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameIsNull() {
            addCriterion("equsoftwarename is null");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameIsNotNull() {
            addCriterion("equsoftwarename is not null");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameEqualTo(String value) {
            addCriterion("equsoftwarename =", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameNotEqualTo(String value) {
            addCriterion("equsoftwarename <>", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameGreaterThan(String value) {
            addCriterion("equsoftwarename >", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameGreaterThanOrEqualTo(String value) {
            addCriterion("equsoftwarename >=", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameLessThan(String value) {
            addCriterion("equsoftwarename <", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameLessThanOrEqualTo(String value) {
            addCriterion("equsoftwarename <=", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameLike(String value) {
            addCriterion("equsoftwarename like", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameNotLike(String value) {
            addCriterion("equsoftwarename not like", value, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameIn(List<String> values) {
            addCriterion("equsoftwarename in", values, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameNotIn(List<String> values) {
            addCriterion("equsoftwarename not in", values, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameBetween(String value1, String value2) {
            addCriterion("equsoftwarename between", value1, value2, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqusoftwarenameNotBetween(String value1, String value2) {
            addCriterion("equsoftwarename not between", value1, value2, "equsoftwarename");
            return (Criteria) this;
        }

        public Criteria andEqubrandIsNull() {
            addCriterion("equbrand is null");
            return (Criteria) this;
        }

        public Criteria andEqubrandIsNotNull() {
            addCriterion("equbrand is not null");
            return (Criteria) this;
        }

        public Criteria andEqubrandEqualTo(String value) {
            addCriterion("equbrand =", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandNotEqualTo(String value) {
            addCriterion("equbrand <>", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandGreaterThan(String value) {
            addCriterion("equbrand >", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandGreaterThanOrEqualTo(String value) {
            addCriterion("equbrand >=", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandLessThan(String value) {
            addCriterion("equbrand <", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandLessThanOrEqualTo(String value) {
            addCriterion("equbrand <=", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandLike(String value) {
            addCriterion("equbrand like", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandNotLike(String value) {
            addCriterion("equbrand not like", value, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandIn(List<String> values) {
            addCriterion("equbrand in", values, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandNotIn(List<String> values) {
            addCriterion("equbrand not in", values, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandBetween(String value1, String value2) {
            addCriterion("equbrand between", value1, value2, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqubrandNotBetween(String value1, String value2) {
            addCriterion("equbrand not between", value1, value2, "equbrand");
            return (Criteria) this;
        }

        public Criteria andEqumodelIsNull() {
            addCriterion("equmodel is null");
            return (Criteria) this;
        }

        public Criteria andEqumodelIsNotNull() {
            addCriterion("equmodel is not null");
            return (Criteria) this;
        }

        public Criteria andEqumodelEqualTo(String value) {
            addCriterion("equmodel =", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelNotEqualTo(String value) {
            addCriterion("equmodel <>", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelGreaterThan(String value) {
            addCriterion("equmodel >", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelGreaterThanOrEqualTo(String value) {
            addCriterion("equmodel >=", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelLessThan(String value) {
            addCriterion("equmodel <", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelLessThanOrEqualTo(String value) {
            addCriterion("equmodel <=", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelLike(String value) {
            addCriterion("equmodel like", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelNotLike(String value) {
            addCriterion("equmodel not like", value, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelIn(List<String> values) {
            addCriterion("equmodel in", values, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelNotIn(List<String> values) {
            addCriterion("equmodel not in", values, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelBetween(String value1, String value2) {
            addCriterion("equmodel between", value1, value2, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEqumodelNotBetween(String value1, String value2) {
            addCriterion("equmodel not between", value1, value2, "equmodel");
            return (Criteria) this;
        }

        public Criteria andEquclassIsNull() {
            addCriterion("equclass is null");
            return (Criteria) this;
        }

        public Criteria andEquclassIsNotNull() {
            addCriterion("equclass is not null");
            return (Criteria) this;
        }

        public Criteria andEquclassEqualTo(String value) {
            addCriterion("equclass =", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassNotEqualTo(String value) {
            addCriterion("equclass <>", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassGreaterThan(String value) {
            addCriterion("equclass >", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassGreaterThanOrEqualTo(String value) {
            addCriterion("equclass >=", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassLessThan(String value) {
            addCriterion("equclass <", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassLessThanOrEqualTo(String value) {
            addCriterion("equclass <=", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassLike(String value) {
            addCriterion("equclass like", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassNotLike(String value) {
            addCriterion("equclass not like", value, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassIn(List<String> values) {
            addCriterion("equclass in", values, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassNotIn(List<String> values) {
            addCriterion("equclass not in", values, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassBetween(String value1, String value2) {
            addCriterion("equclass between", value1, value2, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquclassNotBetween(String value1, String value2) {
            addCriterion("equclass not between", value1, value2, "equclass");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateIsNull() {
            addCriterion("equadmissiondate is null");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateIsNotNull() {
            addCriterion("equadmissiondate is not null");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateEqualTo(Date value) {
            addCriterion("equadmissiondate =", value, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateNotEqualTo(Date value) {
            addCriterion("equadmissiondate <>", value, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateGreaterThan(Date value) {
            addCriterion("equadmissiondate >", value, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("equadmissiondate >=", value, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateLessThan(Date value) {
            addCriterion("equadmissiondate <", value, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateLessThanOrEqualTo(Date value) {
            addCriterion("equadmissiondate <=", value, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateIn(List<Date> values) {
            addCriterion("equadmissiondate in", values, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateNotIn(List<Date> values) {
            addCriterion("equadmissiondate not in", values, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateBetween(Date value1, Date value2) {
            addCriterion("equadmissiondate between", value1, value2, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEquadmissiondateNotBetween(Date value1, Date value2) {
            addCriterion("equadmissiondate not between", value1, value2, "equadmissiondate");
            return (Criteria) this;
        }

        public Criteria andEqudevorgIsNull() {
            addCriterion("equdevorg is null");
            return (Criteria) this;
        }

        public Criteria andEqudevorgIsNotNull() {
            addCriterion("equdevorg is not null");
            return (Criteria) this;
        }

        public Criteria andEqudevorgEqualTo(String value) {
            addCriterion("equdevorg =", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgNotEqualTo(String value) {
            addCriterion("equdevorg <>", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgGreaterThan(String value) {
            addCriterion("equdevorg >", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgGreaterThanOrEqualTo(String value) {
            addCriterion("equdevorg >=", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgLessThan(String value) {
            addCriterion("equdevorg <", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgLessThanOrEqualTo(String value) {
            addCriterion("equdevorg <=", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgLike(String value) {
            addCriterion("equdevorg like", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgNotLike(String value) {
            addCriterion("equdevorg not like", value, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgIn(List<String> values) {
            addCriterion("equdevorg in", values, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgNotIn(List<String> values) {
            addCriterion("equdevorg not in", values, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgBetween(String value1, String value2) {
            addCriterion("equdevorg between", value1, value2, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEqudevorgNotBetween(String value1, String value2) {
            addCriterion("equdevorg not between", value1, value2, "equdevorg");
            return (Criteria) this;
        }

        public Criteria andEquremarksIsNull() {
            addCriterion("equremarks is null");
            return (Criteria) this;
        }

        public Criteria andEquremarksIsNotNull() {
            addCriterion("equremarks is not null");
            return (Criteria) this;
        }

        public Criteria andEquremarksEqualTo(String value) {
            addCriterion("equremarks =", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksNotEqualTo(String value) {
            addCriterion("equremarks <>", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksGreaterThan(String value) {
            addCriterion("equremarks >", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksGreaterThanOrEqualTo(String value) {
            addCriterion("equremarks >=", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksLessThan(String value) {
            addCriterion("equremarks <", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksLessThanOrEqualTo(String value) {
            addCriterion("equremarks <=", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksLike(String value) {
            addCriterion("equremarks like", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksNotLike(String value) {
            addCriterion("equremarks not like", value, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksIn(List<String> values) {
            addCriterion("equremarks in", values, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksNotIn(List<String> values) {
            addCriterion("equremarks not in", values, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksBetween(String value1, String value2) {
            addCriterion("equremarks between", value1, value2, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarksNotBetween(String value1, String value2) {
            addCriterion("equremarks not between", value1, value2, "equremarks");
            return (Criteria) this;
        }

        public Criteria andEquremarks2IsNull() {
            addCriterion("equremarks2 is null");
            return (Criteria) this;
        }

        public Criteria andEquremarks2IsNotNull() {
            addCriterion("equremarks2 is not null");
            return (Criteria) this;
        }

        public Criteria andEquremarks2EqualTo(String value) {
            addCriterion("equremarks2 =", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2NotEqualTo(String value) {
            addCriterion("equremarks2 <>", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2GreaterThan(String value) {
            addCriterion("equremarks2 >", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2GreaterThanOrEqualTo(String value) {
            addCriterion("equremarks2 >=", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2LessThan(String value) {
            addCriterion("equremarks2 <", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2LessThanOrEqualTo(String value) {
            addCriterion("equremarks2 <=", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2Like(String value) {
            addCriterion("equremarks2 like", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2NotLike(String value) {
            addCriterion("equremarks2 not like", value, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2In(List<String> values) {
            addCriterion("equremarks2 in", values, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2NotIn(List<String> values) {
            addCriterion("equremarks2 not in", values, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2Between(String value1, String value2) {
            addCriterion("equremarks2 between", value1, value2, "equremarks2");
            return (Criteria) this;
        }

        public Criteria andEquremarks2NotBetween(String value1, String value2) {
            addCriterion("equremarks2 not between", value1, value2, "equremarks2");
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