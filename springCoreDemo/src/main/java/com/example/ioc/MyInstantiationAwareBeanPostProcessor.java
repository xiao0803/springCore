package com.example.ioc;

import java.beans.PropertyDescriptor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

/**
 * 容器级生命周期接口: InstantiationAwareBeanPostProcessor 接口本质是BeanPostProcessor的子接口，
 * 一般我们继承Spring为其提供的适配器类,InstantiationAwareBeanPostProcessorAdapter来使用它，
 * 此接口可以在Bean实例化前、Bean实例化后分别进行操作,也可以对Bean实例化之后进行属性操作
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter {

	public MyInstantiationAwareBeanPostProcessor() {
		super();
		System.out.println("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】【构造器】");
	}

	// 实例化Bean之前调用
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		System.out.println("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】实例化Bean之前调用");
		return null;
	}

	// 实例化Bean之后调用
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		System.out.println("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】实例化Bean之后调用");
		return true;
	}

	// 初始化Bean之前调用
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】初始化Bean之前调用");
		return bean;
	}

	// 初始化Bean之后调用
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】初始化Bean之后调用");
		return bean;
	}

	// 设置某个属性时调用
	@Override
	public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName) throws BeansException {
		System.out.println("【容器级接口】【InstantiationAwareBeanPostProcessor实现类】实例化Bean之后，设置某个属性时调用");
		return pvs;
	}
}
