package com.miit.springmaven;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // annotation - spring uses component annotation to manage class to
			// create object
			// @controller, @restcontroller, @repository, @service - stereotypes
//@Scope("prototype")
public class Toyota implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	@Autowired //
	private Engine engine;

	String beanName;

	ApplicationContext applicationContext;

	public void sayHello() {
		System.out.println("Hello Toyota::" + beanName);
		engine.sayHello();
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setBeanName(String name) {
		this.beanName = name;

	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext = applicationContext;

	}

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub

	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("Inside postConstruct::");
	}

	@PreDestroy
	public void preDestroy() {
		System.out.println("Inside preDestroy::");
	}

}
