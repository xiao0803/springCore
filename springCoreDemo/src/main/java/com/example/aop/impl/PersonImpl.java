package com.example.aop.impl;

import org.springframework.stereotype.Component;

import com.example.aop.inte.Person;

/**
 * @author Jas
 * @create 2018-05-25 9:01
 **/
@Component
public class PersonImpl implements  Person{
    @Override
    public void sayHello() {
        System.out.println("Hello AOP");
    }

    @Override
    public void sayBye(String info) {
        System.out.println("Bye AOP" + info);
    }
}
