package com.azvk.nationalhockeyteams.models;


public class User {

    private String username;
    private String password;

    public User() {

    }

    public User(String password, String username) {
        this.password = password;
        this.username = username;
    }
}
