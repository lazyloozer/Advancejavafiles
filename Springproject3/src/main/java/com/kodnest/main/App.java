package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Employee;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Employee e=(Employee)context.getBean("E1");
		System.out.println(e);
//	Employee e1=(Employee)context.getBean("E2");
//	System.out.println(e1);

	}

}
