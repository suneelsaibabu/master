package com.SprinEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		myApp m=(myApp) context.getBean("MyApp");
		m.getName();
	}

}
