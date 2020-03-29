package com.github.demo.models;

public class User {
    private String name;
    private Integer age;
    private Long times = null;

    public User(String name, int age, long times) {
        this.name = name;
        this.age = age;
        this.times = times;
    }

    public long getTimes() { return (times == null) ? 1 : times;  }

    public void setTimes(long times) { this.times = times; }

    public int getAge() { return (age == null) ? 0:age;  }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", times=" + times +
                '}';
    }
}


