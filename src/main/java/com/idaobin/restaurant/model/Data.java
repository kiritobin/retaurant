package com.idaobin.restaurant.model;

import java.util.ArrayList;
import java.util.List;

public class Data<T> {
    private int code=0;
    private int size=0; //查询条数或增删改影响行数
    private String msg;
    private List<T> data = new ArrayList();

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
