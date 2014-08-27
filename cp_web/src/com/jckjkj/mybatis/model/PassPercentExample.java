package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class PassPercentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PassPercentExample() {
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

        public Criteria andDptidIsNull() {
            addCriterion("dptid is null");
            return (Criteria) this;
        }

        public Criteria andDptidIsNotNull() {
            addCriterion("dptid is not null");
            return (Criteria) this;
        }

        public Criteria andDptidEqualTo(String value) {
            addCriterion("dptid =", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidNotEqualTo(String value) {
            addCriterion("dptid <>", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidGreaterThan(String value) {
            addCriterion("dptid >", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidGreaterThanOrEqualTo(String value) {
            addCriterion("dptid >=", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidLessThan(String value) {
            addCriterion("dptid <", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidLessThanOrEqualTo(String value) {
            addCriterion("dptid <=", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidLike(String value) {
            addCriterion("dptid like", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidNotLike(String value) {
            addCriterion("dptid not like", value, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidIn(List<String> values) {
            addCriterion("dptid in", values, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidNotIn(List<String> values) {
            addCriterion("dptid not in", values, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidBetween(String value1, String value2) {
            addCriterion("dptid between", value1, value2, "dptid");
            return (Criteria) this;
        }

        public Criteria andDptidNotBetween(String value1, String value2) {
            addCriterion("dptid not between", value1, value2, "dptid");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amIsNull() {
            addCriterion("passpercent7am is null");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amIsNotNull() {
            addCriterion("passpercent7am is not null");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amEqualTo(Double value) {
            addCriterion("passpercent7am =", value, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amNotEqualTo(Double value) {
            addCriterion("passpercent7am <>", value, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amGreaterThan(Double value) {
            addCriterion("passpercent7am >", value, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amGreaterThanOrEqualTo(Double value) {
            addCriterion("passpercent7am >=", value, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amLessThan(Double value) {
            addCriterion("passpercent7am <", value, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amLessThanOrEqualTo(Double value) {
            addCriterion("passpercent7am <=", value, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amIn(List<Double> values) {
            addCriterion("passpercent7am in", values, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amNotIn(List<Double> values) {
            addCriterion("passpercent7am not in", values, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amBetween(Double value1, Double value2) {
            addCriterion("passpercent7am between", value1, value2, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent7amNotBetween(Double value1, Double value2) {
            addCriterion("passpercent7am not between", value1, value2, "passpercent7am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amIsNull() {
            addCriterion("passpercent12am is null");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amIsNotNull() {
            addCriterion("passpercent12am is not null");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amEqualTo(Double value) {
            addCriterion("passpercent12am =", value, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amNotEqualTo(Double value) {
            addCriterion("passpercent12am <>", value, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amGreaterThan(Double value) {
            addCriterion("passpercent12am >", value, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amGreaterThanOrEqualTo(Double value) {
            addCriterion("passpercent12am >=", value, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amLessThan(Double value) {
            addCriterion("passpercent12am <", value, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amLessThanOrEqualTo(Double value) {
            addCriterion("passpercent12am <=", value, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amIn(List<Double> values) {
            addCriterion("passpercent12am in", values, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amNotIn(List<Double> values) {
            addCriterion("passpercent12am not in", values, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amBetween(Double value1, Double value2) {
            addCriterion("passpercent12am between", value1, value2, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent12amNotBetween(Double value1, Double value2) {
            addCriterion("passpercent12am not between", value1, value2, "passpercent12am");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmIsNull() {
            addCriterion("passpercent5pm is null");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmIsNotNull() {
            addCriterion("passpercent5pm is not null");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmEqualTo(Double value) {
            addCriterion("passpercent5pm =", value, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmNotEqualTo(Double value) {
            addCriterion("passpercent5pm <>", value, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmGreaterThan(Double value) {
            addCriterion("passpercent5pm >", value, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmGreaterThanOrEqualTo(Double value) {
            addCriterion("passpercent5pm >=", value, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmLessThan(Double value) {
            addCriterion("passpercent5pm <", value, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmLessThanOrEqualTo(Double value) {
            addCriterion("passpercent5pm <=", value, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmIn(List<Double> values) {
            addCriterion("passpercent5pm in", values, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmNotIn(List<Double> values) {
            addCriterion("passpercent5pm not in", values, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmBetween(Double value1, Double value2) {
            addCriterion("passpercent5pm between", value1, value2, "passpercent5pm");
            return (Criteria) this;
        }

        public Criteria andPasspercent5pmNotBetween(Double value1, Double value2) {
            addCriterion("passpercent5pm not between", value1, value2, "passpercent5pm");
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