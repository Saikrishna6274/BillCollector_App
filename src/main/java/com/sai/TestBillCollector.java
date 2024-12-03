package com.sai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBillCollector {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		BillCollector bc=context.getBean("billCollector",BillCollector.class);
		bc.billPayment(1000.99);

	}

}
