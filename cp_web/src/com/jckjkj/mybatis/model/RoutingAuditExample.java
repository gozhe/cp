package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoutingAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoutingAuditExample() {
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

        public Criteria andRoutingidIsNull() {
            addCriterion("routingid is null");
            return (Criteria) this;
        }

        public Criteria andRoutingidIsNotNull() {
            addCriterion("routingid is not null");
            return (Criteria) this;
        }

        public Criteria andRoutingidEqualTo(Integer value) {
            addCriterion("routingid =", value, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidNotEqualTo(Integer value) {
            addCriterion("routingid <>", value, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidGreaterThan(Integer value) {
            addCriterion("routingid >", value, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("routingid >=", value, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidLessThan(Integer value) {
            addCriterion("routingid <", value, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidLessThanOrEqualTo(Integer value) {
            addCriterion("routingid <=", value, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidIn(List<Integer> values) {
            addCriterion("routingid in", values, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidNotIn(List<Integer> values) {
            addCriterion("routingid not in", values, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidBetween(Integer value1, Integer value2) {
            addCriterion("routingid between", value1, value2, "routingid");
            return (Criteria) this;
        }

        public Criteria andRoutingidNotBetween(Integer value1, Integer value2) {
            addCriterion("routingid not between", value1, value2, "routingid");
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