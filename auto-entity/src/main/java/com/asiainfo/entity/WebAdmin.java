package com.asiainfo.entity;

import java.math.BigDecimal;

public class WebAdmin {


    private BigDecimal operatorId;

    private String userAdmin;

    private String userPass;

    private String userName;

    private String userMobile;

    private String userStaff;

    private String userEmail;

    private String isUsed;

    private String ip;

    private BigDecimal roleid;

    @Override
    public String toString() {
        return "WebAdmin{" +
                "operatorId=" + operatorId +
                ", userAdmin='" + userAdmin + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userName='" + userName + '\'' +
                ", userMobile='" + userMobile + '\'' +
                ", userStaff='" + userStaff + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", isUsed='" + isUsed + '\'' +
                ", ip='" + ip + '\'' +
                ", roleid=" + roleid +
                '}';
    }

    public BigDecimal getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(BigDecimal operatorId) {
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

    public BigDecimal getRoleid() {
        return roleid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }
}