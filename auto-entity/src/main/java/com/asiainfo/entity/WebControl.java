package com.asiainfo.entity;

public class WebControl {
    private Integer controlid;

    private String currentdir;

    private Short stop;

    private String startdate;

    private String enddate;

    private String remarks;

    private Short finish;

    public Integer getControlid() {
        return controlid;
    }

    public void setControlid(Integer controlid) {
        this.controlid = controlid;
    }

    public String getCurrentdir() {
        return currentdir;
    }

    public void setCurrentdir(String currentdir) {
        this.currentdir = currentdir == null ? null : currentdir.trim();
    }

    public Short getStop() {
        return stop;
    }

    public void setStop(Short stop) {
        this.stop = stop;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate == null ? null : startdate.trim();
    }

    public String getEnddate() {
        return enddate;
    }

    public void setEnddate(String enddate) {
        this.enddate = enddate == null ? null : enddate.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Short getFinish() {
        return finish;
    }

    public void setFinish(Short finish) {
        this.finish = finish;
    }
}