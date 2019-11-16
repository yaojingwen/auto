package com.auto.entity;

import java.util.List;

public class WebRole {
    private Integer id;

    private String roleName;

    private String roleDesc;
    //角色与用户之间属于一对多
    private List<WebAdmin> webAdmins;
    //角色与权限之间属于一对多
    private List<WebPermission> webPermissions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public List<WebAdmin> getWebAdmins() {
        return webAdmins;
    }

    public void setWebAdmins(List<WebAdmin> webAdmins) {
        this.webAdmins = webAdmins;
    }

    public List<WebPermission> getWebPermissions() {
        return webPermissions;
    }

    public void setWebPermissions(List<WebPermission> webPermissions) {
        this.webPermissions = webPermissions;
    }
}