package com.example.demo;

import com.example.demo.entity.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test1 {
    public static void main(String args[]) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicatinContext.xml");
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/main/resources/beans-factory.xml");
//        HelloWord helloWord = (HelloWord) applicationContext.getBean("helloWord");
//        helloWord.sayHellow();

       /* Car car = (Car) applicationContext.getBean("car2");
        System.out.println(car.toString());*/


      /*  Person person = (Person) applicationContext.getBean("person");
        System.out.println(person.toString());*/


        Car car = (Car) applicationContext.getBean("carF1");
        System.out.println(car.toString());
    }


}
