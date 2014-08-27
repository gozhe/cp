package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CompactExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompactExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCDate("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCDate("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCDate("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterionForJDBCDate("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCDate("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCDate("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andMonthcountIsNull() {
            addCriterion("monthcount is null");
            return (Criteria) this;
        }

        public Criteria andMonthcountIsNotNull() {
            addCriterion("monthcount is not null");
            return (Criteria) this;
        }

        public Criteria andMonthcountEqualTo(Integer value) {
            addCriterion("monthcount =", value, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountNotEqualTo(Integer value) {
            addCriterion("monthcount <>", value, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountGreaterThan(Integer value) {
            addCriterion("monthcount >", value, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("monthcount >=", value, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountLessThan(Integer value) {
            addCriterion("monthcount <", value, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountLessThanOrEqualTo(Integer value) {
            addCriterion("monthcount <=", value, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountIn(List<Integer> values) {
            addCriterion("monthcount in", values, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountNotIn(List<Integer> values) {
            addCriterion("monthcount not in", values, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountBetween(Integer value1, Integer value2) {
            addCriterion("monthcount between", value1, value2, "monthcount");
            return (Criteria) this;
        }

        public Criteria andMonthcountNotBetween(Integer value1, Integer value2) {
            addCriterion("monthcount not between", value1, value2, "monthcount");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNull() {
            addCriterion("contractamount is null");
            return (Criteria) this;
        }

        public Criteria andContractamountIsNotNull() {
            addCriterion("contractamount is not null");
            return (Criteria) this;
        }

        public Criteria andContractamountEqualTo(String value) {
            addCriterion("contractamount =", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotEqualTo(String value) {
            addCriterion("contractamount <>", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThan(String value) {
            addCriterion("contractamount >", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountGreaterThanOrEqualTo(String value) {
            addCriterion("contractamount >=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThan(String value) {
            addCriterion("contractamount <", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLessThanOrEqualTo(String value) {
            addCriterion("contractamount <=", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountLike(String value) {
            addCriterion("contractamount like", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotLike(String value) {
            addCriterion("contractamount not like", value, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountIn(List<String> values) {
            addCriterion("contractamount in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotIn(List<String> values) {
            addCriterion("contractamount not in", values, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountBetween(String value1, String value2) {
            addCriterion("contractamount between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andContractamountNotBetween(String value1, String value2) {
            addCriterion("contractamount not between", value1, value2, "contractamount");
            return (Criteria) this;
        }

        public Criteria andCameracountIsNull() {
            addCriterion("cameracount is null");
            return (Criteria) this;
        }

        public Criteria andCameracountIsNotNull() {
            addCriterion("cameracount is not null");
            return (Criteria) this;
        }

        public Criteria andCameracountEqualTo(Integer value) {
            addCriterion("cameracount =", value, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountNotEqualTo(Integer value) {
            addCriterion("cameracount <>", value, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountGreaterThan(Integer value) {
            addCriterion("cameracount >", value, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cameracount >=", value, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountLessThan(Integer value) {
            addCriterion("cameracount <", value, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountLessThanOrEqualTo(Integer value) {
            addCriterion("cameracount <=", value, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountIn(List<Integer> values) {
            addCriterion("cameracount in", values, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountNotIn(List<Integer> values) {
            addCriterion("cameracount not in", values, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountBetween(Integer value1, Integer value2) {
            addCriterion("cameracount between", value1, value2, "cameracount");
            return (Criteria) this;
        }

        public Criteria andCameracountNotBetween(Integer value1, Integer value2) {
            addCriterion("cameracount not between", value1, value2, "cameracount");
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