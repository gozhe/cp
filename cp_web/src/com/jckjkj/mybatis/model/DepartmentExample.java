package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria andDptnameIsNull() {
            addCriterion("dptname is null");
            return (Criteria) this;
        }

        public Criteria andDptnameIsNotNull() {
            addCriterion("dptname is not null");
            return (Criteria) this;
        }

        public Criteria andDptnameEqualTo(String value) {
            addCriterion("dptname =", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameNotEqualTo(String value) {
            addCriterion("dptname <>", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameGreaterThan(String value) {
            addCriterion("dptname >", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameGreaterThanOrEqualTo(String value) {
            addCriterion("dptname >=", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameLessThan(String value) {
            addCriterion("dptname <", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameLessThanOrEqualTo(String value) {
            addCriterion("dptname <=", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameLike(String value) {
            addCriterion("dptname like", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameNotLike(String value) {
            addCriterion("dptname not like", value, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameIn(List<String> values) {
            addCriterion("dptname in", values, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameNotIn(List<String> values) {
            addCriterion("dptname not in", values, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameBetween(String value1, String value2) {
            addCriterion("dptname between", value1, value2, "dptname");
            return (Criteria) this;
        }

        public Criteria andDptnameNotBetween(String value1, String value2) {
            addCriterion("dptname not between", value1, value2, "dptname");
            return (Criteria) this;
        }

        public Criteria andDpttypeIsNull() {
            addCriterion("dpttype is null");
            return (Criteria) this;
        }

        public Criteria andDpttypeIsNotNull() {
            addCriterion("dpttype is not null");
            return (Criteria) this;
        }

        public Criteria andDpttypeEqualTo(Integer value) {
            addCriterion("dpttype =", value, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeNotEqualTo(Integer value) {
            addCriterion("dpttype <>", value, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeGreaterThan(Integer value) {
            addCriterion("dpttype >", value, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dpttype >=", value, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeLessThan(Integer value) {
            addCriterion("dpttype <", value, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeLessThanOrEqualTo(Integer value) {
            addCriterion("dpttype <=", value, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeIn(List<Integer> values) {
            addCriterion("dpttype in", values, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeNotIn(List<Integer> values) {
            addCriterion("dpttype not in", values, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeBetween(Integer value1, Integer value2) {
            addCriterion("dpttype between", value1, value2, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDpttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dpttype not between", value1, value2, "dpttype");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorIsNull() {
            addCriterion("dptsuperior is null");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorIsNotNull() {
            addCriterion("dptsuperior is not null");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorEqualTo(String value) {
            addCriterion("dptsuperior =", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorNotEqualTo(String value) {
            addCriterion("dptsuperior <>", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorGreaterThan(String value) {
            addCriterion("dptsuperior >", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorGreaterThanOrEqualTo(String value) {
            addCriterion("dptsuperior >=", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorLessThan(String value) {
            addCriterion("dptsuperior <", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorLessThanOrEqualTo(String value) {
            addCriterion("dptsuperior <=", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorLike(String value) {
            addCriterion("dptsuperior like", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorNotLike(String value) {
            addCriterion("dptsuperior not like", value, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorIn(List<String> values) {
            addCriterion("dptsuperior in", values, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorNotIn(List<String> values) {
            addCriterion("dptsuperior not in", values, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorBetween(String value1, String value2) {
            addCriterion("dptsuperior between", value1, value2, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptsuperiorNotBetween(String value1, String value2) {
            addCriterion("dptsuperior not between", value1, value2, "dptsuperior");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionIsNull() {
            addCriterion("dptdescription is null");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionIsNotNull() {
            addCriterion("dptdescription is not null");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionEqualTo(String value) {
            addCriterion("dptdescription =", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionNotEqualTo(String value) {
            addCriterion("dptdescription <>", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionGreaterThan(String value) {
            addCriterion("dptdescription >", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("dptdescription >=", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionLessThan(String value) {
            addCriterion("dptdescription <", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionLessThanOrEqualTo(String value) {
            addCriterion("dptdescription <=", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionLike(String value) {
            addCriterion("dptdescription like", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionNotLike(String value) {
            addCriterion("dptdescription not like", value, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionIn(List<String> values) {
            addCriterion("dptdescription in", values, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionNotIn(List<String> values) {
            addCriterion("dptdescription not in", values, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionBetween(String value1, String value2) {
            addCriterion("dptdescription between", value1, value2, "dptdescription");
            return (Criteria) this;
        }

        public Criteria andDptdescriptionNotBetween(String value1, String value2) {
            addCriterion("dptdescription not between", value1, value2, "dptdescription");
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