package com.example.aop.advisor.RegexpMethodPointcutAdvisor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 
 * @Description: 走的是CGLIB方式创建的代理类
 * 
 * @author: 
 */
public class RegexpMethodPointcutAdvisorTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:com/example/aop/advisor/RegexpMethodPointcutAdvisor/conf-advisor.xml");
		// �������л�ȡBean
		Waiter waiter = ctx.getBean("waiter", Waiter.class);
		Seller seller = ctx.getBean("seller", Seller.class);
		// ����ҵ�񷽷�
		waiter.greetTo("XiaoGongJiang");
		//waiter.serverTo("XiaoGongJiang");
		//seller.greetTo("XiaoGongJiang");
	}
	
	/*@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:com/example/aop/advisor/RegexpMethodPointcutAdvisor/conf-advisor.xml");
		// �������л�ȡBean
		Waiter waiter = ctx.getBean("waiter", Waiter.class);
		Seller seller = ctx.getBean("seller", Seller.class);
		// ����ҵ�񷽷�
		waiter.greetTo("XiaoGongJiang");
		waiter.serverTo("XiaoGongJiang");
		seller.greetTo("XiaoGongJiang");
	}*/
}
