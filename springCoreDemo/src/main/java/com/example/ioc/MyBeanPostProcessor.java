package com.example.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 容器级生命周期接口: 此接口的方法可以对Bean的属性进行更改
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	public MyBeanPostProcessor() {
		System.out.println("【容器级接口】【MyBeanPostProcessor实现类】【构造器】");
	}

	// 初始化Bean之前调用
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【容器级接口】【BeanPostProcessor实现类】初始化Bean之前调用");
		return bean;
	}

	// 初始化Bean之后调用
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【容器级接口】【BeanPostProcessor实现类】初始化Bean之后调用");
		return bean;
	}
}
