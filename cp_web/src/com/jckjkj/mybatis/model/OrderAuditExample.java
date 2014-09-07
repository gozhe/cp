package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderAuditExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andFaultidIsNull() {
            addCriterion("faultid is null");
            return (Criteria) this;
        }

        public Criteria andFaultidIsNotNull() {
            addCriterion("faultid is not null");
            return (Criteria) this;
        }

        public Criteria andFaultidEqualTo(String value) {
            addCriterion("faultid =", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidNotEqualTo(String value) {
            addCriterion("faultid <>", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidGreaterThan(String value) {
            addCriterion("faultid >", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidGreaterThanOrEqualTo(String value) {
            addCriterion("faultid >=", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidLessThan(String value) {
            addCriterion("faultid <", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidLessThanOrEqualTo(String value) {
            addCriterion("faultid <=", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidLike(String value) {
            addCriterion("faultid like", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidNotLike(String value) {
            addCriterion("faultid not like", value, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidIn(List<String> values) {
            addCriterion("faultid in", values, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidNotIn(List<String> values) {
            addCriterion("faultid not in", values, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidBetween(String value1, String value2) {
            addCriterion("faultid between", value1, value2, "faultid");
            return (Criteria) this;
        }

        public Criteria andFaultidNotBetween(String value1, String value2) {
            addCriterion("faultid not between", value1, value2, "faultid");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNull() {
            addCriterion("auditopinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNotNull() {
            addCriterion("auditopinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionEqualTo(Integer value) {
            addCriterion("auditopinion =", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotEqualTo(Integer value) {
            addCriterion("auditopinion <>", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThan(Integer value) {
            addCriterion("auditopinion >", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditopinion >=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThan(Integer value) {
            addCriterion("auditopinion <", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThanOrEqualTo(Integer value) {
            addCriterion("auditopinion <=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIn(List<Integer> values) {
            addCriterion("auditopinion in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotIn(List<Integer> values) {
            addCriterion("auditopinion not in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionBetween(Integer value1, Integer value2) {
            addCriterion("auditopinion between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotBetween(Integer value1, Integer value2) {
            addCriterion("auditopinion not between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("audittime is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("audittime is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterionForJDBCTime("audittime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("audittime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterionForJDBCTime("audittime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("audittime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterionForJDBCTime("audittime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("audittime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterionForJDBCTime("audittime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("audittime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("audittime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("audittime not between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andRepairresultIsNull() {
            addCriterion("repairresult is null");
            return (Criteria) this;
        }

        public Criteria andRepairresultIsNotNull() {
            addCriterion("repairresult is not null");
            return (Criteria) this;
        }

        public Criteria andRepairresultEqualTo(Integer value) {
            addCriterion("repairresult =", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultNotEqualTo(Integer value) {
            addCriterion("repairresult <>", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultGreaterThan(Integer value) {
            addCriterion("repairresult >", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultGreaterThanOrEqualTo(Integer value) {
            addCriterion("repairresult >=", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultLessThan(Integer value) {
            addCriterion("repairresult <", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultLessThanOrEqualTo(Integer value) {
            addCriterion("repairresult <=", value, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultIn(List<Integer> values) {
            addCriterion("repairresult in", values, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultNotIn(List<Integer> values) {
            addCriterion("repairresult not in", values, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultBetween(Integer value1, Integer value2) {
            addCriterion("repairresult between", value1, value2, "repairresult");
            return (Criteria) this;
        }

        public Criteria andRepairresultNotBetween(Integer value1, Integer value2) {
            addCriterion("repairresult not between", value1, value2, "repairresult");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNull() {
            addCriterion("completetime is null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIsNotNull() {
            addCriterion("completetime is not null");
            return (Criteria) this;
        }

        public Criteria andCompletetimeEqualTo(Date value) {
            addCriterion("completetime =", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotEqualTo(Date value) {
            addCriterion("completetime <>", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThan(Date value) {
            addCriterion("completetime >", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("completetime >=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThan(Date value) {
            addCriterion("completetime <", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeLessThanOrEqualTo(Date value) {
            addCriterion("completetime <=", value, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeIn(List<Date> values) {
            addCriterion("completetime in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotIn(List<Date> values) {
            addCriterion("completetime not in", values, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeBetween(Date value1, Date value2) {
            addCriterion("completetime between", value1, value2, "completetime");
            return (Criteria) this;
        }

        public Criteria andCompletetimeNotBetween(Date value1, Date value2) {
            addCriterion("completetime not between", value1, value2, "completetime");
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