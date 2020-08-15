package com.hy.utils;

import java.util.List;

public class SchoolUtils {
    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "SchoolUtils{" +
                "children=" + children +
                ", title='" + title + '\'' +
                ", id=" + id +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private List children;
    private String title;
    private  Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
