package com.jckjkj.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VEquipRoutingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VEquipRoutingExample() {
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

        public Criteria andRoutingstateIsNull() {
            addCriterion("routingstate is null");
            return (Criteria) this;
        }

        public Criteria andRoutingstateIsNotNull() {
            addCriterion("routingstate is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingstateEqualTo(Integer value) {
            addCriterion("routingstate =", value, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateNotEqualTo(Integer value) {
            addCriterion("routingstate <>", value, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateGreaterThan(Integer value) {
            addCriterion("routingstate >", value, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("routingstate >=", value, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateLessThan(Integer value) {
            addCriterion("routingstate <", value, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateLessThanOrEqualTo(Integer value) {
            addCriterion("routingstate <=", value, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateIn(List<Integer> values) {
            addCriterion("routingstate in", values, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateNotIn(List<Integer> values) {
            addCriterion("routingstate not in", values, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateBetween(Integer value1, Integer value2) {
            addCriterion("routingstate between", value1, value2, "routingstate");
            return (Criteria) this;
        }

        public Criteria andRoutingstateNotBetween(Integer value1, Integer value2) {
            addCriterion("routingstate not between", value1, value2, "routingstate");
            return (Criteria) this;
        }

        public Criteria andAopersonIsNull() {
            addCriterion("aoperson is null");
            return (Criteria) this;
        }

        public Criteria andAopersonIsNotNull() {
            addCriterion("aoperson is not null");
            return (Criteria) this;
        }

        public Criteria andAopersonEqualTo(String value) {
            addCriterion("aoperson =", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonNotEqualTo(String value) {
            addCriterion("aoperson <>", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonGreaterThan(String value) {
            addCriterion("aoperson >", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonGreaterThanOrEqualTo(String value) {
            addCriterion("aoperson >=", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonLessThan(String value) {
            addCriterion("aoperson <", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonLessThanOrEqualTo(String value) {
            addCriterion("aoperson <=", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonLike(String value) {
            addCriterion("aoperson like", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonNotLike(String value) {
            addCriterion("aoperson not like", value, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonIn(List<String> values) {
            addCriterion("aoperson in", values, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonNotIn(List<String> values) {
            addCriterion("aoperson not in", values, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonBetween(String value1, String value2) {
            addCriterion("aoperson between", value1, value2, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAopersonNotBetween(String value1, String value2) {
            addCriterion("aoperson not between", value1, value2, "aoperson");
            return (Criteria) this;
        }

        public Criteria andAodateIsNull() {
            addCriterion("aodate is null");
            return (Criteria) this;
        }

        public Criteria andAodateIsNotNull() {
            addCriterion("aodate is not null");
            return (Criteria) this;
        }

        public Criteria andAodateEqualTo(Date value) {
            addCriterion("aodate =", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateNotEqualTo(Date value) {
            addCriterion("aodate <>", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateGreaterThan(Date value) {
            addCriterion("aodate >", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateGreaterThanOrEqualTo(Date value) {
            addCriterion("aodate >=", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateLessThan(Date value) {
            addCriterion("aodate <", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateLessThanOrEqualTo(Date value) {
            addCriterion("aodate <=", value, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateIn(List<Date> values) {
            addCriterion("aodate in", values, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateNotIn(List<Date> values) {
            addCriterion("aodate not in", values, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateBetween(Date value1, Date value2) {
            addCriterion("aodate between", value1, value2, "aodate");
            return (Criteria) this;
        }

        public Criteria andAodateNotBetween(Date value1, Date value2) {
            addCriterion("aodate not between", value1, value2, "aodate");
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