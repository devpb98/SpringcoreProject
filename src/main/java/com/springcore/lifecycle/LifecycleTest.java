package com.springcore.lifecycle;

import org.springframework.context.support.*;

public class LifecycleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		
		Samosa samosa = (Samosa) context.getBean("samosa");
		
		System.out.println(samosa);
		
		context.registerShutdownHook();
	}

}
