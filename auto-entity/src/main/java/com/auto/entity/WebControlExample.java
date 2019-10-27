package com.auto.entity;

import java.util.ArrayList;
import java.util.List;

public class WebControlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebControlExample() {
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

        public Criteria andControlidIsNull() {
            addCriterion("CONTROLID is null");
            return (Criteria) this;
        }

        public Criteria andControlidIsNotNull() {
            addCriterion("CONTROLID is not null");
            return (Criteria) this;
        }

        public Criteria andControlidEqualTo(Integer value) {
            addCriterion("CONTROLID =", value, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidNotEqualTo(Integer value) {
            addCriterion("CONTROLID <>", value, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidGreaterThan(Integer value) {
            addCriterion("CONTROLID >", value, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONTROLID >=", value, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidLessThan(Integer value) {
            addCriterion("CONTROLID <", value, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidLessThanOrEqualTo(Integer value) {
            addCriterion("CONTROLID <=", value, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidIn(List<Integer> values) {
            addCriterion("CONTROLID in", values, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidNotIn(List<Integer> values) {
            addCriterion("CONTROLID not in", values, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidBetween(Integer value1, Integer value2) {
            addCriterion("CONTROLID between", value1, value2, "controlid");
            return (Criteria) this;
        }

        public Criteria andControlidNotBetween(Integer value1, Integer value2) {
            addCriterion("CONTROLID not between", value1, value2, "controlid");
            return (Criteria) this;
        }

        public Criteria andCurrentdirIsNull() {
            addCriterion("CURRENTDIR is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdirIsNotNull() {
            addCriterion("CURRENTDIR is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdirEqualTo(String value) {
            addCriterion("CURRENTDIR =", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirNotEqualTo(String value) {
            addCriterion("CURRENTDIR <>", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirGreaterThan(String value) {
            addCriterion("CURRENTDIR >", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTDIR >=", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirLessThan(String value) {
            addCriterion("CURRENTDIR <", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirLessThanOrEqualTo(String value) {
            addCriterion("CURRENTDIR <=", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirLike(String value) {
            addCriterion("CURRENTDIR like", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirNotLike(String value) {
            addCriterion("CURRENTDIR not like", value, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirIn(List<String> values) {
            addCriterion("CURRENTDIR in", values, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirNotIn(List<String> values) {
            addCriterion("CURRENTDIR not in", values, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirBetween(String value1, String value2) {
            addCriterion("CURRENTDIR between", value1, value2, "currentdir");
            return (Criteria) this;
        }

        public Criteria andCurrentdirNotBetween(String value1, String value2) {
            addCriterion("CURRENTDIR not between", value1, value2, "currentdir");
            return (Criteria) this;
        }

        public Criteria andStopIsNull() {
            addCriterion("STOP is null");
            return (Criteria) this;
        }

        public Criteria andStopIsNotNull() {
            addCriterion("STOP is not null");
            return (Criteria) this;
        }

        public Criteria andStopEqualTo(Short value) {
            addCriterion("STOP =", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotEqualTo(Short value) {
            addCriterion("STOP <>", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThan(Short value) {
            addCriterion("STOP >", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopGreaterThanOrEqualTo(Short value) {
            addCriterion("STOP >=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThan(Short value) {
            addCriterion("STOP <", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopLessThanOrEqualTo(Short value) {
            addCriterion("STOP <=", value, "stop");
            return (Criteria) this;
        }

        public Criteria andStopIn(List<Short> values) {
            addCriterion("STOP in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotIn(List<Short> values) {
            addCriterion("STOP not in", values, "stop");
            return (Criteria) this;
        }

        public Criteria andStopBetween(Short value1, Short value2) {
            addCriterion("STOP between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStopNotBetween(Short value1, Short value2) {
            addCriterion("STOP not between", value1, value2, "stop");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("STARTDATE is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("STARTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(String value) {
            addCriterion("STARTDATE =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(String value) {
            addCriterion("STARTDATE <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(String value) {
            addCriterion("STARTDATE >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(String value) {
            addCriterion("STARTDATE >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(String value) {
            addCriterion("STARTDATE <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(String value) {
            addCriterion("STARTDATE <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLike(String value) {
            addCriterion("STARTDATE like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotLike(String value) {
            addCriterion("STARTDATE not like", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<String> values) {
            addCriterion("STARTDATE in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<String> values) {
            addCriterion("STARTDATE not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(String value1, String value2) {
            addCriterion("STARTDATE between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(String value1, String value2) {
            addCriterion("STARTDATE not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("ENDDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("ENDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("ENDDATE =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("ENDDATE <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("ENDDATE >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("ENDDATE >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("ENDDATE <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("ENDDATE <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("ENDDATE like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("ENDDATE not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("ENDDATE in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("ENDDATE not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("ENDDATE between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("ENDDATE not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andFinishIsNull() {
            addCriterion("FINISH is null");
            return (Criteria) this;
        }

        public Criteria andFinishIsNotNull() {
            addCriterion("FINISH is not null");
            return (Criteria) this;
        }

        public Criteria andFinishEqualTo(Short value) {
            addCriterion("FINISH =", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotEqualTo(Short value) {
            addCriterion("FINISH <>", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThan(Short value) {
            addCriterion("FINISH >", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThanOrEqualTo(Short value) {
            addCriterion("FINISH >=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThan(Short value) {
            addCriterion("FINISH <", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThanOrEqualTo(Short value) {
            addCriterion("FINISH <=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishIn(List<Short> values) {
            addCriterion("FINISH in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotIn(List<Short> values) {
            addCriterion("FINISH not in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishBetween(Short value1, Short value2) {
            addCriterion("FINISH between", value1, value2, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotBetween(Short value1, Short value2) {
            addCriterion("FINISH not between", value1, value2, "finish");
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