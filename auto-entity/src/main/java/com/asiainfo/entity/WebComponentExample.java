package com.asiainfo.entity;

import java.util.ArrayList;
import java.util.List;

public class WebComponentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebComponentExample() {
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

        public Criteria andComidIsNull() {
            addCriterion("COMID is null");
            return (Criteria) this;
        }

        public Criteria andComidIsNotNull() {
            addCriterion("COMID is not null");
            return (Criteria) this;
        }

        public Criteria andComidEqualTo(Integer value) {
            addCriterion("COMID =", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotEqualTo(Integer value) {
            addCriterion("COMID <>", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThan(Integer value) {
            addCriterion("COMID >", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMID >=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThan(Integer value) {
            addCriterion("COMID <", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidLessThanOrEqualTo(Integer value) {
            addCriterion("COMID <=", value, "comid");
            return (Criteria) this;
        }

        public Criteria andComidIn(List<Integer> values) {
            addCriterion("COMID in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotIn(List<Integer> values) {
            addCriterion("COMID not in", values, "comid");
            return (Criteria) this;
        }

        public Criteria andComidBetween(Integer value1, Integer value2) {
            addCriterion("COMID between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andComidNotBetween(Integer value1, Integer value2) {
            addCriterion("COMID not between", value1, value2, "comid");
            return (Criteria) this;
        }

        public Criteria andModulecodeIsNull() {
            addCriterion("MODULECODE is null");
            return (Criteria) this;
        }

        public Criteria andModulecodeIsNotNull() {
            addCriterion("MODULECODE is not null");
            return (Criteria) this;
        }

        public Criteria andModulecodeEqualTo(String value) {
            addCriterion("MODULECODE =", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotEqualTo(String value) {
            addCriterion("MODULECODE <>", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeGreaterThan(String value) {
            addCriterion("MODULECODE >", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeGreaterThanOrEqualTo(String value) {
            addCriterion("MODULECODE >=", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeLessThan(String value) {
            addCriterion("MODULECODE <", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeLessThanOrEqualTo(String value) {
            addCriterion("MODULECODE <=", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeLike(String value) {
            addCriterion("MODULECODE like", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotLike(String value) {
            addCriterion("MODULECODE not like", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeIn(List<String> values) {
            addCriterion("MODULECODE in", values, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotIn(List<String> values) {
            addCriterion("MODULECODE not in", values, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeBetween(String value1, String value2) {
            addCriterion("MODULECODE between", value1, value2, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotBetween(String value1, String value2) {
            addCriterion("MODULECODE not between", value1, value2, "modulecode");
            return (Criteria) this;
        }

        public Criteria andComcodeIsNull() {
            addCriterion("COMCODE is null");
            return (Criteria) this;
        }

        public Criteria andComcodeIsNotNull() {
            addCriterion("COMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andComcodeEqualTo(String value) {
            addCriterion("COMCODE =", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotEqualTo(String value) {
            addCriterion("COMCODE <>", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeGreaterThan(String value) {
            addCriterion("COMCODE >", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeGreaterThanOrEqualTo(String value) {
            addCriterion("COMCODE >=", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLessThan(String value) {
            addCriterion("COMCODE <", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLessThanOrEqualTo(String value) {
            addCriterion("COMCODE <=", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeLike(String value) {
            addCriterion("COMCODE like", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotLike(String value) {
            addCriterion("COMCODE not like", value, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeIn(List<String> values) {
            addCriterion("COMCODE in", values, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotIn(List<String> values) {
            addCriterion("COMCODE not in", values, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeBetween(String value1, String value2) {
            addCriterion("COMCODE between", value1, value2, "comcode");
            return (Criteria) this;
        }

        public Criteria andComcodeNotBetween(String value1, String value2) {
            addCriterion("COMCODE not between", value1, value2, "comcode");
            return (Criteria) this;
        }

        public Criteria andComnameIsNull() {
            addCriterion("COMNAME is null");
            return (Criteria) this;
        }

        public Criteria andComnameIsNotNull() {
            addCriterion("COMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andComnameEqualTo(String value) {
            addCriterion("COMNAME =", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotEqualTo(String value) {
            addCriterion("COMNAME <>", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThan(String value) {
            addCriterion("COMNAME >", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameGreaterThanOrEqualTo(String value) {
            addCriterion("COMNAME >=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThan(String value) {
            addCriterion("COMNAME <", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLessThanOrEqualTo(String value) {
            addCriterion("COMNAME <=", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameLike(String value) {
            addCriterion("COMNAME like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotLike(String value) {
            addCriterion("COMNAME not like", value, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameIn(List<String> values) {
            addCriterion("COMNAME in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotIn(List<String> values) {
            addCriterion("COMNAME not in", values, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameBetween(String value1, String value2) {
            addCriterion("COMNAME between", value1, value2, "comname");
            return (Criteria) this;
        }

        public Criteria andComnameNotBetween(String value1, String value2) {
            addCriterion("COMNAME not between", value1, value2, "comname");
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

        public Criteria andOpstepIsNull() {
            addCriterion("OPSTEP is null");
            return (Criteria) this;
        }

        public Criteria andOpstepIsNotNull() {
            addCriterion("OPSTEP is not null");
            return (Criteria) this;
        }

        public Criteria andOpstepEqualTo(String value) {
            addCriterion("OPSTEP =", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepNotEqualTo(String value) {
            addCriterion("OPSTEP <>", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepGreaterThan(String value) {
            addCriterion("OPSTEP >", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepGreaterThanOrEqualTo(String value) {
            addCriterion("OPSTEP >=", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepLessThan(String value) {
            addCriterion("OPSTEP <", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepLessThanOrEqualTo(String value) {
            addCriterion("OPSTEP <=", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepLike(String value) {
            addCriterion("OPSTEP like", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepNotLike(String value) {
            addCriterion("OPSTEP not like", value, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepIn(List<String> values) {
            addCriterion("OPSTEP in", values, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepNotIn(List<String> values) {
            addCriterion("OPSTEP not in", values, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepBetween(String value1, String value2) {
            addCriterion("OPSTEP between", value1, value2, "opstep");
            return (Criteria) this;
        }

        public Criteria andOpstepNotBetween(String value1, String value2) {
            addCriterion("OPSTEP not between", value1, value2, "opstep");
            return (Criteria) this;
        }

        public Criteria andTesterIsNull() {
            addCriterion("TESTER is null");
            return (Criteria) this;
        }

        public Criteria andTesterIsNotNull() {
            addCriterion("TESTER is not null");
            return (Criteria) this;
        }

        public Criteria andTesterEqualTo(String value) {
            addCriterion("TESTER =", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotEqualTo(String value) {
            addCriterion("TESTER <>", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThan(String value) {
            addCriterion("TESTER >", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThanOrEqualTo(String value) {
            addCriterion("TESTER >=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThan(String value) {
            addCriterion("TESTER <", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThanOrEqualTo(String value) {
            addCriterion("TESTER <=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLike(String value) {
            addCriterion("TESTER like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotLike(String value) {
            addCriterion("TESTER not like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterIn(List<String> values) {
            addCriterion("TESTER in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotIn(List<String> values) {
            addCriterion("TESTER not in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterBetween(String value1, String value2) {
            addCriterion("TESTER between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotBetween(String value1, String value2) {
            addCriterion("TESTER not between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("RESULT is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("RESULT =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("RESULT <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("RESULT >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("RESULT >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("RESULT <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("RESULT <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("RESULT like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("RESULT not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("RESULT in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("RESULT not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("RESULT between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("RESULT not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andParamnameIsNull() {
            addCriterion("PARAMNAME is null");
            return (Criteria) this;
        }

        public Criteria andParamnameIsNotNull() {
            addCriterion("PARAMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andParamnameEqualTo(String value) {
            addCriterion("PARAMNAME =", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotEqualTo(String value) {
            addCriterion("PARAMNAME <>", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThan(String value) {
            addCriterion("PARAMNAME >", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMNAME >=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThan(String value) {
            addCriterion("PARAMNAME <", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLessThanOrEqualTo(String value) {
            addCriterion("PARAMNAME <=", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameLike(String value) {
            addCriterion("PARAMNAME like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotLike(String value) {
            addCriterion("PARAMNAME not like", value, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameIn(List<String> values) {
            addCriterion("PARAMNAME in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotIn(List<String> values) {
            addCriterion("PARAMNAME not in", values, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameBetween(String value1, String value2) {
            addCriterion("PARAMNAME between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamnameNotBetween(String value1, String value2) {
            addCriterion("PARAMNAME not between", value1, value2, "paramname");
            return (Criteria) this;
        }

        public Criteria andParamvalueIsNull() {
            addCriterion("PARAMVALUE is null");
            return (Criteria) this;
        }

        public Criteria andParamvalueIsNotNull() {
            addCriterion("PARAMVALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParamvalueEqualTo(String value) {
            addCriterion("PARAMVALUE =", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotEqualTo(String value) {
            addCriterion("PARAMVALUE <>", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueGreaterThan(String value) {
            addCriterion("PARAMVALUE >", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMVALUE >=", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueLessThan(String value) {
            addCriterion("PARAMVALUE <", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueLessThanOrEqualTo(String value) {
            addCriterion("PARAMVALUE <=", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueLike(String value) {
            addCriterion("PARAMVALUE like", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotLike(String value) {
            addCriterion("PARAMVALUE not like", value, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueIn(List<String> values) {
            addCriterion("PARAMVALUE in", values, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotIn(List<String> values) {
            addCriterion("PARAMVALUE not in", values, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueBetween(String value1, String value2) {
            addCriterion("PARAMVALUE between", value1, value2, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andParamvalueNotBetween(String value1, String value2) {
            addCriterion("PARAMVALUE not between", value1, value2, "paramvalue");
            return (Criteria) this;
        }

        public Criteria andOutparamIsNull() {
            addCriterion("OUTPARAM is null");
            return (Criteria) this;
        }

        public Criteria andOutparamIsNotNull() {
            addCriterion("OUTPARAM is not null");
            return (Criteria) this;
        }

        public Criteria andOutparamEqualTo(String value) {
            addCriterion("OUTPARAM =", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamNotEqualTo(String value) {
            addCriterion("OUTPARAM <>", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamGreaterThan(String value) {
            addCriterion("OUTPARAM >", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamGreaterThanOrEqualTo(String value) {
            addCriterion("OUTPARAM >=", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamLessThan(String value) {
            addCriterion("OUTPARAM <", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamLessThanOrEqualTo(String value) {
            addCriterion("OUTPARAM <=", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamLike(String value) {
            addCriterion("OUTPARAM like", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamNotLike(String value) {
            addCriterion("OUTPARAM not like", value, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamIn(List<String> values) {
            addCriterion("OUTPARAM in", values, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamNotIn(List<String> values) {
            addCriterion("OUTPARAM not in", values, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamBetween(String value1, String value2) {
            addCriterion("OUTPARAM between", value1, value2, "outparam");
            return (Criteria) this;
        }

        public Criteria andOutparamNotBetween(String value1, String value2) {
            addCriterion("OUTPARAM not between", value1, value2, "outparam");
            return (Criteria) this;
        }

        public Criteria andIsprivateIsNull() {
            addCriterion("ISPRIVATE is null");
            return (Criteria) this;
        }

        public Criteria andIsprivateIsNotNull() {
            addCriterion("ISPRIVATE is not null");
            return (Criteria) this;
        }

        public Criteria andIsprivateEqualTo(String value) {
            addCriterion("ISPRIVATE =", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotEqualTo(String value) {
            addCriterion("ISPRIVATE <>", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThan(String value) {
            addCriterion("ISPRIVATE >", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateGreaterThanOrEqualTo(String value) {
            addCriterion("ISPRIVATE >=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThan(String value) {
            addCriterion("ISPRIVATE <", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLessThanOrEqualTo(String value) {
            addCriterion("ISPRIVATE <=", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateLike(String value) {
            addCriterion("ISPRIVATE like", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotLike(String value) {
            addCriterion("ISPRIVATE not like", value, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateIn(List<String> values) {
            addCriterion("ISPRIVATE in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotIn(List<String> values) {
            addCriterion("ISPRIVATE not in", values, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateBetween(String value1, String value2) {
            addCriterion("ISPRIVATE between", value1, value2, "isprivate");
            return (Criteria) this;
        }

        public Criteria andIsprivateNotBetween(String value1, String value2) {
            addCriterion("ISPRIVATE not between", value1, value2, "isprivate");
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