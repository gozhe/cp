package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class RepairResultModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairResultModelExample() {
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

        public Criteria andRridIsNull() {
            addCriterion("rrid is null");
            return (Criteria) this;
        }

        public Criteria andRridIsNotNull() {
            addCriterion("rrid is not null");
            return (Criteria) this;
        }

        public Criteria andRridEqualTo(Integer value) {
            addCriterion("rrid =", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridNotEqualTo(Integer value) {
            addCriterion("rrid <>", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridGreaterThan(Integer value) {
            addCriterion("rrid >", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridGreaterThanOrEqualTo(Integer value) {
            addCriterion("rrid >=", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridLessThan(Integer value) {
            addCriterion("rrid <", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridLessThanOrEqualTo(Integer value) {
            addCriterion("rrid <=", value, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridIn(List<Integer> values) {
            addCriterion("rrid in", values, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridNotIn(List<Integer> values) {
            addCriterion("rrid not in", values, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridBetween(Integer value1, Integer value2) {
            addCriterion("rrid between", value1, value2, "rrid");
            return (Criteria) this;
        }

        public Criteria andRridNotBetween(Integer value1, Integer value2) {
            addCriterion("rrid not between", value1, value2, "rrid");
            return (Criteria) this;
        }

        public Criteria andRrvalueIsNull() {
            addCriterion("rrvalue is null");
            return (Criteria) this;
        }

        public Criteria andRrvalueIsNotNull() {
            addCriterion("rrvalue is not null");
            return (Criteria) this;
        }

        public Criteria andRrvalueEqualTo(String value) {
            addCriterion("rrvalue =", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueNotEqualTo(String value) {
            addCriterion("rrvalue <>", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueGreaterThan(String value) {
            addCriterion("rrvalue >", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueGreaterThanOrEqualTo(String value) {
            addCriterion("rrvalue >=", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueLessThan(String value) {
            addCriterion("rrvalue <", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueLessThanOrEqualTo(String value) {
            addCriterion("rrvalue <=", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueLike(String value) {
            addCriterion("rrvalue like", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueNotLike(String value) {
            addCriterion("rrvalue not like", value, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueIn(List<String> values) {
            addCriterion("rrvalue in", values, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueNotIn(List<String> values) {
            addCriterion("rrvalue not in", values, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueBetween(String value1, String value2) {
            addCriterion("rrvalue between", value1, value2, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvalueNotBetween(String value1, String value2) {
            addCriterion("rrvalue not between", value1, value2, "rrvalue");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeIsNull() {
            addCriterion("rrvaluedescribe is null");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeIsNotNull() {
            addCriterion("rrvaluedescribe is not null");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeEqualTo(String value) {
            addCriterion("rrvaluedescribe =", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeNotEqualTo(String value) {
            addCriterion("rrvaluedescribe <>", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeGreaterThan(String value) {
            addCriterion("rrvaluedescribe >", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeGreaterThanOrEqualTo(String value) {
            addCriterion("rrvaluedescribe >=", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeLessThan(String value) {
            addCriterion("rrvaluedescribe <", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeLessThanOrEqualTo(String value) {
            addCriterion("rrvaluedescribe <=", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeLike(String value) {
            addCriterion("rrvaluedescribe like", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeNotLike(String value) {
            addCriterion("rrvaluedescribe not like", value, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeIn(List<String> values) {
            addCriterion("rrvaluedescribe in", values, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeNotIn(List<String> values) {
            addCriterion("rrvaluedescribe not in", values, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeBetween(String value1, String value2) {
            addCriterion("rrvaluedescribe between", value1, value2, "rrvaluedescribe");
            return (Criteria) this;
        }

        public Criteria andRrvaluedescribeNotBetween(String value1, String value2) {
            addCriterion("rrvaluedescribe not between", value1, value2, "rrvaluedescribe");
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