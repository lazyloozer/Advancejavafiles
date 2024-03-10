package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodenst.bean.Laptop;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Laptop bean=(Laptop)context.getBean("L1");
		System.out.println(bean);
		Laptop bean1=(Laptop) context.getBean("L2");
		System.out.println(bean1);


	}

}	

