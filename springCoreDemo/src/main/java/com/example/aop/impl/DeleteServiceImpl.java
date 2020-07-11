package com.example.aop.impl;

import org.springframework.stereotype.Component;

import com.example.aop.inte.DeleteService;

@Component("deleteService")
public class DeleteServiceImpl implements DeleteService {

    @Override
    public void deleteProduct(String name) {
        System.out.println("【DeleteService.deleteProduct】删除商品：" + name);
    }

    @Override
    public boolean deleteUser(String name) {
        System.out.println("【DeleteService.deleteUser】删除用户：" + name);
        return true;
    }
}

