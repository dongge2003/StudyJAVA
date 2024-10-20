package com.Project.StudentSystem;

import java.util.ArrayList;

public class User {
    String user;
    String key;

    // 无参构造函数
    public User() {}

    // 带参数的构造函数
    public User(String user, String key) {
        this.user = user;
        this.key = key;
    }

    // Getter 和 Setter 方法
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void usermenu(){
        System.out.println("****************************");
        System.out.println("***1.登录  2.注册  3.退出***");
        System.out.println("****************************");

    }


    //用户注册
    public void userseenroll(String user , String key){


    }

    //用户登录
    public void userlogin(){

    }

}
