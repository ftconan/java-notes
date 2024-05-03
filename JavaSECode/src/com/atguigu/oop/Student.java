package com.atguigu.oop;

/**
 * @Author magician
 * @Date 2024/5/3
 * @Version 1.0
 */
public class Student extends Person {
    private String school;

    public Student() {
        super();
        System.out.println("我是学生");
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃饭");
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void show() {
        super.eat();
    }
}
