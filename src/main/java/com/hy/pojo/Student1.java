package com.hy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "spring_student")
public class Student1 {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String age;
    private String happy;
    private String zid;
    private String sex;
    private Integer cid;
    private String tx;
/*    private course ci;*/
    public String getZid() {
        return zid;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", happy='" + happy + '\'' +
                ", zid='" + zid + '\'' +
                ", sex='" + sex + '\'' +
                ", cid=" + cid +
                ", tx='" + tx + '\'' +
               /* ", ci=" + ci +*/
                '}';
    }

    public void setZid(String zid) {
        this.zid = zid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }



    public String getTx() {
        return tx;
    }
/*
    public course getCi() {
        return ci;
    }

    public void setCi(course ci) {
        this.ci = ci;
    }*/

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTx(String tx) {
        this.tx = tx;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) { this.name = name; }

    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHappy() {
        return happy;
    }
    public void setHappy(String happy) {
        this.happy = happy;
    }

}
