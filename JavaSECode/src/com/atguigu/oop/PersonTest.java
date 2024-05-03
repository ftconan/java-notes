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
//        p1.age = 18;
        p1.gender = '男';
        p1.setAge(18);
        System.out.println("p1.name = " + p1.name);
        System.out.println("p1.age = " + p1.getAge());

        p1.eat();
//        p1.addAge(2);
//        p1.showAge();

//        int age = p1.showAge();
//        System.out.println("age = " + age);

        Student s = new Student();
        s.name = "Tom";
        s.eat();
        s.study();
        s.sleep();
    }
}
