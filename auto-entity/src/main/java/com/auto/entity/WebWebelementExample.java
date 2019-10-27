package com.auto.entity;

import java.util.ArrayList;
import java.util.List;

public class WebWebelementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebWebelementExample() {
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

        public Criteria andMenucodeIsNull() {
            addCriterion("MENUCODE is null");
            return (Criteria) this;
        }

        public Criteria andMenucodeIsNotNull() {
            addCriterion("MENUCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMenucodeEqualTo(String value) {
            addCriterion("MENUCODE =", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotEqualTo(String value) {
            addCriterion("MENUCODE <>", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeGreaterThan(String value) {
            addCriterion("MENUCODE >", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeGreaterThanOrEqualTo(String value) {
            addCriterion("MENUCODE >=", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeLessThan(String value) {
            addCriterion("MENUCODE <", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeLessThanOrEqualTo(String value) {
            addCriterion("MENUCODE <=", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeLike(String value) {
            addCriterion("MENUCODE like", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotLike(String value) {
            addCriterion("MENUCODE not like", value, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeIn(List<String> values) {
            addCriterion("MENUCODE in", values, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotIn(List<String> values) {
            addCriterion("MENUCODE not in", values, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeBetween(String value1, String value2) {
            addCriterion("MENUCODE between", value1, value2, "menucode");
            return (Criteria) this;
        }

        public Criteria andMenucodeNotBetween(String value1, String value2) {
            addCriterion("MENUCODE not between", value1, value2, "menucode");
            return (Criteria) this;
        }

        public Criteria andPageelementIsNull() {
            addCriterion("PAGEELEMENT is null");
            return (Criteria) this;
        }

        public Criteria andPageelementIsNotNull() {
            addCriterion("PAGEELEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPageelementEqualTo(String value) {
            addCriterion("PAGEELEMENT =", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementNotEqualTo(String value) {
            addCriterion("PAGEELEMENT <>", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementGreaterThan(String value) {
            addCriterion("PAGEELEMENT >", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementGreaterThanOrEqualTo(String value) {
            addCriterion("PAGEELEMENT >=", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementLessThan(String value) {
            addCriterion("PAGEELEMENT <", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementLessThanOrEqualTo(String value) {
            addCriterion("PAGEELEMENT <=", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementLike(String value) {
            addCriterion("PAGEELEMENT like", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementNotLike(String value) {
            addCriterion("PAGEELEMENT not like", value, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementIn(List<String> values) {
            addCriterion("PAGEELEMENT in", values, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementNotIn(List<String> values) {
            addCriterion("PAGEELEMENT not in", values, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementBetween(String value1, String value2) {
            addCriterion("PAGEELEMENT between", value1, value2, "pageelement");
            return (Criteria) this;
        }

        public Criteria andPageelementNotBetween(String value1, String value2) {
            addCriterion("PAGEELEMENT not between", value1, value2, "pageelement");
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