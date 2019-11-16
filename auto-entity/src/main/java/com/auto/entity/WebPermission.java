package com.auto.entity;

import java.util.List;

public class WebPermission {
    private Integer id;

    private String permissionName;

    private String url;

    private Integer pid;

    //角色与权限属于一对多
    private List<WebRole> webRoles;

    public List<WebRole> getWebRoles() {
        return webRoles;
    }

    public void setWebRoles(List<WebRole> webRoles) {
        this.webRoles = webRoles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }
}