package com.utry.entity;

import java.util.Date;

/**
 * Created by w1277006781 on 2018/7/22.
 */
public class StudentEntity {
    private String id;
    private String name;
    private Date bir;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBir() {
        return bir;
    }

    public void setBir(Date bir) {
        this.bir = bir;
    }
}
