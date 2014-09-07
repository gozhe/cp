package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VOrderRepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VOrderRepairExample() {
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

        public Criteria andFaultgradeEqualTo(String value) {
            addCriterion("faultgrade =", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeNotEqualTo(String value) {
            addCriterion("faultgrade <>", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeGreaterThan(String value) {
            addCriterion("faultgrade >", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeGreaterThanOrEqualTo(String value) {
            addCriterion("faultgrade >=", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeLessThan(String value) {
            addCriterion("faultgrade <", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeLessThanOrEqualTo(String value) {
            addCriterion("faultgrade <=", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeLike(String value) {
            addCriterion("faultgrade like", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeNotLike(String value) {
            addCriterion("faultgrade not like", value, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeIn(List<String> values) {
            addCriterion("faultgrade in", values, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeNotIn(List<String> values) {
            addCriterion("faultgrade not in", values, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeBetween(String value1, String value2) {
            addCriterion("faultgrade between", value1, value2, "faultgrade");
            return (Criteria) this;
        }

        public Criteria andFaultgradeNotBetween(String value1, String value2) {
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

        public Criteria andFaultclass1IsNull() {
            addCriterion("faultclass1 is null");
            return (Criteria) this;
        }

        public Criteria andFaultclass1IsNotNull() {
            addCriterion("faultclass1 is not null");
            return (Criteria) this;
        }

        public Criteria andFaultclass1EqualTo(String value) {
            addCriterion("faultclass1 =", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1NotEqualTo(String value) {
            addCriterion("faultclass1 <>", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1GreaterThan(String value) {
            addCriterion("faultclass1 >", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1GreaterThanOrEqualTo(String value) {
            addCriterion("faultclass1 >=", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1LessThan(String value) {
            addCriterion("faultclass1 <", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1LessThanOrEqualTo(String value) {
            addCriterion("faultclass1 <=", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1Like(String value) {
            addCriterion("faultclass1 like", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1NotLike(String value) {
            addCriterion("faultclass1 not like", value, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1In(List<String> values) {
            addCriterion("faultclass1 in", values, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1NotIn(List<String> values) {
            addCriterion("faultclass1 not in", values, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1Between(String value1, String value2) {
            addCriterion("faultclass1 between", value1, value2, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andFaultclass1NotBetween(String value1, String value2) {
            addCriterion("faultclass1 not between", value1, value2, "faultclass1");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("creater is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("creater is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("creater =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("creater <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("creater >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("creater >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("creater <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("creater <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("creater like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("creater not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("creater in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("creater not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("creater between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("creater not between", value1, value2, "creater");
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
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
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
            addCriterion("estcomptime =", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeNotEqualTo(Date value) {
            addCriterion("estcomptime <>", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeGreaterThan(Date value) {
            addCriterion("estcomptime >", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeGreaterThanOrEqualTo(Date value) {
            addCriterion("estcomptime >=", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeLessThan(Date value) {
            addCriterion("estcomptime <", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeLessThanOrEqualTo(Date value) {
            addCriterion("estcomptime <=", value, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeIn(List<Date> values) {
            addCriterion("estcomptime in", values, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeNotIn(List<Date> values) {
            addCriterion("estcomptime not in", values, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeBetween(Date value1, Date value2) {
            addCriterion("estcomptime between", value1, value2, "estcomptime");
            return (Criteria) this;
        }

        public Criteria andEstcomptimeNotBetween(Date value1, Date value2) {
            addCriterion("estcomptime not between", value1, value2, "estcomptime");
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

        public Criteria andOrdersourceIsNull() {
            addCriterion("ordersource is null");
            return (Criteria) this;
        }

        public Criteria andOrdersourceIsNotNull() {
            addCriterion("ordersource is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersourceEqualTo(Integer value) {
            addCriterion("ordersource =", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceNotEqualTo(Integer value) {
            addCriterion("ordersource <>", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceGreaterThan(Integer value) {
            addCriterion("ordersource >", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordersource >=", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceLessThan(Integer value) {
            addCriterion("ordersource <", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceLessThanOrEqualTo(Integer value) {
            addCriterion("ordersource <=", value, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceIn(List<Integer> values) {
            addCriterion("ordersource in", values, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceNotIn(List<Integer> values) {
            addCriterion("ordersource not in", values, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceBetween(Integer value1, Integer value2) {
            addCriterion("ordersource between", value1, value2, "ordersource");
            return (Criteria) this;
        }

        public Criteria andOrdersourceNotBetween(Integer value1, Integer value2) {
            addCriterion("ordersource not between", value1, value2, "ordersource");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNull() {
            addCriterion("material is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIsNotNull() {
            addCriterion("material is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialEqualTo(String value) {
            addCriterion("material =", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotEqualTo(String value) {
            addCriterion("material <>", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThan(String value) {
            addCriterion("material >", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("material >=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThan(String value) {
            addCriterion("material <", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLessThanOrEqualTo(String value) {
            addCriterion("material <=", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialLike(String value) {
            addCriterion("material like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotLike(String value) {
            addCriterion("material not like", value, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialIn(List<String> values) {
            addCriterion("material in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotIn(List<String> values) {
            addCriterion("material not in", values, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialBetween(String value1, String value2) {
            addCriterion("material between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andMaterialNotBetween(String value1, String value2) {
            addCriterion("material not between", value1, value2, "material");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(String value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(String value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(String value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(String value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(String value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(String value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLike(String value) {
            addCriterion("count like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotLike(String value) {
            addCriterion("count not like", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<String> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<String> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(String value1, String value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(String value1, String value2) {
            addCriterion("count not between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andRepairerIsNull() {
            addCriterion("repairer is null");
            return (Criteria) this;
        }

        public Criteria andRepairerIsNotNull() {
            addCriterion("repairer is not null");
            return (Criteria) this;
        }

        public Criteria andRepairerEqualTo(String value) {
            addCriterion("repairer =", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotEqualTo(String value) {
            addCriterion("repairer <>", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerGreaterThan(String value) {
            addCriterion("repairer >", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerGreaterThanOrEqualTo(String value) {
            addCriterion("repairer >=", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLessThan(String value) {
            addCriterion("repairer <", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLessThanOrEqualTo(String value) {
            addCriterion("repairer <=", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerLike(String value) {
            addCriterion("repairer like", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotLike(String value) {
            addCriterion("repairer not like", value, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerIn(List<String> values) {
            addCriterion("repairer in", values, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotIn(List<String> values) {
            addCriterion("repairer not in", values, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerBetween(String value1, String value2) {
            addCriterion("repairer between", value1, value2, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairerNotBetween(String value1, String value2) {
            addCriterion("repairer not between", value1, value2, "repairer");
            return (Criteria) this;
        }

        public Criteria andRepairtimeIsNull() {
            addCriterion("repairtime is null");
            return (Criteria) this;
        }

        public Criteria andRepairtimeIsNotNull() {
            addCriterion("repairtime is not null");
            return (Criteria) this;
        }

        public Criteria andRepairtimeEqualTo(Date value) {
            addCriterion("repairtime =", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeNotEqualTo(Date value) {
            addCriterion("repairtime <>", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeGreaterThan(Date value) {
            addCriterion("repairtime >", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("repairtime >=", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeLessThan(Date value) {
            addCriterion("repairtime <", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeLessThanOrEqualTo(Date value) {
            addCriterion("repairtime <=", value, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeIn(List<Date> values) {
            addCriterion("repairtime in", values, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeNotIn(List<Date> values) {
            addCriterion("repairtime not in", values, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeBetween(Date value1, Date value2) {
            addCriterion("repairtime between", value1, value2, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepairtimeNotBetween(Date value1, Date value2) {
            addCriterion("repairtime not between", value1, value2, "repairtime");
            return (Criteria) this;
        }

        public Criteria andRepaircontentIsNull() {
            addCriterion("repaircontent is null");
            return (Criteria) this;
        }

        public Criteria andRepaircontentIsNotNull() {
            addCriterion("repaircontent is not null");
            return (Criteria) this;
        }

        public Criteria andRepaircontentEqualTo(String value) {
            addCriterion("repaircontent =", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentNotEqualTo(String value) {
            addCriterion("repaircontent <>", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentGreaterThan(String value) {
            addCriterion("repaircontent >", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentGreaterThanOrEqualTo(String value) {
            addCriterion("repaircontent >=", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentLessThan(String value) {
            addCriterion("repaircontent <", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentLessThanOrEqualTo(String value) {
            addCriterion("repaircontent <=", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentLike(String value) {
            addCriterion("repaircontent like", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentNotLike(String value) {
            addCriterion("repaircontent not like", value, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentIn(List<String> values) {
            addCriterion("repaircontent in", values, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentNotIn(List<String> values) {
            addCriterion("repaircontent not in", values, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentBetween(String value1, String value2) {
            addCriterion("repaircontent between", value1, value2, "repaircontent");
            return (Criteria) this;
        }

        public Criteria andRepaircontentNotBetween(String value1, String value2) {
            addCriterion("repaircontent not between", value1, value2, "repaircontent");
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