package com.example.aop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.aop.inte.Person;

/**
 * @author Jas
 * @create 2018-05-25 9:02
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-aop-annotation.xml");
        Person p = (Person) context.getBean("personImpl");
        
        p.sayHello();
        p.sayBye(" See You Again");

        // 使用的是jdk动态代理
        System.out.println(p.getClass());
    }
}
