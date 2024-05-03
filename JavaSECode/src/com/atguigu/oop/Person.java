package com.atguigu.oop;

/**
 * @Author magician
 * @Date 2024/5/2
 * @Version 1.0
 */
public class Person {
    String name;
    //    int age;
    private int age;
    char gender;

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
}
