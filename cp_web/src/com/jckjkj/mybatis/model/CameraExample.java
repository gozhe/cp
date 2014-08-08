package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class CameraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CameraExample() {
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

        public Criteria andCameraidIsNull() {
            addCriterion("cameraid is null");
            return (Criteria) this;
        }

        public Criteria andCameraidIsNotNull() {
            addCriterion("cameraid is not null");
            return (Criteria) this;
        }

        public Criteria andCameraidEqualTo(String value) {
            addCriterion("cameraid =", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidNotEqualTo(String value) {
            addCriterion("cameraid <>", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidGreaterThan(String value) {
            addCriterion("cameraid >", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidGreaterThanOrEqualTo(String value) {
            addCriterion("cameraid >=", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidLessThan(String value) {
            addCriterion("cameraid <", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidLessThanOrEqualTo(String value) {
            addCriterion("cameraid <=", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidLike(String value) {
            addCriterion("cameraid like", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidNotLike(String value) {
            addCriterion("cameraid not like", value, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidIn(List<String> values) {
            addCriterion("cameraid in", values, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidNotIn(List<String> values) {
            addCriterion("cameraid not in", values, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidBetween(String value1, String value2) {
            addCriterion("cameraid between", value1, value2, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameraidNotBetween(String value1, String value2) {
            addCriterion("cameraid not between", value1, value2, "cameraid");
            return (Criteria) this;
        }

        public Criteria andCameranameIsNull() {
            addCriterion("cameraname is null");
            return (Criteria) this;
        }

        public Criteria andCameranameIsNotNull() {
            addCriterion("cameraname is not null");
            return (Criteria) this;
        }

        public Criteria andCameranameEqualTo(String value) {
            addCriterion("cameraname =", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameNotEqualTo(String value) {
            addCriterion("cameraname <>", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameGreaterThan(String value) {
            addCriterion("cameraname >", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameGreaterThanOrEqualTo(String value) {
            addCriterion("cameraname >=", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameLessThan(String value) {
            addCriterion("cameraname <", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameLessThanOrEqualTo(String value) {
            addCriterion("cameraname <=", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameLike(String value) {
            addCriterion("cameraname like", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameNotLike(String value) {
            addCriterion("cameraname not like", value, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameIn(List<String> values) {
            addCriterion("cameraname in", values, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameNotIn(List<String> values) {
            addCriterion("cameraname not in", values, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameBetween(String value1, String value2) {
            addCriterion("cameraname between", value1, value2, "cameraname");
            return (Criteria) this;
        }

        public Criteria andCameranameNotBetween(String value1, String value2) {
            addCriterion("cameraname not between", value1, value2, "cameraname");
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