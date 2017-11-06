package com.example.demo;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public Student student(){
        Student student=new Student();
        student.setName("张三@Bean");
        student.setTeacher(teacher());
        return student;
    }

    @Bean
    public Teacher teacher(){
        Teacher teacher=new Teacher();
        teacher.setName("李四@Bean");
        return teacher;
    }

}