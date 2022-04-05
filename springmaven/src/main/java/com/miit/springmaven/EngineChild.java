package com.miit.springmaven;

import org.springframework.stereotype.Component;

@Component
public class EngineChild extends Engine{
	
	public void sayHello(){
		System.out.println("Hello Engine");
	}

}
