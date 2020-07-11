package com.example.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * 工厂级接口（此接口可用于重写或添加bean的属性值，甚至可以立即初始化Bean）
 * 
 * BeanFactoryPostProcessor可以对bean的定义（配置元数据）进行处理。 也就是说，Spring
 * IoC容器允许BeanFactoryPostProcessor 在容器实际实例化任何其它的bean之前读取配置元数据，并有可能修改它。
 * 如果你愿意，你可以配置多个BeanFactoryPostProcessor。
 * 你还能通过设置'order'属性来控制BeanFactoryPostProcessor的执行次序。
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	public MyBeanFactoryPostProcessor() {
		super();
		System.out.println("【工厂级接口】【BeanFactoryPostProcessor实现类】【构造器】");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory arg0) throws BeansException {
		System.out.println("【工厂级接口】【BeanFactoryPostProcessor实现类】Spring容器加载之后，所有Bean实例化之前调用");
		// 重写Person Bean的phone属性
		BeanDefinition bd = arg0.getBeanDefinition("person");
		bd.getPropertyValues().addPropertyValue("phone", "110");
	}
}
