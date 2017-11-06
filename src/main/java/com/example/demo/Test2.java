package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test2 {
    public static void main(String args[]) {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/applicatinContext.xml");

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeansConfiguration.class);
        Student student= (Student) context.getBean("student");
        Teacher teacher= (Teacher) context.getBean("teacher");
        System.out.println("学生的姓名："+student.getName()+"。老师是"+student.getTeacher().getName());
        System.out.println("老师的姓名："+teacher.getName());

    }
}
