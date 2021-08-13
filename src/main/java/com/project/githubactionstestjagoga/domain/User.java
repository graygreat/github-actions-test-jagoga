package com.project.githubactionstestjagoga.domain;

public class User {

    private Long userId;
    private String userName;
    private String phoneNumber;

    public User(Long userId, String userName, String phoneNumber) {
        this.userId = userId;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
