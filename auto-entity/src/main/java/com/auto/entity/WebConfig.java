package com.auto.entity;

public class WebConfig {
    private Integer id;

    private String paratype;

    private String paracode;

    private String para1;

    private String para2;

    private String para3;

    private String para4;

    private String remark;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParatype() {
        return paratype;
    }

    public void setParatype(String paratype) {
        this.paratype = paratype == null ? null : paratype.trim();
    }

    public String getParacode() {
        return paracode;
    }

    public void setParacode(String paracode) {
        this.paracode = paracode == null ? null : paracode.trim();
    }

    public String getPara1() {
        return para1;
    }

    public void setPara1(String para1) {
        this.para1 = para1 == null ? null : para1.trim();
    }

    public String getPara2() {
        return para2;
    }

    public void setPara2(String para2) {
        this.para2 = para2 == null ? null : para2.trim();
    }

    public String getPara3() {
        return para3;
    }

    public void setPara3(String para3) {
        this.para3 = para3 == null ? null : para3.trim();
    }

    public String getPara4() {
        return para4;
    }

    public void setPara4(String para4) {
        this.para4 = para4 == null ? null : para4.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}