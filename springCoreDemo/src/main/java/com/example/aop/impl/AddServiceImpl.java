package com.example.aop.impl;

import org.springframework.stereotype.Component;

import com.example.aop.inte.AddService;

@Component("addService")
public class AddServiceImpl implements AddService {
    
    @Override
    public boolean addUser(String name , String pass){
        System.out.println("【AddService.addUser】添加用户：" + name);
        return true;
    }
    
    @Override
    public void addProduct(String name) {
        System.out.println("【AddService.addProduct】添加商品：" + name);
    }

    @Override
    public void addException() {
        throw new NullPointerException();
    }
}
