package com.kaiyuan.dfb.mobilecenter.model;

import java.io.Serializable;

/**
 * <p>Copyright© 2013-2016 AutoChina International Ltd. All rights reserved.</p>
 *
 * @Author liuxue@che001.com
 * @Date 2016/9/8
 */
public class Credentials implements Serializable {
    private String username;
    private String password;
    private String email;
    private String phoneNo;
    private String loginId;
    private boolean employeeLogin;
    private String employeeSSOToken;

    public Credentials() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public boolean isEmployeeLogin() {
        return employeeLogin;
    }

    public void setEmployeeLogin(boolean employeeLogin) {
        this.employeeLogin = employeeLogin;
    }

    public String getEmployeeSSOToken() {
        return employeeSSOToken;
    }

    public void setEmployeeSSOToken(String employeeSSOToken) {
        this.employeeSSOToken = employeeSSOToken;
    }

    public String toString() {
        String pString = null;
        if (this.password == null) {
            pString = null;
        } else if (this.password.length() == 0) {
            pString = "empty";
        } else {
            pString = "yes";
        }

        return "{ u:" + this.username + " i:" + this.loginId + " p:" + this.phoneNo + " e:" + this.email + " p:" + pString + " }";
    }
}
