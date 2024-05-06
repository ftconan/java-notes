package com.atguigu.exception;

import com.atguigu.oop.Student;

/**
 * @Author magician
 * @Date 2024/5/6
 * @Version 1.0
 */
public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println("程序开始运行");
        Student student = new Student();
        student.setAge(18);
        try {
            student.setAge(18/0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally代码块");
        }
        student.setSchool("清华大学");
        student.sleep();
        student.eat();
        student.study();
        System.out.println("程序结束运行");
    }
}
