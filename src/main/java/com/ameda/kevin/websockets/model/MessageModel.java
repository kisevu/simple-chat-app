package com.ameda.kevin.websockets.model;/*
*
@author ameda
@project websockets
@
*
*/

public class MessageModel {
    private String message;
    private String fromLogin;

    public String getFromLogin() {
        return fromLogin;
    }

    public void setFromLogin(String fromLogin) {
        this.fromLogin = fromLogin;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "message='" + message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
