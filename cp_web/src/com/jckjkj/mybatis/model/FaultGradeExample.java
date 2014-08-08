package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class FaultGradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaultGradeExample() {
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

        public Criteria andFgidIsNull() {
            addCriterion("fgid is null");
            return (Criteria) this;
        }

        public Criteria andFgidIsNotNull() {
            addCriterion("fgid is not null");
            return (Criteria) this;
        }

        public Criteria andFgidEqualTo(Integer value) {
            addCriterion("fgid =", value, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidNotEqualTo(Integer value) {
            addCriterion("fgid <>", value, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidGreaterThan(Integer value) {
            addCriterion("fgid >", value, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fgid >=", value, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidLessThan(Integer value) {
            addCriterion("fgid <", value, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidLessThanOrEqualTo(Integer value) {
            addCriterion("fgid <=", value, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidIn(List<Integer> values) {
            addCriterion("fgid in", values, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidNotIn(List<Integer> values) {
            addCriterion("fgid not in", values, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidBetween(Integer value1, Integer value2) {
            addCriterion("fgid between", value1, value2, "fgid");
            return (Criteria) this;
        }

        public Criteria andFgidNotBetween(Integer value1, Integer value2) {
            addCriterion("fgid not between", value1, value2, "fgid");
            return (Criteria) this;
        }

        public Criteria andFaultgdIsNull() {
            addCriterion("faultgd is null");
            return (Criteria) this;
        }

        public Criteria andFaultgdIsNotNull() {
            addCriterion("faultgd is not null");
            return (Criteria) this;
        }

        public Criteria andFaultgdEqualTo(String value) {
            addCriterion("faultgd =", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdNotEqualTo(String value) {
            addCriterion("faultgd <>", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdGreaterThan(String value) {
            addCriterion("faultgd >", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdGreaterThanOrEqualTo(String value) {
            addCriterion("faultgd >=", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdLessThan(String value) {
            addCriterion("faultgd <", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdLessThanOrEqualTo(String value) {
            addCriterion("faultgd <=", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdLike(String value) {
            addCriterion("faultgd like", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdNotLike(String value) {
            addCriterion("faultgd not like", value, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdIn(List<String> values) {
            addCriterion("faultgd in", values, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdNotIn(List<String> values) {
            addCriterion("faultgd not in", values, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdBetween(String value1, String value2) {
            addCriterion("faultgd between", value1, value2, "faultgd");
            return (Criteria) this;
        }

        public Criteria andFaultgdNotBetween(String value1, String value2) {
            addCriterion("faultgd not between", value1, value2, "faultgd");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNull() {
            addCriterion("timelimit is null");
            return (Criteria) this;
        }

        public Criteria andTimelimitIsNotNull() {
            addCriterion("timelimit is not null");
            return (Criteria) this;
        }

        public Criteria andTimelimitEqualTo(Integer value) {
            addCriterion("timelimit =", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotEqualTo(Integer value) {
            addCriterion("timelimit <>", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThan(Integer value) {
            addCriterion("timelimit >", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("timelimit >=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThan(Integer value) {
            addCriterion("timelimit <", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitLessThanOrEqualTo(Integer value) {
            addCriterion("timelimit <=", value, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitIn(List<Integer> values) {
            addCriterion("timelimit in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotIn(List<Integer> values) {
            addCriterion("timelimit not in", values, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitBetween(Integer value1, Integer value2) {
            addCriterion("timelimit between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andTimelimitNotBetween(Integer value1, Integer value2) {
            addCriterion("timelimit not between", value1, value2, "timelimit");
            return (Criteria) this;
        }

        public Criteria andFgdescribeIsNull() {
            addCriterion("fgdescribe is null");
            return (Criteria) this;
        }

        public Criteria andFgdescribeIsNotNull() {
            addCriterion("fgdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andFgdescribeEqualTo(String value) {
            addCriterion("fgdescribe =", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeNotEqualTo(String value) {
            addCriterion("fgdescribe <>", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeGreaterThan(String value) {
            addCriterion("fgdescribe >", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("fgdescribe >=", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeLessThan(String value) {
            addCriterion("fgdescribe <", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeLessThanOrEqualTo(String value) {
            addCriterion("fgdescribe <=", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeLike(String value) {
            addCriterion("fgdescribe like", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeNotLike(String value) {
            addCriterion("fgdescribe not like", value, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeIn(List<String> values) {
            addCriterion("fgdescribe in", values, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeNotIn(List<String> values) {
            addCriterion("fgdescribe not in", values, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeBetween(String value1, String value2) {
            addCriterion("fgdescribe between", value1, value2, "fgdescribe");
            return (Criteria) this;
        }

        public Criteria andFgdescribeNotBetween(String value1, String value2) {
            addCriterion("fgdescribe not between", value1, value2, "fgdescribe");
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