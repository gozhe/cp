package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
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

        public Criteria andRouidIsNull() {
            addCriterion("rouid is null");
            return (Criteria) this;
        }

        public Criteria andRouidIsNotNull() {
            addCriterion("rouid is not null");
            return (Criteria) this;
        }

        public Criteria andRouidEqualTo(Long value) {
            addCriterion("rouid =", value, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidNotEqualTo(Long value) {
            addCriterion("rouid <>", value, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidGreaterThan(Long value) {
            addCriterion("rouid >", value, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidGreaterThanOrEqualTo(Long value) {
            addCriterion("rouid >=", value, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidLessThan(Long value) {
            addCriterion("rouid <", value, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidLessThanOrEqualTo(Long value) {
            addCriterion("rouid <=", value, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidIn(List<Long> values) {
            addCriterion("rouid in", values, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidNotIn(List<Long> values) {
            addCriterion("rouid not in", values, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidBetween(Long value1, Long value2) {
            addCriterion("rouid between", value1, value2, "rouid");
            return (Criteria) this;
        }

        public Criteria andRouidNotBetween(Long value1, Long value2) {
            addCriterion("rouid not between", value1, value2, "rouid");
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
            addCriterionForJDBCDate("signintime =", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("signintime <>", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("signintime >", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signintime >=", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeLessThan(Date value) {
            addCriterionForJDBCDate("signintime <", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("signintime <=", value, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeIn(List<Date> values) {
            addCriterionForJDBCDate("signintime in", values, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("signintime not in", values, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signintime between", value1, value2, "signintime");
            return (Criteria) this;
        }

        public Criteria andSignintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("signintime not between", value1, value2, "signintime");
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

        public Criteria andAuditopinionIsNull() {
            addCriterion("auditopinion is null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIsNotNull() {
            addCriterion("auditopinion is not null");
            return (Criteria) this;
        }

        public Criteria andAuditopinionEqualTo(String value) {
            addCriterion("auditopinion =", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotEqualTo(String value) {
            addCriterion("auditopinion <>", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThan(String value) {
            addCriterion("auditopinion >", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionGreaterThanOrEqualTo(String value) {
            addCriterion("auditopinion >=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThan(String value) {
            addCriterion("auditopinion <", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLessThanOrEqualTo(String value) {
            addCriterion("auditopinion <=", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionLike(String value) {
            addCriterion("auditopinion like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotLike(String value) {
            addCriterion("auditopinion not like", value, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionIn(List<String> values) {
            addCriterion("auditopinion in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotIn(List<String> values) {
            addCriterion("auditopinion not in", values, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionBetween(String value1, String value2) {
            addCriterion("auditopinion between", value1, value2, "auditopinion");
            return (Criteria) this;
        }

        public Criteria andAuditopinionNotBetween(String value1, String value2) {
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

        public Criteria andPersionidIsNull() {
            addCriterion("persionid is null");
            return (Criteria) this;
        }

        public Criteria andPersionidIsNotNull() {
            addCriterion("persionid is not null");
            return (Criteria) this;
        }

        public Criteria andPersionidEqualTo(Integer value) {
            addCriterion("persionid =", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidNotEqualTo(Integer value) {
            addCriterion("persionid <>", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidGreaterThan(Integer value) {
            addCriterion("persionid >", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("persionid >=", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidLessThan(Integer value) {
            addCriterion("persionid <", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidLessThanOrEqualTo(Integer value) {
            addCriterion("persionid <=", value, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidIn(List<Integer> values) {
            addCriterion("persionid in", values, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidNotIn(List<Integer> values) {
            addCriterion("persionid not in", values, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidBetween(Integer value1, Integer value2) {
            addCriterion("persionid between", value1, value2, "persionid");
            return (Criteria) this;
        }

        public Criteria andPersionidNotBetween(Integer value1, Integer value2) {
            addCriterion("persionid not between", value1, value2, "persionid");
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