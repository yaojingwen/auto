package com.asiainfo.entity;

public class WebCaseHis {
    private Integer caseid;

    private String module;

    private String menuname;

    private String casename;

    private String caselevel;

    private String menucode;

    private String casecode;

    private String pageelement;

    private String opstep;

    private String checkstep;

    private String tester;

    private String result;

    private String savedata;

    private String remark;

    private Long fee;

    private String paramname;

    private String paramvalue;

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module == null ? null : module.trim();
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }

    public String getCasename() {
        return casename;
    }

    public void setCasename(String casename) {
        this.casename = casename == null ? null : casename.trim();
    }

    public String getCaselevel() {
        return caselevel;
    }

    public void setCaselevel(String caselevel) {
        this.caselevel = caselevel == null ? null : caselevel.trim();
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode == null ? null : menucode.trim();
    }

    public String getCasecode() {
        return casecode;
    }

    public void setCasecode(String casecode) {
        this.casecode = casecode == null ? null : casecode.trim();
    }

    public String getPageelement() {
        return pageelement;
    }

    public void setPageelement(String pageelement) {
        this.pageelement = pageelement == null ? null : pageelement.trim();
    }

    public String getOpstep() {
        return opstep;
    }

    public void setOpstep(String opstep) {
        this.opstep = opstep == null ? null : opstep.trim();
    }

    public String getCheckstep() {
        return checkstep;
    }

    public void setCheckstep(String checkstep) {
        this.checkstep = checkstep == null ? null : checkstep.trim();
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester == null ? null : tester.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getSavedata() {
        return savedata;
    }

    public void setSavedata(String savedata) {
        this.savedata = savedata == null ? null : savedata.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public String getParamname() {
        return paramname;
    }

    public void setParamname(String paramname) {
        this.paramname = paramname == null ? null : paramname.trim();
    }

    public String getParamvalue() {
        return paramvalue;
    }

    public void setParamvalue(String paramvalue) {
        this.paramvalue = paramvalue == null ? null : paramvalue.trim();
    }
}