package com.example.aop.advisor.StaticMethodMatcherPointcutAdvisor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * 
 * @ClassName: StaticMethodMatcherPointcutAdvisorTest
 * 
 * @Description: ������
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017��8��18�� ����8:29:28
 */
public class StaticMethodMatcherPointcutAdvisorTest {

	@Test
	public void test() {
		// ���������ļ�,��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:com/xgj/aop/spring/advisor/StaticMethodMatcherPointcutAdvisor/conf-advisor.xml");
		// �������л�ȡBean
		Waiter waiter = ctx.getBean("waiter", Waiter.class);
		Seller seller = ctx.getBean("seller", Seller.class);
		// ����ҵ�񷽷�
		waiter.greetTo("XiaoGongJiang");
		waiter.serverTo("XiaoGongJiang");
		seller.greetTo("XiaoGongJiang");
	}
}
