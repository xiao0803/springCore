package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.aop.inte.AService;
import com.example.ioc.Person;

public class DemoSpringAopMain {

	private static final String PATH_XML = "/springAop/applicationContext-aop.xml";

	public static void main(String[] args) {
		System.out.println("============================== 现在开始初始化容器. ==============================");

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(PATH_XML);
		System.out.println("\r\n============================== 容器初始化成功. ==============================");
		AService aService = factory.getBean("aServiceImplProxy", AService.class);
		aService.barA();
		System.out.println("\r\n============================== 现在开始关闭容器! ==============================");
		factory.close();
	}

}
