package com.asiainfo.entity;

import java.util.ArrayList;
import java.util.List;

public class WebConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebConfigExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParatypeIsNull() {
            addCriterion("PARATYPE is null");
            return (Criteria) this;
        }

        public Criteria andParatypeIsNotNull() {
            addCriterion("PARATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andParatypeEqualTo(String value) {
            addCriterion("PARATYPE =", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeNotEqualTo(String value) {
            addCriterion("PARATYPE <>", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeGreaterThan(String value) {
            addCriterion("PARATYPE >", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeGreaterThanOrEqualTo(String value) {
            addCriterion("PARATYPE >=", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeLessThan(String value) {
            addCriterion("PARATYPE <", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeLessThanOrEqualTo(String value) {
            addCriterion("PARATYPE <=", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeLike(String value) {
            addCriterion("PARATYPE like", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeNotLike(String value) {
            addCriterion("PARATYPE not like", value, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeIn(List<String> values) {
            addCriterion("PARATYPE in", values, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeNotIn(List<String> values) {
            addCriterion("PARATYPE not in", values, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeBetween(String value1, String value2) {
            addCriterion("PARATYPE between", value1, value2, "paratype");
            return (Criteria) this;
        }

        public Criteria andParatypeNotBetween(String value1, String value2) {
            addCriterion("PARATYPE not between", value1, value2, "paratype");
            return (Criteria) this;
        }

        public Criteria andParacodeIsNull() {
            addCriterion("PARACODE is null");
            return (Criteria) this;
        }

        public Criteria andParacodeIsNotNull() {
            addCriterion("PARACODE is not null");
            return (Criteria) this;
        }

        public Criteria andParacodeEqualTo(String value) {
            addCriterion("PARACODE =", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeNotEqualTo(String value) {
            addCriterion("PARACODE <>", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeGreaterThan(String value) {
            addCriterion("PARACODE >", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeGreaterThanOrEqualTo(String value) {
            addCriterion("PARACODE >=", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeLessThan(String value) {
            addCriterion("PARACODE <", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeLessThanOrEqualTo(String value) {
            addCriterion("PARACODE <=", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeLike(String value) {
            addCriterion("PARACODE like", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeNotLike(String value) {
            addCriterion("PARACODE not like", value, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeIn(List<String> values) {
            addCriterion("PARACODE in", values, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeNotIn(List<String> values) {
            addCriterion("PARACODE not in", values, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeBetween(String value1, String value2) {
            addCriterion("PARACODE between", value1, value2, "paracode");
            return (Criteria) this;
        }

        public Criteria andParacodeNotBetween(String value1, String value2) {
            addCriterion("PARACODE not between", value1, value2, "paracode");
            return (Criteria) this;
        }

        public Criteria andPara1IsNull() {
            addCriterion("PARA1 is null");
            return (Criteria) this;
        }

        public Criteria andPara1IsNotNull() {
            addCriterion("PARA1 is not null");
            return (Criteria) this;
        }

        public Criteria andPara1EqualTo(String value) {
            addCriterion("PARA1 =", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1NotEqualTo(String value) {
            addCriterion("PARA1 <>", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1GreaterThan(String value) {
            addCriterion("PARA1 >", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1GreaterThanOrEqualTo(String value) {
            addCriterion("PARA1 >=", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1LessThan(String value) {
            addCriterion("PARA1 <", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1LessThanOrEqualTo(String value) {
            addCriterion("PARA1 <=", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1Like(String value) {
            addCriterion("PARA1 like", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1NotLike(String value) {
            addCriterion("PARA1 not like", value, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1In(List<String> values) {
            addCriterion("PARA1 in", values, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1NotIn(List<String> values) {
            addCriterion("PARA1 not in", values, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1Between(String value1, String value2) {
            addCriterion("PARA1 between", value1, value2, "para1");
            return (Criteria) this;
        }

        public Criteria andPara1NotBetween(String value1, String value2) {
            addCriterion("PARA1 not between", value1, value2, "para1");
            return (Criteria) this;
        }

        public Criteria andPara2IsNull() {
            addCriterion("PARA2 is null");
            return (Criteria) this;
        }

        public Criteria andPara2IsNotNull() {
            addCriterion("PARA2 is not null");
            return (Criteria) this;
        }

        public Criteria andPara2EqualTo(String value) {
            addCriterion("PARA2 =", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2NotEqualTo(String value) {
            addCriterion("PARA2 <>", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2GreaterThan(String value) {
            addCriterion("PARA2 >", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2GreaterThanOrEqualTo(String value) {
            addCriterion("PARA2 >=", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2LessThan(String value) {
            addCriterion("PARA2 <", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2LessThanOrEqualTo(String value) {
            addCriterion("PARA2 <=", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2Like(String value) {
            addCriterion("PARA2 like", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2NotLike(String value) {
            addCriterion("PARA2 not like", value, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2In(List<String> values) {
            addCriterion("PARA2 in", values, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2NotIn(List<String> values) {
            addCriterion("PARA2 not in", values, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2Between(String value1, String value2) {
            addCriterion("PARA2 between", value1, value2, "para2");
            return (Criteria) this;
        }

        public Criteria andPara2NotBetween(String value1, String value2) {
            addCriterion("PARA2 not between", value1, value2, "para2");
            return (Criteria) this;
        }

        public Criteria andPara3IsNull() {
            addCriterion("PARA3 is null");
            return (Criteria) this;
        }

        public Criteria andPara3IsNotNull() {
            addCriterion("PARA3 is not null");
            return (Criteria) this;
        }

        public Criteria andPara3EqualTo(String value) {
            addCriterion("PARA3 =", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3NotEqualTo(String value) {
            addCriterion("PARA3 <>", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3GreaterThan(String value) {
            addCriterion("PARA3 >", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3GreaterThanOrEqualTo(String value) {
            addCriterion("PARA3 >=", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3LessThan(String value) {
            addCriterion("PARA3 <", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3LessThanOrEqualTo(String value) {
            addCriterion("PARA3 <=", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3Like(String value) {
            addCriterion("PARA3 like", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3NotLike(String value) {
            addCriterion("PARA3 not like", value, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3In(List<String> values) {
            addCriterion("PARA3 in", values, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3NotIn(List<String> values) {
            addCriterion("PARA3 not in", values, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3Between(String value1, String value2) {
            addCriterion("PARA3 between", value1, value2, "para3");
            return (Criteria) this;
        }

        public Criteria andPara3NotBetween(String value1, String value2) {
            addCriterion("PARA3 not between", value1, value2, "para3");
            return (Criteria) this;
        }

        public Criteria andPara4IsNull() {
            addCriterion("PARA4 is null");
            return (Criteria) this;
        }

        public Criteria andPara4IsNotNull() {
            addCriterion("PARA4 is not null");
            return (Criteria) this;
        }

        public Criteria andPara4EqualTo(String value) {
            addCriterion("PARA4 =", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4NotEqualTo(String value) {
            addCriterion("PARA4 <>", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4GreaterThan(String value) {
            addCriterion("PARA4 >", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4GreaterThanOrEqualTo(String value) {
            addCriterion("PARA4 >=", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4LessThan(String value) {
            addCriterion("PARA4 <", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4LessThanOrEqualTo(String value) {
            addCriterion("PARA4 <=", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4Like(String value) {
            addCriterion("PARA4 like", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4NotLike(String value) {
            addCriterion("PARA4 not like", value, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4In(List<String> values) {
            addCriterion("PARA4 in", values, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4NotIn(List<String> values) {
            addCriterion("PARA4 not in", values, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4Between(String value1, String value2) {
            addCriterion("PARA4 between", value1, value2, "para4");
            return (Criteria) this;
        }

        public Criteria andPara4NotBetween(String value1, String value2) {
            addCriterion("PARA4 not between", value1, value2, "para4");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
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