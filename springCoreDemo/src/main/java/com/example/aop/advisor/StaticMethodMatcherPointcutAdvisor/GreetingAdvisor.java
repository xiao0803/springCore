package com.example.aop.advisor.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

/**
 * 
 * 
 * @ClassName: GreetingAdvisor
 * 
 * @Description: ������
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017��8��18�� ����8:27:52
 */
public class GreetingAdvisor extends StaticMethodMatcherPointcutAdvisor {

	private static final long serialVersionUID = 1L;

	/**
	 * ��дmatches����,�е㷽��ƥ����򣺷�����ΪgreetTo
	 */
	@Override
	public boolean matches(Method method, Class<?> targetClass) {

		return "greetTo".equals(method.getName());
	}

	/**
	 * Ĭ������£�ƥ�����е��࣬��дgetClassFilter������ƥ����� �е�����ƥ�����ΪWaiter�������֮��
	 */
	public ClassFilter getClassFilter() {
		return new ClassFilter() {
			@Override
			public boolean matches(Class<?> clazz) {
				return Waiter.class.isAssignableFrom(clazz);
			}
		};
	}
}
