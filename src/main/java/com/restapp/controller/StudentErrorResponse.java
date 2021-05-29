package com.restapp.controller;

public class StudentErrorResponse {
    private int status;
    private String message;
    private long time;

    public StudentErrorResponse() {
    }

    public StudentErrorResponse(int status, String mess, long time) {
        this.status = status;
        this.message = mess;
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
