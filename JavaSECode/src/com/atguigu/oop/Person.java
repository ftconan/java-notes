package com.atguigu.oop;

/**
 * @Author magician
 * @Date 2024/5/2
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public void study() {
        System.out.println("studying");
    }

    public int showAge() {
        return age;
    }

    public void addAge(int addAge) {
        age += addAge;
    }
}
