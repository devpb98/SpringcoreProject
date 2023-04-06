package com.springcore.lifecycle;

import org.springframework.context.support.*;

public class LifecycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
		Samosa samosa = (Samosa) context.getBean("samosa");
		
		System.out.println(samosa);
		
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Pepsi p1 = (Pepsi) context.getBean("p1");
		System.out.println(p1);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		Chutney chutney = (Chutney) context.getBean("chutney");
		System.out.println(chutney);
		
		
	}

}
