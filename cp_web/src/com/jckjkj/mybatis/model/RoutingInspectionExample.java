package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RoutingInspectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoutingInspectionExample() {
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

        public Criteria andEquidIsNull() {
            addCriterion("equid is null");
            return (Criteria) this;
        }

        public Criteria andEquidIsNotNull() {
            addCriterion("equid is not null");
            return (Criteria) this;
        }

        public Criteria andEquidEqualTo(String value) {
            addCriterion("equid =", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotEqualTo(String value) {
            addCriterion("equid <>", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidGreaterThan(String value) {
            addCriterion("equid >", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidGreaterThanOrEqualTo(String value) {
            addCriterion("equid >=", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLessThan(String value) {
            addCriterion("equid <", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLessThanOrEqualTo(String value) {
            addCriterion("equid <=", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidLike(String value) {
            addCriterion("equid like", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotLike(String value) {
            addCriterion("equid not like", value, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidIn(List<String> values) {
            addCriterion("equid in", values, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotIn(List<String> values) {
            addCriterion("equid not in", values, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidBetween(String value1, String value2) {
            addCriterion("equid between", value1, value2, "equid");
            return (Criteria) this;
        }

        public Criteria andEquidNotBetween(String value1, String value2) {
            addCriterion("equid not between", value1, value2, "equid");
            return (Criteria) this;
        }

        public Criteria andSignintimeIsNull() {
            addCriterion("signintime is null");
            return (Criteria) this;
        }

        public Criteria andSignintimeIsNotNull() {
            addCriterion("signintime is not null");
            return (Criteria) this;
        }

        public Criteria andSignintimeEqualTo(Date value) {
            addCriterion("signintime =", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotEqualTo(Date value) {
            addCriterion("signintime <>", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeGreaterThan(Date value) {
            addCriterion("signintime >", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signintime >=", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeLessThan(Date value) {
            addCriterion("signintime <", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeLessThanOrEqualTo(Date value) {
            addCriterion("signintime <=", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeIn(List<Date> values) {
            addCriterion("signintime in", values, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotIn(List<Date> values) {
            addCriterion("signintime not in", values, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeBetween(Date value1, Date value2) {
            addCriterion("signintime between", value1, value2, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotBetween(Date value1, Date value2) {
            addCriterion("signintime not between", value1, value2, "signintime");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeIsNull() {
            addCriterion("singinlongitude is null");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeIsNotNull() {
            addCriterion("singinlongitude is not null");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeEqualTo(String value) {
            addCriterion("singinlongitude =", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeNotEqualTo(String value) {
            addCriterion("singinlongitude <>", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeGreaterThan(String value) {
            addCriterion("singinlongitude >", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("singinlongitude >=", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeLessThan(String value) {
            addCriterion("singinlongitude <", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeLessThanOrEqualTo(String value) {
            addCriterion("singinlongitude <=", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeLike(String value) {
            addCriterion("singinlongitude like", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeNotLike(String value) {
            addCriterion("singinlongitude not like", value, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeIn(List<String> values) {
            addCriterion("singinlongitude in", values, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeNotIn(List<String> values) {
            addCriterion("singinlongitude not in", values, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeBetween(String value1, String value2) {
            addCriterion("singinlongitude between", value1, value2, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlongitudeNotBetween(String value1, String value2) {
            addCriterion("singinlongitude not between", value1, value2, "singinlongitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeIsNull() {
            addCriterion("singinlatitude is null");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeIsNotNull() {
            addCriterion("singinlatitude is not null");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeEqualTo(String value) {
            addCriterion("singinlatitude =", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeNotEqualTo(String value) {
            addCriterion("singinlatitude <>", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeGreaterThan(String value) {
            addCriterion("singinlatitude >", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("singinlatitude >=", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeLessThan(String value) {
            addCriterion("singinlatitude <", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeLessThanOrEqualTo(String value) {
            addCriterion("singinlatitude <=", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeLike(String value) {
            addCriterion("singinlatitude like", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeNotLike(String value) {
            addCriterion("singinlatitude not like", value, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeIn(List<String> values) {
            addCriterion("singinlatitude in", values, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeNotIn(List<String> values) {
            addCriterion("singinlatitude not in", values, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeBetween(String value1, String value2) {
            addCriterion("singinlatitude between", value1, value2, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andSinginlatitudeNotBetween(String value1, String value2) {
            addCriterion("singinlatitude not between", value1, value2, "singinlatitude");
            return (Criteria) this;
        }

        public Criteria andEqustateIsNull() {
            addCriterion("equstate is null");
            return (Criteria) this;
        }

        public Criteria andEqustateIsNotNull() {
            addCriterion("equstate is not null");
            return (Criteria) this;
        }

        public Criteria andEqustateEqualTo(String value) {
            addCriterion("equstate =", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateNotEqualTo(String value) {
            addCriterion("equstate <>", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateGreaterThan(String value) {
            addCriterion("equstate >", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateGreaterThanOrEqualTo(String value) {
            addCriterion("equstate >=", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateLessThan(String value) {
            addCriterion("equstate <", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateLessThanOrEqualTo(String value) {
            addCriterion("equstate <=", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateLike(String value) {
            addCriterion("equstate like", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateNotLike(String value) {
            addCriterion("equstate not like", value, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateIn(List<String> values) {
            addCriterion("equstate in", values, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateNotIn(List<String> values) {
            addCriterion("equstate not in", values, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateBetween(String value1, String value2) {
            addCriterion("equstate between", value1, value2, "equstate");
            return (Criteria) this;
        }

        public Criteria andEqustateNotBetween(String value1, String value2) {
            addCriterion("equstate not between", value1, value2, "equstate");
            return (Criteria) this;
        }

        public Criteria andRouphotoIsNull() {
            addCriterion("rouphoto is null");
            return (Criteria) this;
        }

        public Criteria andRouphotoIsNotNull() {
            addCriterion("rouphoto is not null");
            return (Criteria) this;
        }

        public Criteria andRouphotoEqualTo(String value) {
            addCriterion("rouphoto =", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoNotEqualTo(String value) {
            addCriterion("rouphoto <>", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoGreaterThan(String value) {
            addCriterion("rouphoto >", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoGreaterThanOrEqualTo(String value) {
            addCriterion("rouphoto >=", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoLessThan(String value) {
            addCriterion("rouphoto <", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoLessThanOrEqualTo(String value) {
            addCriterion("rouphoto <=", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoLike(String value) {
            addCriterion("rouphoto like", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoNotLike(String value) {
            addCriterion("rouphoto not like", value, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoIn(List<String> values) {
            addCriterion("rouphoto in", values, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoNotIn(List<String> values) {
            addCriterion("rouphoto not in", values, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoBetween(String value1, String value2) {
            addCriterion("rouphoto between", value1, value2, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRouphotoNotBetween(String value1, String value2) {
            addCriterion("rouphoto not between", value1, value2, "rouphoto");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionIsNull() {
            addCriterion("roudescription is null");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionIsNotNull() {
            addCriterion("roudescription is not null");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionEqualTo(String value) {
            addCriterion("roudescription =", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionNotEqualTo(String value) {
            addCriterion("roudescription <>", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionGreaterThan(String value) {
            addCriterion("roudescription >", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("roudescription >=", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionLessThan(String value) {
            addCriterion("roudescription <", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionLessThanOrEqualTo(String value) {
            addCriterion("roudescription <=", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionLike(String value) {
            addCriterion("roudescription like", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionNotLike(String value) {
            addCriterion("roudescription not like", value, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionIn(List<String> values) {
            addCriterion("roudescription in", values, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionNotIn(List<String> values) {
            addCriterion("roudescription not in", values, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionBetween(String value1, String value2) {
            addCriterion("roudescription between", value1, value2, "roudescription");
            return (Criteria) this;
        }

        public Criteria andRoudescriptionNotBetween(String value1, String value2) {
            addCriterion("roudescription not between", value1, value2, "roudescription");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNull() {
            addCriterion("personid is null");
            return (Criteria) this;
        }

        public Criteria andPersonidIsNotNull() {
            addCriterion("personid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonidEqualTo(Integer value) {
            addCriterion("personid =", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotEqualTo(Integer value) {
            addCriterion("personid <>", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThan(Integer value) {
            addCriterion("personid >", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidGreaterThanOrEqualTo(Integer value) {
            addCriterion("personid >=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThan(Integer value) {
            addCriterion("personid <", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidLessThanOrEqualTo(Integer value) {
            addCriterion("personid <=", value, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidIn(List<Integer> values) {
            addCriterion("personid in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotIn(List<Integer> values) {
            addCriterion("personid not in", values, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidBetween(Integer value1, Integer value2) {
            addCriterion("personid between", value1, value2, "personid");
            return (Criteria) this;
        }

        public Criteria andPersonidNotBetween(Integer value1, Integer value2) {
            addCriterion("personid not between", value1, value2, "personid");
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