package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class OrderStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderStateExample() {
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

        public Criteria andOsidIsNull() {
            addCriterion("osid is null");
            return (Criteria) this;
        }

        public Criteria andOsidIsNotNull() {
            addCriterion("osid is not null");
            return (Criteria) this;
        }

        public Criteria andOsidEqualTo(Integer value) {
            addCriterion("osid =", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotEqualTo(Integer value) {
            addCriterion("osid <>", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThan(Integer value) {
            addCriterion("osid >", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("osid >=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThan(Integer value) {
            addCriterion("osid <", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidLessThanOrEqualTo(Integer value) {
            addCriterion("osid <=", value, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidIn(List<Integer> values) {
            addCriterion("osid in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotIn(List<Integer> values) {
            addCriterion("osid not in", values, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidBetween(Integer value1, Integer value2) {
            addCriterion("osid between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsidNotBetween(Integer value1, Integer value2) {
            addCriterion("osid not between", value1, value2, "osid");
            return (Criteria) this;
        }

        public Criteria andOsvalueIsNull() {
            addCriterion("osvalue is null");
            return (Criteria) this;
        }

        public Criteria andOsvalueIsNotNull() {
            addCriterion("osvalue is not null");
            return (Criteria) this;
        }

        public Criteria andOsvalueEqualTo(String value) {
            addCriterion("osvalue =", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueNotEqualTo(String value) {
            addCriterion("osvalue <>", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueGreaterThan(String value) {
            addCriterion("osvalue >", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueGreaterThanOrEqualTo(String value) {
            addCriterion("osvalue >=", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueLessThan(String value) {
            addCriterion("osvalue <", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueLessThanOrEqualTo(String value) {
            addCriterion("osvalue <=", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueLike(String value) {
            addCriterion("osvalue like", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueNotLike(String value) {
            addCriterion("osvalue not like", value, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueIn(List<String> values) {
            addCriterion("osvalue in", values, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueNotIn(List<String> values) {
            addCriterion("osvalue not in", values, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueBetween(String value1, String value2) {
            addCriterion("osvalue between", value1, value2, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsvalueNotBetween(String value1, String value2) {
            addCriterion("osvalue not between", value1, value2, "osvalue");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionIsNull() {
            addCriterion("osdescription is null");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionIsNotNull() {
            addCriterion("osdescription is not null");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionEqualTo(String value) {
            addCriterion("osdescription =", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotEqualTo(String value) {
            addCriterion("osdescription <>", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionGreaterThan(String value) {
            addCriterion("osdescription >", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("osdescription >=", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionLessThan(String value) {
            addCriterion("osdescription <", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionLessThanOrEqualTo(String value) {
            addCriterion("osdescription <=", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionLike(String value) {
            addCriterion("osdescription like", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotLike(String value) {
            addCriterion("osdescription not like", value, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionIn(List<String> values) {
            addCriterion("osdescription in", values, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotIn(List<String> values) {
            addCriterion("osdescription not in", values, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionBetween(String value1, String value2) {
            addCriterion("osdescription between", value1, value2, "osdescription");
            return (Criteria) this;
        }

        public Criteria andOsdescriptionNotBetween(String value1, String value2) {
            addCriterion("osdescription not between", value1, value2, "osdescription");
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