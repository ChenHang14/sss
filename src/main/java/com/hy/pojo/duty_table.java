package com.hy.pojo;

public class duty_table {
    public int getZid() {
        return zid;
    }

    public void setZid(int zid) {
        this.zid = zid;
    }

    @Override
    public String toString() {
        return "duty_table{" +
                "zid=" + zid +
                ", zname='" + zname + '\'' +
                '}';
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    private int zid;
    private  String zname;
}
