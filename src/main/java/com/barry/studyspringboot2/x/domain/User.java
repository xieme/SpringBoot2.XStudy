package com.barry.studyspringboot2.x.domain;

/**
 * @Desc
 * @Authoe xm
 * @CreateTime 2018/11/28 14:24
 **/
public class User {
    private int id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
