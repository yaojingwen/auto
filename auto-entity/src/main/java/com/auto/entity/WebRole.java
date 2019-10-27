package com.auto.entity;

import java.util.List;

public class WebRole {
    private Integer id;
    private String roleName;
    private String roleDesc;
    //一个角色可以授予多个用户，角色和用户之间属于一对多关系,彼此之间属于多对多关系
    private List<WebAdmin> webAdmins;
    //一个角色可以有多个权限，角色和权限之间属于一对多关系，彼此之间属于多对多关系
    private List<WebPermisson> permissions;

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

    public List<WebPermisson> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<WebPermisson> permissions) {
        this.permissions = permissions;
    }
}