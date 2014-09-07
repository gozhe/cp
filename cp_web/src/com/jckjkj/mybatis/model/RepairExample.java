package com.jckjkj.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RepairExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RepairExample() {
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