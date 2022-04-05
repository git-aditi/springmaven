package com.miit.springmaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppToyotaSpring {

	public static void main(String[] args) {
		
		System.out.println("Before context:::");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("applicationContext.xml"); // starts spring application by 
		// creating spring container
		
		System.out.println("After context:::");
		
		Toyota toyota = (Toyota) context1.getBean("toyota");
		Engine engine = toyota.getEngine();
		
		System.out.println("Engine is:;" + engine);
		// Toyota toyotanormal = new Toyota();
		// toyotanormal.sayHello();
		// perromtest.perform();
		toyota.sayHello();

		Toyota toyota1 = (Toyota) context1.getBean("toyota");

		if (toyota == toyota1)
			System.out.println("equals::");
		else
			System.out.println("not equals::");
	}
}
