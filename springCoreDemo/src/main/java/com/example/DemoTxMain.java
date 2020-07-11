package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.tx.inte.NewsDao;

public class DemoTxMain {

    public static void main(String[] arg) {
    	/**
    	 * Spring事务的配置方式有五种。
    	 * springTransaction.xml是最原始的一种方式。这种方式需要为每一个bean配置一个代理
    	 */
        ApplicationContext context = new ClassPathXmlApplicationContext("springTransaction.xml");
        NewsDao dao = (NewsDao)context.getBean("newsDaoTransProxy", NewsDao.class);
        dao.insert();
    }

}
