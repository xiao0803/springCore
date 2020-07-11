package com.example.aop.advisor.StaticMethodMatcherPointcutAdvisor;

public class Seller {
	/**
	 * 
	 * 
	 * @Title: greetTo
	 * 
	 * @Description: ��Waiter���е�ͬ���ķ���,Ŀ����Ϊ����֤����֯����Waiter���е�greetTo����
	 * 
	 * @param name
	 * 
	 * @return: void
	 */
	public void greetTo(String name) {
		System.out.println("Seller Greet to " + name);
	}
}
