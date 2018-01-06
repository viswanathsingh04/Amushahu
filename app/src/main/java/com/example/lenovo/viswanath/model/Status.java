package com.example.lenovo.viswanath.model;

import java.util.List;

/**
 * Awesome Pojo Generator
 */
public class Status {
    private String msg;
    private List<Data> data;
    private Integer status;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}