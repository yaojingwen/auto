package com.auto.entity;

import java.util.List;

public class WebAdmin {
    private Integer operatorId;

    private String userAdmin;

    private String userPass;

    private String userName;

    private String userMobile;

    private String userStaff;

    private String userEmail;

    private String isUsed;

    private String ip;

    //用户与角色属于一对多
    private List<WebRole> webRoles;

    public List<WebRole> getWebRoles() {
        return webRoles;
    }

    public void setWebRoles(List<WebRole> webRoles) {
        this.webRoles = webRoles;
    }

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
        this.userAdmin = userAdmin == null ? null : userAdmin.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserStaff() {
        return userStaff;
    }

    public void setUserStaff(String userStaff) {
        this.userStaff = userStaff == null ? null : userStaff.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(String isUsed) {
        this.isUsed = isUsed == null ? null : isUsed.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
}