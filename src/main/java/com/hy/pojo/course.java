package com.hy.pojo;

public class course {
    private int cid;
    private String cname;

    public int getCid() {
        return cid;
    }

    @Override
    public String toString() {
        return "course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';


    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
