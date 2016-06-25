package com.dssp.letschat.model;

/**
 * Created by dhanrajnaik522 on 6/25/2016.
 */
public class MessageModel {
    private String msg = "";
    private int userType;

    public MessageModel(String msg, int userType) {
        this.msg = msg;
        this.userType = userType;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
