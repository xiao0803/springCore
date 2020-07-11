package com.example.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 
 * Bean自身方法 * Bean本身调用的方法 * init-method * destroy-method
 * 
 * Bean级生命周期接口: * BeanNameAware : 在实例化Bean时，为Bean注入beanName *
 * ApplicationContextAware : 在实例化Bean时，为Bean注入ApplicationContext *
 * InitializingBean : 在实例化Bean之前，进行初始化操作 * DisposableBean ： 在销毁Bean之前，进行析构操作
 * 
 * @author Administrator
 *
 */
public class Person implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

	private String name;
	private String address;
	private int phone;

	private ApplicationContext applicationContext;
	private String beanName;

	public Person() {
		System.out.println("【Person】【构造器】");
	}

	/*********************************** Bean自身方法begin. ************************************/

	// 通过<bean>的init-method属性指定的初始化方法
	public void myInit() {
		System.out.println("【Bean自身方法】【init-method】初始化方法...");
	}

	// 通过<bean>的destroy-method属性指定的初始化方法
	public void myDestory() {
		System.out.println("【Bean自身方法】【destroy-method】销毁方法...");
	}

	public void sayHello() {
		System.out.println("【Bean自身方法】sayHello...");
	}

	/*********************************** Bean级生命接口方法begin. ************************************/

	public void setName(String name) {
		this.name = name;
		System.out.println("【Bean级接口】【注入属性】注入属性name...");
	}

	public void setAddress(String address) {
		this.address = address;
		System.out.println("【Bean级接口】【注入属性】注入属性address...");
	}

	public void setPhone(int phone) {
		this.phone = phone;
		System.out.println("【Bean级接口】【注入属性】注入属性phone...");
	}

	// 这是BeanFactoryAware接口方法
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("【Bean级接口】【ApplicationContextAware接口】注入Spring容器ApplicationContext...");
	}

	// 这是BeanNameAware接口方法
	@Override
	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println("【Bean级接口】【BeanNameAware接口】注入beanName...");
	}

	// 这是InitializingBean接口方法
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("【Bean级接口】【InitializingBean接口】初始化方法...");
	}

	// 这是DiposibleBean接口方法
	@Override
	public void destroy() throws Exception {
		System.out.println("【DiposibleBean接口】销毁方法...");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", phone=" + phone + ", applicationContext=" + applicationContext + ", beanName=" + beanName + "]";
	}

}