package com.hy.utils;

import com.hy.pojo.Student1;

public class LayuiUtils3 {


    private  String code;
    private  String msg;
    private Student1 data;

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "LayuiUtils3{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Student1 getData() {
        return data;
    }

    public void setData(Student1 data) {
        this.data = data;
    }
}
