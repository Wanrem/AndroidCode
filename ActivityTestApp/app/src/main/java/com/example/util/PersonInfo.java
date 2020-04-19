package com.example.util;

import java.io.Serializable;

public class PersonInfo implements Serializable {
    private String name;
    private int age;
    private boolean sex;

    public PersonInfo(String name, int age, boolean sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isSex() {
        return sex;
    }
}
