package com.example.aop.impl;

import com.example.aop.inte.AService;

public class AServiceImpl implements AService{
    @Override
    public void barA() {
         System.out.println("AServiceImpl.barA()");  
         //this.barB();
    }
    @Override
    public void barB() {
        System.out.println("AServiceImpl.barB()");  
    }
}
