package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class AuditopionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditopionExample() {
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

        public Criteria andAoidIsNull() {
            addCriterion("aoid is null");
            return (Criteria) this;
        }

        public Criteria andAoidIsNotNull() {
            addCriterion("aoid is not null");
            return (Criteria) this;
        }

        public Criteria andAoidEqualTo(Integer value) {
            addCriterion("aoid =", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotEqualTo(Integer value) {
            addCriterion("aoid <>", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThan(Integer value) {
            addCriterion("aoid >", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aoid >=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThan(Integer value) {
            addCriterion("aoid <", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidLessThanOrEqualTo(Integer value) {
            addCriterion("aoid <=", value, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidIn(List<Integer> values) {
            addCriterion("aoid in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotIn(List<Integer> values) {
            addCriterion("aoid not in", values, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidBetween(Integer value1, Integer value2) {
            addCriterion("aoid between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoidNotBetween(Integer value1, Integer value2) {
            addCriterion("aoid not between", value1, value2, "aoid");
            return (Criteria) this;
        }

        public Criteria andAoopinionIsNull() {
            addCriterion("aoopinion is null");
            return (Criteria) this;
        }

        public Criteria andAoopinionIsNotNull() {
            addCriterion("aoopinion is not null");
            return (Criteria) this;
        }

        public Criteria andAoopinionEqualTo(String value) {
            addCriterion("aoopinion =", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotEqualTo(String value) {
            addCriterion("aoopinion <>", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionGreaterThan(String value) {
            addCriterion("aoopinion >", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionGreaterThanOrEqualTo(String value) {
            addCriterion("aoopinion >=", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionLessThan(String value) {
            addCriterion("aoopinion <", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionLessThanOrEqualTo(String value) {
            addCriterion("aoopinion <=", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionLike(String value) {
            addCriterion("aoopinion like", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotLike(String value) {
            addCriterion("aoopinion not like", value, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionIn(List<String> values) {
            addCriterion("aoopinion in", values, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotIn(List<String> values) {
            addCriterion("aoopinion not in", values, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionBetween(String value1, String value2) {
            addCriterion("aoopinion between", value1, value2, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAoopinionNotBetween(String value1, String value2) {
            addCriterion("aoopinion not between", value1, value2, "aoopinion");
            return (Criteria) this;
        }

        public Criteria andAodescriptionIsNull() {
            addCriterion("aodescription is null");
            return (Criteria) this;
        }

        public Criteria andAodescriptionIsNotNull() {
            addCriterion("aodescription is not null");
            return (Criteria) this;
        }

        public Criteria andAodescriptionEqualTo(String value) {
            addCriterion("aodescription =", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionNotEqualTo(String value) {
            addCriterion("aodescription <>", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionGreaterThan(String value) {
            addCriterion("aodescription >", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("aodescription >=", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionLessThan(String value) {
            addCriterion("aodescription <", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionLessThanOrEqualTo(String value) {
            addCriterion("aodescription <=", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionLike(String value) {
            addCriterion("aodescription like", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionNotLike(String value) {
            addCriterion("aodescription not like", value, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionIn(List<String> values) {
            addCriterion("aodescription in", values, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionNotIn(List<String> values) {
            addCriterion("aodescription not in", values, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionBetween(String value1, String value2) {
            addCriterion("aodescription between", value1, value2, "aodescription");
            return (Criteria) this;
        }

        public Criteria andAodescriptionNotBetween(String value1, String value2) {
            addCriterion("aodescription not between", value1, value2, "aodescription");
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