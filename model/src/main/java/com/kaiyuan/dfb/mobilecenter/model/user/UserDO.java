package com.kaiyuan.dfb.mobilecenter.model.user;

import com.fasterxml.jackson.annotation.*;
import com.kaiyuan.dfb.mobilecenter.base.EntityDO;

import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * @author yangzhibin@che001.com
 * @date 2016/7/14
 */
public class UserDO extends EntityDO {

    private static final long serialVersionUID = 2L;
    private UserIdenty userIdenty;
    //用户的附属信息id
    private String profileId;
    private String username;
    private String loginId;
    private Type type;
    private String primaryEmail;
    private String primaryPhone;
    private String password;
    private String avatar;
    private Set<String> roles;
    private Boolean emailVerified;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date previousLoginTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date lastLoginTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date previousTokenRefreshTime;
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    private Date lastTokenRefreshTime;
    private Status status;
    private String oldUser;
    private String loginUpdate;
    private Map<String, String> shopProfile;
    @JsonIgnore
    private Integer failedLogins = Integer.valueOf(0);
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    @JsonIgnore
    protected Date lockedTime;
    private String ssoId;
    private String newStore;
    private String sendToBackend;

    @Override
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    public Date getCreateTime() {
        return super.getCreateTime();
    }

    @Override
    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'",
            timezone = "UTC"
    )
    public Date getUpdateTime() {
        return super.getUpdateTime();
    }

    public static enum UserIdenty {
        KYPAYSTAFF,
        NORMALSTAFF;

        private UserIdenty() {
        }

        @JsonValue
        public String toJson() {
            return this.name().toLowerCase();
        }

        @JsonCreator
        public static UserIdenty fromJson(String text) {
            return valueOf(text.toUpperCase());
        }
    }

    public static enum Type {
        REGULAR,
        COMPANY;

        private Type() {
        }

        @JsonValue
        public String toJson() {
            return this.name().toLowerCase();
        }

        @JsonCreator
        public static Type fromJson(String text) {
            return valueOf(text.toUpperCase());
        }
    }

    public static enum Status {
        PENDING_CONFIRM,
        PENDING_SUBMIT,
        PENDING_APPROVAL,
        REJECTED,
        ACTIVE,
        DISABLED,
        SERVICE_LOCKED,
        SERVICE_UNLOCKED,
        FORBIDDEN;

        private Status() {
        }

        @JsonValue
        public String toJson() {
            return this.name().toLowerCase();
        }

        @JsonCreator
        public static Status fromJson(String text) {
            return valueOf(text.toUpperCase());
        }
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public UserIdenty getUserIdenty() {
        return userIdenty;
    }

    public void setUserIdenty(UserIdenty userIdenty) {
        this.userIdenty = userIdenty;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPrimaryEmail() {
        return primaryEmail;
    }

    public void setPrimaryEmail(String primaryEmail) {
        this.primaryEmail = primaryEmail;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public Date getPreviousLoginTime() {
        return previousLoginTime;
    }

    public void setPreviousLoginTime(Date previousLoginTime) {
        this.previousLoginTime = previousLoginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getPreviousTokenRefreshTime() {
        return previousTokenRefreshTime;
    }

    public void setPreviousTokenRefreshTime(Date previousTokenRefreshTime) {
        this.previousTokenRefreshTime = previousTokenRefreshTime;
    }

    public Date getLastTokenRefreshTime() {
        return lastTokenRefreshTime;
    }

    public void setLastTokenRefreshTime(Date lastTokenRefreshTime) {
        this.lastTokenRefreshTime = lastTokenRefreshTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getOldUser() {
        return oldUser;
    }

    public void setOldUser(String oldUser) {
        this.oldUser = oldUser;
    }

    public String getLoginUpdate() {
        return loginUpdate;
    }

    public void setLoginUpdate(String loginUpdate) {
        this.loginUpdate = loginUpdate;
    }

    public Map<String, String> getShopProfile() {
        return shopProfile;
    }

    public void setShopProfile(Map<String, String> shopProfile) {
        this.shopProfile = shopProfile;
    }

    public Integer getFailedLogins() {
        return failedLogins;
    }

    public void setFailedLogins(Integer failedLogins) {
        this.failedLogins = failedLogins;
    }

    public Date getLockedTime() {
        return lockedTime;
    }

    public void setLockedTime(Date lockedTime) {
        this.lockedTime = lockedTime;
    }

    public String getSsoId() {
        return ssoId;
    }

    public void setSsoId(String ssoId) {
        this.ssoId = ssoId;
    }

    public String getNewStore() {
        return newStore;
    }

    public void setNewStore(String newStore) {
        this.newStore = newStore;
    }

    public String getSendToBackend() {
        return sendToBackend;
    }

    public void setSendToBackend(String sendToBackend) {
        this.sendToBackend = sendToBackend;
    }
}
