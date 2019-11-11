package com.auto.param;

import com.auto.entity.WebPermission;
import com.auto.param.WebRoleParam;

public class WebAdminParam {
    private Integer operatorId;

    private String userAdmin;

    private String userPass;

    private String userName;

    private String userMobile;

    private String userStaff;

    private String userEmail;

    private String isUsed;

    private String ip;

    private WebRoleParam roles;

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public String getUserAdmin() {
        return userAdmin;
    }

    public void setUserAdmin(String userAdmin) {
        this.userAdmin = userAdmin;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserStaff() {
        return userStaff;
    }

    public void setUserStaff(String userStaff) {
        this.userStaff = userStaff;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public WebRoleParam getRoles() {
        return roles;
    }

    public void setRoles(WebRoleParam roles) {
        this.roles = roles;
    }
}
