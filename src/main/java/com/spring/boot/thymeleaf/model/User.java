package com.spring.boot.thymeleaf.model;

/**
 * @author Mohammed Amr
 * @created 31/12/2020 - 21:33
 * @project spring-boot-thymeleaf
 */
public class User {

    public Integer id;
    public String name;
    public Integer age;

    public User(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
