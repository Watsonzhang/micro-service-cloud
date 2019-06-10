package com.yunhe.cloud.entities;

public class Consumer {
    private String name;
    private Integer age;

    public Consumer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Consumer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
