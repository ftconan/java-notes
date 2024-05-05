package com.atguigu.oop;

import java.util.Objects;

/**
 * @Author magician
 * @Date 2024/5/2
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
//    private int age;
    char gender;

    public Person() {
        System.out.println("Person()");
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Person(String name, int age, char gender)");
    }

    public void study() {
        System.out.println("studying");
    }

//    public int showAge() {
//        return age;
//    }

//    public void addAge(int addAge) {
//        age += addAge;
//    }

    public void setAge(int age) {
        if (age > 0 && age < 200) {
            this.age = age;
        } else {
            System.out.println("年龄不合法");
        }
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age;
        }
        return false;
    }

    // 重写toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
