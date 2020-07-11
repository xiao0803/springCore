package com.example.aop.impl;

import org.springframework.stereotype.Component;

import com.example.aop.inte.TxService;

/**
 * 测试Around增强, 为当前加法运算添加事物
 */
@Component
public class TxServiceImpl implements TxService {

    @Override
    public int add(int arg1, int arg2) {
        int result = arg1 + arg2;
        System.out.println("【TxService.add】加法运算结果应该是：" + result);
        return result;
    }

}
