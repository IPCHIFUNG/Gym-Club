package com.zifung.gymclub.user;

import android.app.Application;

public class UserInfo extends Application {

    private String user_name;

    private String password;


    public String getUserName() {
        return user_name;
    }

    public void setUserName(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
