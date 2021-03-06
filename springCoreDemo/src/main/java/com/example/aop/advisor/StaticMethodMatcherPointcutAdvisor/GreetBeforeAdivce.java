package com.example.aop.advisor.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * 
 * 
 * @ClassName: GreetBeforeAdivce
 * 
 * @Description: ǰ����ǿ
 * 
 * @author: Mr.Yang
 * 
 * @date: 2017��8��18�� ����8:27:40
 */
public class GreetBeforeAdivce implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// ����е�
		System.out.println("Pointcut:" + target.getClass().getName() + "."
				+ method.getName());
		String clientName = (String) args[0];
		System.out.println("How are you " + clientName + " ?");
	}
}
