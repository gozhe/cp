package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EquipmentStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentStateExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
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

        public Criteria andWarningclassIsNull() {
            addCriterion("warningclass is null");
            return (Criteria) this;
        }

        public Criteria andWarningclassIsNotNull() {
            addCriterion("warningclass is not null");
            return (Criteria) this;
        }

        public Criteria andWarningclassEqualTo(String value) {
            addCriterion("warningclass =", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassNotEqualTo(String value) {
            addCriterion("warningclass <>", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassGreaterThan(String value) {
            addCriterion("warningclass >", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassGreaterThanOrEqualTo(String value) {
            addCriterion("warningclass >=", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassLessThan(String value) {
            addCriterion("warningclass <", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassLessThanOrEqualTo(String value) {
            addCriterion("warningclass <=", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassLike(String value) {
            addCriterion("warningclass like", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassNotLike(String value) {
            addCriterion("warningclass not like", value, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassIn(List<String> values) {
            addCriterion("warningclass in", values, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassNotIn(List<String> values) {
            addCriterion("warningclass not in", values, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassBetween(String value1, String value2) {
            addCriterion("warningclass between", value1, value2, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarningclassNotBetween(String value1, String value2) {
            addCriterion("warningclass not between", value1, value2, "warningclass");
            return (Criteria) this;
        }

        public Criteria andWarninggradeIsNull() {
            addCriterion("warninggrade is null");
            return (Criteria) this;
        }

        public Criteria andWarninggradeIsNotNull() {
            addCriterion("warninggrade is not null");
            return (Criteria) this;
        }

        public Criteria andWarninggradeEqualTo(String value) {
            addCriterion("warninggrade =", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeNotEqualTo(String value) {
            addCriterion("warninggrade <>", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeGreaterThan(String value) {
            addCriterion("warninggrade >", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeGreaterThanOrEqualTo(String value) {
            addCriterion("warninggrade >=", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeLessThan(String value) {
            addCriterion("warninggrade <", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeLessThanOrEqualTo(String value) {
            addCriterion("warninggrade <=", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeLike(String value) {
            addCriterion("warninggrade like", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeNotLike(String value) {
            addCriterion("warninggrade not like", value, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeIn(List<String> values) {
            addCriterion("warninggrade in", values, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeNotIn(List<String> values) {
            addCriterion("warninggrade not in", values, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeBetween(String value1, String value2) {
            addCriterion("warninggrade between", value1, value2, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarninggradeNotBetween(String value1, String value2) {
            addCriterion("warninggrade not between", value1, value2, "warninggrade");
            return (Criteria) this;
        }

        public Criteria andWarningstateIsNull() {
            addCriterion("warningstate is null");
            return (Criteria) this;
        }

        public Criteria andWarningstateIsNotNull() {
            addCriterion("warningstate is not null");
            return (Criteria) this;
        }

        public Criteria andWarningstateEqualTo(String value) {
            addCriterion("warningstate =", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateNotEqualTo(String value) {
            addCriterion("warningstate <>", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateGreaterThan(String value) {
            addCriterion("warningstate >", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateGreaterThanOrEqualTo(String value) {
            addCriterion("warningstate >=", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateLessThan(String value) {
            addCriterion("warningstate <", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateLessThanOrEqualTo(String value) {
            addCriterion("warningstate <=", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateLike(String value) {
            addCriterion("warningstate like", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateNotLike(String value) {
            addCriterion("warningstate not like", value, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateIn(List<String> values) {
            addCriterion("warningstate in", values, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateNotIn(List<String> values) {
            addCriterion("warningstate not in", values, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateBetween(String value1, String value2) {
            addCriterion("warningstate between", value1, value2, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningstateNotBetween(String value1, String value2) {
            addCriterion("warningstate not between", value1, value2, "warningstate");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameIsNull() {
            addCriterion("warningsourcename is null");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameIsNotNull() {
            addCriterion("warningsourcename is not null");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameEqualTo(String value) {
            addCriterion("warningsourcename =", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameNotEqualTo(String value) {
            addCriterion("warningsourcename <>", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameGreaterThan(String value) {
            addCriterion("warningsourcename >", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameGreaterThanOrEqualTo(String value) {
            addCriterion("warningsourcename >=", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameLessThan(String value) {
            addCriterion("warningsourcename <", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameLessThanOrEqualTo(String value) {
            addCriterion("warningsourcename <=", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameLike(String value) {
            addCriterion("warningsourcename like", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameNotLike(String value) {
            addCriterion("warningsourcename not like", value, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameIn(List<String> values) {
            addCriterion("warningsourcename in", values, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameNotIn(List<String> values) {
            addCriterion("warningsourcename not in", values, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameBetween(String value1, String value2) {
            addCriterion("warningsourcename between", value1, value2, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourcenameNotBetween(String value1, String value2) {
            addCriterion("warningsourcename not between", value1, value2, "warningsourcename");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipIsNull() {
            addCriterion("warningsourceip is null");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipIsNotNull() {
            addCriterion("warningsourceip is not null");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipEqualTo(String value) {
            addCriterion("warningsourceip =", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipNotEqualTo(String value) {
            addCriterion("warningsourceip <>", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipGreaterThan(String value) {
            addCriterion("warningsourceip >", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipGreaterThanOrEqualTo(String value) {
            addCriterion("warningsourceip >=", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipLessThan(String value) {
            addCriterion("warningsourceip <", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipLessThanOrEqualTo(String value) {
            addCriterion("warningsourceip <=", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipLike(String value) {
            addCriterion("warningsourceip like", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipNotLike(String value) {
            addCriterion("warningsourceip not like", value, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipIn(List<String> values) {
            addCriterion("warningsourceip in", values, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipNotIn(List<String> values) {
            addCriterion("warningsourceip not in", values, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipBetween(String value1, String value2) {
            addCriterion("warningsourceip between", value1, value2, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningsourceipNotBetween(String value1, String value2) {
            addCriterion("warningsourceip not between", value1, value2, "warningsourceip");
            return (Criteria) this;
        }

        public Criteria andWarningcountIsNull() {
            addCriterion("warningcount is null");
            return (Criteria) this;
        }

        public Criteria andWarningcountIsNotNull() {
            addCriterion("warningcount is not null");
            return (Criteria) this;
        }

        public Criteria andWarningcountEqualTo(Integer value) {
            addCriterion("warningcount =", value, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountNotEqualTo(Integer value) {
            addCriterion("warningcount <>", value, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountGreaterThan(Integer value) {
            addCriterion("warningcount >", value, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("warningcount >=", value, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountLessThan(Integer value) {
            addCriterion("warningcount <", value, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountLessThanOrEqualTo(Integer value) {
            addCriterion("warningcount <=", value, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountIn(List<Integer> values) {
            addCriterion("warningcount in", values, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountNotIn(List<Integer> values) {
            addCriterion("warningcount not in", values, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountBetween(Integer value1, Integer value2) {
            addCriterion("warningcount between", value1, value2, "warningcount");
            return (Criteria) this;
        }

        public Criteria andWarningcountNotBetween(Integer value1, Integer value2) {
            addCriterion("warningcount not between", value1, value2, "warningcount");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeIsNull() {
            addCriterion("recentlyfaulttime is null");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeIsNotNull() {
            addCriterion("recentlyfaulttime is not null");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeEqualTo(Date value) {
            addCriterion("recentlyfaulttime =", value, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeNotEqualTo(Date value) {
            addCriterion("recentlyfaulttime <>", value, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeGreaterThan(Date value) {
            addCriterion("recentlyfaulttime >", value, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("recentlyfaulttime >=", value, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeLessThan(Date value) {
            addCriterion("recentlyfaulttime <", value, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeLessThanOrEqualTo(Date value) {
            addCriterion("recentlyfaulttime <=", value, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeIn(List<Date> values) {
            addCriterion("recentlyfaulttime in", values, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeNotIn(List<Date> values) {
            addCriterion("recentlyfaulttime not in", values, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeBetween(Date value1, Date value2) {
            addCriterion("recentlyfaulttime between", value1, value2, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andRecentlyfaulttimeNotBetween(Date value1, Date value2) {
            addCriterion("recentlyfaulttime not between", value1, value2, "recentlyfaulttime");
            return (Criteria) this;
        }

        public Criteria andWarningcontentIsNull() {
            addCriterion("warningcontent is null");
            return (Criteria) this;
        }

        public Criteria andWarningcontentIsNotNull() {
            addCriterion("warningcontent is not null");
            return (Criteria) this;
        }

        public Criteria andWarningcontentEqualTo(String value) {
            addCriterion("warningcontent =", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentNotEqualTo(String value) {
            addCriterion("warningcontent <>", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentGreaterThan(String value) {
            addCriterion("warningcontent >", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentGreaterThanOrEqualTo(String value) {
            addCriterion("warningcontent >=", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentLessThan(String value) {
            addCriterion("warningcontent <", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentLessThanOrEqualTo(String value) {
            addCriterion("warningcontent <=", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentLike(String value) {
            addCriterion("warningcontent like", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentNotLike(String value) {
            addCriterion("warningcontent not like", value, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentIn(List<String> values) {
            addCriterion("warningcontent in", values, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentNotIn(List<String> values) {
            addCriterion("warningcontent not in", values, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentBetween(String value1, String value2) {
            addCriterion("warningcontent between", value1, value2, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andWarningcontentNotBetween(String value1, String value2) {
            addCriterion("warningcontent not between", value1, value2, "warningcontent");
            return (Criteria) this;
        }

        public Criteria andIfreparingIsNull() {
            addCriterion("ifreparing is null");
            return (Criteria) this;
        }

        public Criteria andIfreparingIsNotNull() {
            addCriterion("ifreparing is not null");
            return (Criteria) this;
        }

        public Criteria andIfreparingEqualTo(Boolean value) {
            addCriterion("ifreparing =", value, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingNotEqualTo(Boolean value) {
            addCriterion("ifreparing <>", value, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingGreaterThan(Boolean value) {
            addCriterion("ifreparing >", value, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ifreparing >=", value, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingLessThan(Boolean value) {
            addCriterion("ifreparing <", value, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingLessThanOrEqualTo(Boolean value) {
            addCriterion("ifreparing <=", value, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingIn(List<Boolean> values) {
            addCriterion("ifreparing in", values, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingNotIn(List<Boolean> values) {
            addCriterion("ifreparing not in", values, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingBetween(Boolean value1, Boolean value2) {
            addCriterion("ifreparing between", value1, value2, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andIfreparingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ifreparing not between", value1, value2, "ifreparing");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNull() {
            addCriterion("refreshtime is null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIsNotNull() {
            addCriterion("refreshtime is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeEqualTo(Date value) {
            addCriterionForJDBCDate("refreshtime =", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("refreshtime <>", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("refreshtime >", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("refreshtime >=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThan(Date value) {
            addCriterionForJDBCDate("refreshtime <", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("refreshtime <=", value, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeIn(List<Date> values) {
            addCriterionForJDBCDate("refreshtime in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("refreshtime not in", values, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("refreshtime between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andRefreshtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("refreshtime not between", value1, value2, "refreshtime");
            return (Criteria) this;
        }

        public Criteria andEqutypeIsNull() {
            addCriterion("equtype is null");
            return (Criteria) this;
        }

        public Criteria andEqutypeIsNotNull() {
            addCriterion("equtype is not null");
            return (Criteria) this;
        }

        public Criteria andEqutypeEqualTo(String value) {
            addCriterion("equtype =", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotEqualTo(String value) {
            addCriterion("equtype <>", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeGreaterThan(String value) {
            addCriterion("equtype >", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeGreaterThanOrEqualTo(String value) {
            addCriterion("equtype >=", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeLessThan(String value) {
            addCriterion("equtype <", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeLessThanOrEqualTo(String value) {
            addCriterion("equtype <=", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeLike(String value) {
            addCriterion("equtype like", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotLike(String value) {
            addCriterion("equtype not like", value, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeIn(List<String> values) {
            addCriterion("equtype in", values, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotIn(List<String> values) {
            addCriterion("equtype not in", values, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeBetween(String value1, String value2) {
            addCriterion("equtype between", value1, value2, "equtype");
            return (Criteria) this;
        }

        public Criteria andEqutypeNotBetween(String value1, String value2) {
            addCriterion("equtype not between", value1, value2, "equtype");
            return (Criteria) this;
        }

        public Criteria andEquipIsNull() {
            addCriterion("equip is null");
            return (Criteria) this;
        }

        public Criteria andEquipIsNotNull() {
            addCriterion("equip is not null");
            return (Criteria) this;
        }

        public Criteria andEquipEqualTo(String value) {
            addCriterion("equip =", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotEqualTo(String value) {
            addCriterion("equip <>", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipGreaterThan(String value) {
            addCriterion("equip >", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipGreaterThanOrEqualTo(String value) {
            addCriterion("equip >=", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLessThan(String value) {
            addCriterion("equip <", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLessThanOrEqualTo(String value) {
            addCriterion("equip <=", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipLike(String value) {
            addCriterion("equip like", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotLike(String value) {
            addCriterion("equip not like", value, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipIn(List<String> values) {
            addCriterion("equip in", values, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotIn(List<String> values) {
            addCriterion("equip not in", values, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipBetween(String value1, String value2) {
            addCriterion("equip between", value1, value2, "equip");
            return (Criteria) this;
        }

        public Criteria andEquipNotBetween(String value1, String value2) {
            addCriterion("equip not between", value1, value2, "equip");
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