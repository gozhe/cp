package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class PersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersionExample() {
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

        public Criteria andPersionidIsNull() {
            addCriterion("persionid is null");
            return (Criteria) this;
        }

        public Criteria andPersionidIsNotNull() {
            addCriterion("persionid is not null");
            return (Criteria) this;
        }

        public Criteria andPersionidEqualTo(Long value) {
            addCriterion("persionid =", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidNotEqualTo(Long value) {
            addCriterion("persionid <>", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidGreaterThan(Long value) {
            addCriterion("persionid >", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidGreaterThanOrEqualTo(Long value) {
            addCriterion("persionid >=", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidLessThan(Long value) {
            addCriterion("persionid <", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidLessThanOrEqualTo(Long value) {
            addCriterion("persionid <=", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidIn(List<Long> values) {
            addCriterion("persionid in", values, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidNotIn(List<Long> values) {
            addCriterion("persionid not in", values, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidBetween(Long value1, Long value2) {
            addCriterion("persionid between", value1, value2, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidNotBetween(Long value1, Long value2) {
            addCriterion("persionid not between", value1, value2, "persionid");
            return (Criteria) this;
        }

        public Criteria andPernameIsNull() {
            addCriterion("pername is null");
            return (Criteria) this;
        }

        public Criteria andPernameIsNotNull() {
            addCriterion("pername is not null");
            return (Criteria) this;
        }

        public Criteria andPernameEqualTo(String value) {
            addCriterion("pername =", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotEqualTo(String value) {
            addCriterion("pername <>", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameGreaterThan(String value) {
            addCriterion("pername >", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameGreaterThanOrEqualTo(String value) {
            addCriterion("pername >=", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLessThan(String value) {
            addCriterion("pername <", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLessThanOrEqualTo(String value) {
            addCriterion("pername <=", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameLike(String value) {
            addCriterion("pername like", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotLike(String value) {
            addCriterion("pername not like", value, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameIn(List<String> values) {
            addCriterion("pername in", values, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotIn(List<String> values) {
            addCriterion("pername not in", values, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameBetween(String value1, String value2) {
            addCriterion("pername between", value1, value2, "pername");
            return (Criteria) this;
        }

        public Criteria andPernameNotBetween(String value1, String value2) {
            addCriterion("pername not between", value1, value2, "pername");
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