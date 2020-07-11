package com.example.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.aop.inte.Person;

/**
 * @author Jas
 * @create 2018-05-25 10:24
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-aop-xml.xml");
        Person p = (Person) context.getBean("personImpl");
        
        p.sayHello();
        p.sayBye(" See You Again");
    }
}
