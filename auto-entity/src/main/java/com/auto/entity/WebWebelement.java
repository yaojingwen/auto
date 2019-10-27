package com.auto.entity;

public class WebWebelement {
    private String menucode;

    private String pageelement;

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode == null ? null : menucode.trim();
    }

    public String getPageelement() {
        return pageelement;
    }

    public void setPageelement(String pageelement) {
        this.pageelement = pageelement == null ? null : pageelement.trim();
    }
}