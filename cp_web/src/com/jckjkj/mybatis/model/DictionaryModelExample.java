package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class DictionaryModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictionaryModelExample() {
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

        public Criteria andDicidIsNull() {
            addCriterion("dicid is null");
            return (Criteria) this;
        }

        public Criteria andDicidIsNotNull() {
            addCriterion("dicid is not null");
            return (Criteria) this;
        }

        public Criteria andDicidEqualTo(Integer value) {
            addCriterion("dicid =", value, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidNotEqualTo(Integer value) {
            addCriterion("dicid <>", value, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidGreaterThan(Integer value) {
            addCriterion("dicid >", value, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dicid >=", value, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidLessThan(Integer value) {
            addCriterion("dicid <", value, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidLessThanOrEqualTo(Integer value) {
            addCriterion("dicid <=", value, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidIn(List<Integer> values) {
            addCriterion("dicid in", values, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidNotIn(List<Integer> values) {
            addCriterion("dicid not in", values, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidBetween(Integer value1, Integer value2) {
            addCriterion("dicid between", value1, value2, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicidNotBetween(Integer value1, Integer value2) {
            addCriterion("dicid not between", value1, value2, "dicid");
            return (Criteria) this;
        }

        public Criteria andDicnameIsNull() {
            addCriterion("dicname is null");
            return (Criteria) this;
        }

        public Criteria andDicnameIsNotNull() {
            addCriterion("dicname is not null");
            return (Criteria) this;
        }

        public Criteria andDicnameEqualTo(String value) {
            addCriterion("dicname =", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameNotEqualTo(String value) {
            addCriterion("dicname <>", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameGreaterThan(String value) {
            addCriterion("dicname >", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameGreaterThanOrEqualTo(String value) {
            addCriterion("dicname >=", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameLessThan(String value) {
            addCriterion("dicname <", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameLessThanOrEqualTo(String value) {
            addCriterion("dicname <=", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameLike(String value) {
            addCriterion("dicname like", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameNotLike(String value) {
            addCriterion("dicname not like", value, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameIn(List<String> values) {
            addCriterion("dicname in", values, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameNotIn(List<String> values) {
            addCriterion("dicname not in", values, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameBetween(String value1, String value2) {
            addCriterion("dicname between", value1, value2, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicnameNotBetween(String value1, String value2) {
            addCriterion("dicname not between", value1, value2, "dicname");
            return (Criteria) this;
        }

        public Criteria andDicvalueIsNull() {
            addCriterion("dicvalue is null");
            return (Criteria) this;
        }

        public Criteria andDicvalueIsNotNull() {
            addCriterion("dicvalue is not null");
            return (Criteria) this;
        }

        public Criteria andDicvalueEqualTo(String value) {
            addCriterion("dicvalue =", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueNotEqualTo(String value) {
            addCriterion("dicvalue <>", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueGreaterThan(String value) {
            addCriterion("dicvalue >", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueGreaterThanOrEqualTo(String value) {
            addCriterion("dicvalue >=", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueLessThan(String value) {
            addCriterion("dicvalue <", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueLessThanOrEqualTo(String value) {
            addCriterion("dicvalue <=", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueLike(String value) {
            addCriterion("dicvalue like", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueNotLike(String value) {
            addCriterion("dicvalue not like", value, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueIn(List<String> values) {
            addCriterion("dicvalue in", values, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueNotIn(List<String> values) {
            addCriterion("dicvalue not in", values, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueBetween(String value1, String value2) {
            addCriterion("dicvalue between", value1, value2, "dicvalue");
            return (Criteria) this;
        }

        public Criteria andDicvalueNotBetween(String value1, String value2) {
            addCriterion("dicvalue not between", value1, value2, "dicvalue");
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