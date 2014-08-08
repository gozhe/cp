package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderListExample() {
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

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderid like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderid not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
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

        public Criteria andFaulttitleIsNull() {
            addCriterion("faulttitle is null");
            return (Criteria) this;
        }

        public Criteria andFaulttitleIsNotNull() {
            addCriterion("faulttitle is not null");
            return (Criteria) this;
        }

        public Criteria andFaulttitleEqualTo(String value) {
            addCriterion("faulttitle =", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleNotEqualTo(String value) {
            addCriterion("faulttitle <>", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleGreaterThan(String value) {
            addCriterion("faulttitle >", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleGreaterThanOrEqualTo(String value) {
            addCriterion("faulttitle >=", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleLessThan(String value) {
            addCriterion("faulttitle <", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleLessThanOrEqualTo(String value) {
            addCriterion("faulttitle <=", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleLike(String value) {
            addCriterion("faulttitle like", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleNotLike(String value) {
            addCriterion("faulttitle not like", value, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleIn(List<String> values) {
            addCriterion("faulttitle in", values, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleNotIn(List<String> values) {
            addCriterion("faulttitle not in", values, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleBetween(String value1, String value2) {
            addCriterion("faulttitle between", value1, value2, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaulttitleNotBetween(String value1, String value2) {
            addCriterion("faulttitle not between", value1, value2, "faulttitle");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionIsNull() {
            addCriterion("faultdescription is null");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionIsNotNull() {
            addCriterion("faultdescription is not null");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionEqualTo(String value) {
            addCriterion("faultdescription =", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotEqualTo(String value) {
            addCriterion("faultdescription <>", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionGreaterThan(String value) {
            addCriterion("faultdescription >", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("faultdescription >=", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionLessThan(String value) {
            addCriterion("faultdescription <", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionLessThanOrEqualTo(String value) {
            addCriterion("faultdescription <=", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionLike(String value) {
            addCriterion("faultdescription like", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotLike(String value) {
            addCriterion("faultdescription not like", value, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionIn(List<String> values) {
            addCriterion("faultdescription in", values, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotIn(List<String> values) {
            addCriterion("faultdescription not in", values, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionBetween(String value1, String value2) {
            addCriterion("faultdescription between", value1, value2, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultdescriptionNotBetween(String value1, String value2) {
            addCriterion("faultdescription not between", value1, value2, "faultdescription");
            return (Criteria) this;
        }

        public Criteria andFaultgradeIsNull() {
            addCriterion("faultgrade is null");
            return (Criteria) this;
        }

        public Criteria andFaultgradeIsNotNull() {
            addCriterion("faultgrade is not null");
            return (Criteria) this;
        }

        public Criteria andFaultgradeEqualTo(Integer value) {
            addCriterion("faultgrade =", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeNotEqualTo(Integer value) {
            addCriterion("faultgrade <>", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeGreaterThan(Integer value) {
            addCriterion("faultgrade >", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("faultgrade >=", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeLessThan(Integer value) {
            addCriterion("faultgrade <", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeLessThanOrEqualTo(Integer value) {
            addCriterion("faultgrade <=", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeIn(List<Integer> values) {
            addCriterion("faultgrade in", values, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeNotIn(List<Integer> values) {
            addCriterion("faultgrade not in", values, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeBetween(Integer value1, Integer value2) {
            addCriterion("faultgrade between", value1, value2, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("faultgrade not between", value1, value2, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultclassIsNull() {
            addCriterion("faultclass is null");
            return (Criteria) this;
        }

        public Criteria andFaultclassIsNotNull() {
            addCriterion("faultclass is not null");
            return (Criteria) this;
        }

        public Criteria andFaultclassEqualTo(String value) {
            addCriterion("faultclass =", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassNotEqualTo(String value) {
            addCriterion("faultclass <>", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassGreaterThan(String value) {
            addCriterion("faultclass >", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassGreaterThanOrEqualTo(String value) {
            addCriterion("faultclass >=", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassLessThan(String value) {
            addCriterion("faultclass <", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassLessThanOrEqualTo(String value) {
            addCriterion("faultclass <=", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassLike(String value) {
            addCriterion("faultclass like", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassNotLike(String value) {
            addCriterion("faultclass not like", value, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassIn(List<String> values) {
            addCriterion("faultclass in", values, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassNotIn(List<String> values) {
            addCriterion("faultclass not in", values, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassBetween(String value1, String value2) {
            addCriterion("faultclass between", value1, value2, "faultclass");
            return (Criteria) this;
        }

        public Criteria andFaultclassNotBetween(String value1, String value2) {
            addCriterion("faultclass not between", value1, value2, "faultclass");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeIsNull() {
            addCriterion("estcomptime is null");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeIsNotNull() {
            addCriterion("estcomptime is not null");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeEqualTo(Date value) {
            addCriterionForJDBCDate("estcomptime =", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("estcomptime <>", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("estcomptime >", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("estcomptime >=", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeLessThan(Date value) {
            addCriterionForJDBCDate("estcomptime <", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("estcomptime <=", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeIn(List<Date> values) {
            addCriterionForJDBCDate("estcomptime in", values, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("estcomptime not in", values, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("estcomptime between", value1, value2, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("estcomptime not between", value1, value2, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("orderstate is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("orderstate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Integer value) {
            addCriterion("orderstate =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Integer value) {
            addCriterion("orderstate <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Integer value) {
            addCriterion("orderstate >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderstate >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Integer value) {
            addCriterion("orderstate <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Integer value) {
            addCriterion("orderstate <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Integer> values) {
            addCriterion("orderstate in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Integer> values) {
            addCriterion("orderstate not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Integer value1, Integer value2) {
            addCriterion("orderstate between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Integer value1, Integer value2) {
            addCriterion("orderstate not between", value1, value2, "orderstate");
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
            addCriterionForJDBCDate("audittime =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("audittime <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterionForJDBCDate("audittime >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audittime >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterionForJDBCDate("audittime <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("audittime <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterionForJDBCDate("audittime in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("audittime not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audittime between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("audittime not between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andComptimeIsNull() {
            addCriterion("comptime is null");
            return (Criteria) this;
        }

        public Criteria andComptimeIsNotNull() {
            addCriterion("comptime is not null");
            return (Criteria) this;
        }

        public Criteria andComptimeEqualTo(Date value) {
            addCriterionForJDBCDate("comptime =", value, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("comptime <>", value, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeGreaterThan(Date value) {
            addCriterionForJDBCDate("comptime >", value, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("comptime >=", value, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeLessThan(Date value) {
            addCriterionForJDBCDate("comptime <", value, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("comptime <=", value, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeIn(List<Date> values) {
            addCriterionForJDBCDate("comptime in", values, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("comptime not in", values, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("comptime between", value1, value2, "comptime");
            return (Criteria) this;
        }

        public Criteria andComptimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("comptime not between", value1, value2, "comptime");
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