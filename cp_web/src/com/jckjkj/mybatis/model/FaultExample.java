package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class FaultExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaultExample() {
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

        public Criteria andEquipidIsNull() {
            addCriterion("equipid is null");
            return (Criteria) this;
        }

        public Criteria andEquipidIsNotNull() {
            addCriterion("equipid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipidEqualTo(String value) {
            addCriterion("equipid =", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotEqualTo(String value) {
            addCriterion("equipid <>", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThan(String value) {
            addCriterion("equipid >", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidGreaterThanOrEqualTo(String value) {
            addCriterion("equipid >=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThan(String value) {
            addCriterion("equipid <", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLessThanOrEqualTo(String value) {
            addCriterion("equipid <=", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidLike(String value) {
            addCriterion("equipid like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotLike(String value) {
            addCriterion("equipid not like", value, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidIn(List<String> values) {
            addCriterion("equipid in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotIn(List<String> values) {
            addCriterion("equipid not in", values, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidBetween(String value1, String value2) {
            addCriterion("equipid between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andEquipidNotBetween(String value1, String value2) {
            addCriterion("equipid not between", value1, value2, "equipid");
            return (Criteria) this;
        }

        public Criteria andFaultcount1IsNull() {
            addCriterion("faultcount1 is null");
            return (Criteria) this;
        }

        public Criteria andFaultcount1IsNotNull() {
            addCriterion("faultcount1 is not null");
            return (Criteria) this;
        }

        public Criteria andFaultcount1EqualTo(Integer value) {
            addCriterion("faultcount1 =", value, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1NotEqualTo(Integer value) {
            addCriterion("faultcount1 <>", value, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1GreaterThan(Integer value) {
            addCriterion("faultcount1 >", value, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1GreaterThanOrEqualTo(Integer value) {
            addCriterion("faultcount1 >=", value, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1LessThan(Integer value) {
            addCriterion("faultcount1 <", value, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1LessThanOrEqualTo(Integer value) {
            addCriterion("faultcount1 <=", value, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1In(List<Integer> values) {
            addCriterion("faultcount1 in", values, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1NotIn(List<Integer> values) {
            addCriterion("faultcount1 not in", values, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1Between(Integer value1, Integer value2) {
            addCriterion("faultcount1 between", value1, value2, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount1NotBetween(Integer value1, Integer value2) {
            addCriterion("faultcount1 not between", value1, value2, "faultcount1");
            return (Criteria) this;
        }

        public Criteria andFaultcount2IsNull() {
            addCriterion("faultcount2 is null");
            return (Criteria) this;
        }

        public Criteria andFaultcount2IsNotNull() {
            addCriterion("faultcount2 is not null");
            return (Criteria) this;
        }

        public Criteria andFaultcount2EqualTo(Integer value) {
            addCriterion("faultcount2 =", value, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2NotEqualTo(Integer value) {
            addCriterion("faultcount2 <>", value, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2GreaterThan(Integer value) {
            addCriterion("faultcount2 >", value, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2GreaterThanOrEqualTo(Integer value) {
            addCriterion("faultcount2 >=", value, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2LessThan(Integer value) {
            addCriterion("faultcount2 <", value, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2LessThanOrEqualTo(Integer value) {
            addCriterion("faultcount2 <=", value, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2In(List<Integer> values) {
            addCriterion("faultcount2 in", values, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2NotIn(List<Integer> values) {
            addCriterion("faultcount2 not in", values, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2Between(Integer value1, Integer value2) {
            addCriterion("faultcount2 between", value1, value2, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andFaultcount2NotBetween(Integer value1, Integer value2) {
            addCriterion("faultcount2 not between", value1, value2, "faultcount2");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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