package com.atguigu.oop;

/**
 * @Author magician
 * @Date 2024/5/2
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tom";
        p1.age = 18;
        p1.gender = '男';

        p1.study();
        p1.addAge(2);
        p1.showAge();

        int age = p1.showAge();
        System.out.println("age = " + age);
    }
}
