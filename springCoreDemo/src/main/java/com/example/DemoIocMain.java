package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.ioc.Person;

public class DemoIocMain {

	private static final String PATH_XML = "/applicationContext-ioc.xml";

	public static void main(String[] args) {

		System.out.println("============================== 现在开始初始化容器. ==============================");

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext(PATH_XML);
		System.out.println("\r\n============================== 容器初始化成功. ==============================");
		// 得到Preson，并使用
		Person person = factory.getBean("person", Person.class);
		person.sayHello();
		System.out.println(person);

		System.out.println("\r\n============================== 现在开始关闭容器! ==============================");
		factory.close();
	}

}
