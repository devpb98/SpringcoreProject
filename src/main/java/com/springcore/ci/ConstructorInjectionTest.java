package com.springcore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/constructorconfig.xml");
		Person p = (Person) context.getBean("person1");
		System.out.println(p);
		
		Addition add = (Addition) context.getBean("add");
		System.out.println(add);
	}

}
