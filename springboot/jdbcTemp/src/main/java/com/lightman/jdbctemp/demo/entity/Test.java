package com.lightman.jdbctemp.demo.entity;

import java.io.Serializable;

public class Test implements Serializable {
    private String name;

    private String value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}