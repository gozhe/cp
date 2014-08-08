package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OfflineRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OfflineRecordExample() {
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

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Boolean value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Boolean value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Boolean value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Boolean value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Boolean value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Boolean> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Boolean> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Boolean value1, Boolean value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andRecorddateIsNull() {
            addCriterion("recorddate is null");
            return (Criteria) this;
        }

        public Criteria andRecorddateIsNotNull() {
            addCriterion("recorddate is not null");
            return (Criteria) this;
        }

        public Criteria andRecorddateEqualTo(Date value) {
            addCriterion("recorddate =", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotEqualTo(Date value) {
            addCriterion("recorddate <>", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThan(Date value) {
            addCriterion("recorddate >", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateGreaterThanOrEqualTo(Date value) {
            addCriterion("recorddate >=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThan(Date value) {
            addCriterion("recorddate <", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateLessThanOrEqualTo(Date value) {
            addCriterion("recorddate <=", value, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateIn(List<Date> values) {
            addCriterion("recorddate in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotIn(List<Date> values) {
            addCriterion("recorddate not in", values, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateBetween(Date value1, Date value2) {
            addCriterion("recorddate between", value1, value2, "recorddate");
            return (Criteria) this;
        }

        public Criteria andRecorddateNotBetween(Date value1, Date value2) {
            addCriterion("recorddate not between", value1, value2, "recorddate");
            return (Criteria) this;
        }

        public Criteria andWarningtitleIsNull() {
            addCriterion("warningtitle is null");
            return (Criteria) this;
        }

        public Criteria andWarningtitleIsNotNull() {
            addCriterion("warningtitle is not null");
            return (Criteria) this;
        }

        public Criteria andWarningtitleEqualTo(String value) {
            addCriterion("warningtitle =", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleNotEqualTo(String value) {
            addCriterion("warningtitle <>", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleGreaterThan(String value) {
            addCriterion("warningtitle >", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleGreaterThanOrEqualTo(String value) {
            addCriterion("warningtitle >=", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleLessThan(String value) {
            addCriterion("warningtitle <", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleLessThanOrEqualTo(String value) {
            addCriterion("warningtitle <=", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleLike(String value) {
            addCriterion("warningtitle like", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleNotLike(String value) {
            addCriterion("warningtitle not like", value, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleIn(List<String> values) {
            addCriterion("warningtitle in", values, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleNotIn(List<String> values) {
            addCriterion("warningtitle not in", values, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleBetween(String value1, String value2) {
            addCriterion("warningtitle between", value1, value2, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningtitleNotBetween(String value1, String value2) {
            addCriterion("warningtitle not between", value1, value2, "warningtitle");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeIsNull() {
            addCriterion("warningdescribe is null");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeIsNotNull() {
            addCriterion("warningdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeEqualTo(String value) {
            addCriterion("warningdescribe =", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeNotEqualTo(String value) {
            addCriterion("warningdescribe <>", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeGreaterThan(String value) {
            addCriterion("warningdescribe >", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("warningdescribe >=", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeLessThan(String value) {
            addCriterion("warningdescribe <", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeLessThanOrEqualTo(String value) {
            addCriterion("warningdescribe <=", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeLike(String value) {
            addCriterion("warningdescribe like", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeNotLike(String value) {
            addCriterion("warningdescribe not like", value, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeIn(List<String> values) {
            addCriterion("warningdescribe in", values, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeNotIn(List<String> values) {
            addCriterion("warningdescribe not in", values, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeBetween(String value1, String value2) {
            addCriterion("warningdescribe between", value1, value2, "warningdescribe");
            return (Criteria) this;
        }

        public Criteria andWarningdescribeNotBetween(String value1, String value2) {
            addCriterion("warningdescribe not between", value1, value2, "warningdescribe");
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