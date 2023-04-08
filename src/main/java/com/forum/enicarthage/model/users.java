package com.forum.enicarthage.model;

public class users {
    String password;
    String usermail;
    public String getPassword() {
        return password;
    }

    public users(String password,String usermail) {
        this.password=password;
        this.usermail = usermail;
    }

    @Override
    public String toString() {
        return "users{" +
                "usermail='" + usermail + '\'' +
                '}';
    }

    public  users(){
        super();
    }

    public String getUsermail() {
        return usermail;
    }

    public void setUsermail(String usermail) {
        this.usermail = usermail;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
