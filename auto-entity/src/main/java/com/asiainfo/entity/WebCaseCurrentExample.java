package com.asiainfo.entity;

import java.util.ArrayList;
import java.util.List;

public class WebCaseCurrentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WebCaseCurrentExample() {
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

        public Criteria andCaseidIsNull() {
            addCriterion("CASEID is null");
            return (Criteria) this;
        }

        public Criteria andCaseidIsNotNull() {
            addCriterion("CASEID is not null");
            return (Criteria) this;
        }

        public Criteria andCaseidEqualTo(Integer value) {
            addCriterion("CASEID =", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotEqualTo(Integer value) {
            addCriterion("CASEID <>", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThan(Integer value) {
            addCriterion("CASEID >", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CASEID >=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThan(Integer value) {
            addCriterion("CASEID <", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidLessThanOrEqualTo(Integer value) {
            addCriterion("CASEID <=", value, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidIn(List<Integer> values) {
            addCriterion("CASEID in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotIn(List<Integer> values) {
            addCriterion("CASEID not in", values, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidBetween(Integer value1, Integer value2) {
            addCriterion("CASEID between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andCaseidNotBetween(Integer value1, Integer value2) {
            addCriterion("CASEID not between", value1, value2, "caseid");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("MODULE is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("MODULE is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("MODULE =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("MODULE <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("MODULE >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("MODULE >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("MODULE <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("MODULE <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("MODULE like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("MODULE not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("MODULE in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("MODULE not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("MODULE between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("MODULE not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNull() {
            addCriterion("MENUNAME is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MENUNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MENUNAME =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MENUNAME <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MENUNAME >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MENUNAME >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MENUNAME <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MENUNAME <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MENUNAME like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MENUNAME not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MENUNAME in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MENUNAME not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MENUNAME between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MENUNAME not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNull() {
            addCriterion("CASENAME is null");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNotNull() {
            addCriterion("CASENAME is not null");
            return (Criteria) this;
        }

        public Criteria andCasenameEqualTo(String value) {
            addCriterion("CASENAME =", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotEqualTo(String value) {
            addCriterion("CASENAME <>", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThan(String value) {
            addCriterion("CASENAME >", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThanOrEqualTo(String value) {
            addCriterion("CASENAME >=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThan(String value) {
            addCriterion("CASENAME <", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThanOrEqualTo(String value) {
            addCriterion("CASENAME <=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLike(String value) {
            addCriterion("CASENAME like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotLike(String value) {
            addCriterion("CASENAME not like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameIn(List<String> values) {
            addCriterion("CASENAME in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotIn(List<String> values) {
            addCriterion("CASENAME not in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameBetween(String value1, String value2) {
            addCriterion("CASENAME between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotBetween(String value1, String value2) {
            addCriterion("CASENAME not between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCaselevelIsNull() {
            addCriterion("CASELEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCaselevelIsNotNull() {
            addCriterion("CASELEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCaselevelEqualTo(String value) {
            addCriterion("CASELEVEL =", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelNotEqualTo(String value) {
            addCriterion("CASELEVEL <>", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelGreaterThan(String value) {
            addCriterion("CASELEVEL >", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelGreaterThanOrEqualTo(String value) {
            addCriterion("CASELEVEL >=", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelLessThan(String value) {
            addCriterion("CASELEVEL <", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelLessThanOrEqualTo(String value) {
            addCriterion("CASELEVEL <=", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelLike(String value) {
            addCriterion("CASELEVEL like", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelNotLike(String value) {
            addCriterion("CASELEVEL not like", value, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelIn(List<String> values) {
            addCriterion("CASELEVEL in", values, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelNotIn(List<String> values) {
            addCriterion("CASELEVEL not in", values, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelBetween(String value1, String value2) {
            addCriterion("CASELEVEL between", value1, value2, "caselevel");
            return (Criteria) this;
        }

        public Criteria andCaselevelNotBetween(String value1, String value2) {
            addCriterion("CASELEVEL not between", value1, value2, "caselevel");
            return (Criteria) this;
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

        public Criteria andCasecodeIsNull() {
            addCriterion("CASECODE is null");
            return (Criteria) this;
        }

        public Criteria andCasecodeIsNotNull() {
            addCriterion("CASECODE is not null");
            return (Criteria) this;
        }

        public Criteria andCasecodeEqualTo(String value) {
            addCriterion("CASECODE =", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotEqualTo(String value) {
            addCriterion("CASECODE <>", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeGreaterThan(String value) {
            addCriterion("CASECODE >", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeGreaterThanOrEqualTo(String value) {
            addCriterion("CASECODE >=", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeLessThan(String value) {
            addCriterion("CASECODE <", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeLessThanOrEqualTo(String value) {
            addCriterion("CASECODE <=", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeLike(String value) {
            addCriterion("CASECODE like", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotLike(String value) {
            addCriterion("CASECODE not like", value, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeIn(List<String> values) {
            addCriterion("CASECODE in", values, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotIn(List<String> values) {
            addCriterion("CASECODE not in", values, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeBetween(String value1, String value2) {
            addCriterion("CASECODE between", value1, value2, "casecode");
            return (Criteria) this;
        }

        public Criteria andCasecodeNotBetween(String value1, String value2) {
            addCriterion("CASECODE not between", value1, value2, "casecode");
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

        public Criteria andCheckstepIsNull() {
            addCriterion("CHECKSTEP is null");
            return (Criteria) this;
        }

        public Criteria andCheckstepIsNotNull() {
            addCriterion("CHECKSTEP is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstepEqualTo(String value) {
            addCriterion("CHECKSTEP =", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepNotEqualTo(String value) {
            addCriterion("CHECKSTEP <>", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepGreaterThan(String value) {
            addCriterion("CHECKSTEP >", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKSTEP >=", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepLessThan(String value) {
            addCriterion("CHECKSTEP <", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepLessThanOrEqualTo(String value) {
            addCriterion("CHECKSTEP <=", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepLike(String value) {
            addCriterion("CHECKSTEP like", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepNotLike(String value) {
            addCriterion("CHECKSTEP not like", value, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepIn(List<String> values) {
            addCriterion("CHECKSTEP in", values, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepNotIn(List<String> values) {
            addCriterion("CHECKSTEP not in", values, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepBetween(String value1, String value2) {
            addCriterion("CHECKSTEP between", value1, value2, "checkstep");
            return (Criteria) this;
        }

        public Criteria andCheckstepNotBetween(String value1, String value2) {
            addCriterion("CHECKSTEP not between", value1, value2, "checkstep");
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

        public Criteria andSavedataIsNull() {
            addCriterion("SAVEDATA is null");
            return (Criteria) this;
        }

        public Criteria andSavedataIsNotNull() {
            addCriterion("SAVEDATA is not null");
            return (Criteria) this;
        }

        public Criteria andSavedataEqualTo(String value) {
            addCriterion("SAVEDATA =", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataNotEqualTo(String value) {
            addCriterion("SAVEDATA <>", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataGreaterThan(String value) {
            addCriterion("SAVEDATA >", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataGreaterThanOrEqualTo(String value) {
            addCriterion("SAVEDATA >=", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataLessThan(String value) {
            addCriterion("SAVEDATA <", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataLessThanOrEqualTo(String value) {
            addCriterion("SAVEDATA <=", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataLike(String value) {
            addCriterion("SAVEDATA like", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataNotLike(String value) {
            addCriterion("SAVEDATA not like", value, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataIn(List<String> values) {
            addCriterion("SAVEDATA in", values, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataNotIn(List<String> values) {
            addCriterion("SAVEDATA not in", values, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataBetween(String value1, String value2) {
            addCriterion("SAVEDATA between", value1, value2, "savedata");
            return (Criteria) this;
        }

        public Criteria andSavedataNotBetween(String value1, String value2) {
            addCriterion("SAVEDATA not between", value1, value2, "savedata");
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

        public Criteria andFeeIsNull() {
            addCriterion("FEE is null");
            return (Criteria) this;
        }

        public Criteria andFeeIsNotNull() {
            addCriterion("FEE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeEqualTo(Long value) {
            addCriterion("FEE =", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotEqualTo(Long value) {
            addCriterion("FEE <>", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThan(Long value) {
            addCriterion("FEE >", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("FEE >=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThan(Long value) {
            addCriterion("FEE <", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeLessThanOrEqualTo(Long value) {
            addCriterion("FEE <=", value, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeIn(List<Long> values) {
            addCriterion("FEE in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotIn(List<Long> values) {
            addCriterion("FEE not in", values, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeBetween(Long value1, Long value2) {
            addCriterion("FEE between", value1, value2, "fee");
            return (Criteria) this;
        }

        public Criteria andFeeNotBetween(Long value1, Long value2) {
            addCriterion("FEE not between", value1, value2, "fee");
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