package com.auto.param;
import com.auto.entity.WebPermission;
public class WebRoleParam {

    private Integer id;

    private String roleName;

    private String roleDesc;

    private WebPermission permissions;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRolenName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public WebPermission getPermissions() {
        return permissions;
    }

    public void setPermissions(WebPermission permissions) {
        this.permissions = permissions;
    }

}
