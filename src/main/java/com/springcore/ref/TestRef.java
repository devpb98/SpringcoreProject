package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A a = (A) context.getBean("aref");
		System.out.println(a);
	}

}
