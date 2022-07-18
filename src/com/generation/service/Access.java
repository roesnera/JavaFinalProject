package com.generation.service;

public class Access {
    protected String username;

    protected int password;
    public Access() {
        super();
    }
    public Access(String username, int password) {

        super();
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }


    public int getPassword() {

        return password;

    }

}


