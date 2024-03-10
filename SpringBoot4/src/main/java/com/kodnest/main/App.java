package com.kodnest.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Trainer;
import com.kodnest.bean.University;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		University bean = (University)context.getBean("W2");
		//System.out.println(bean);
//		Trainer bean1 = (Trainer)context.getBean("W1");
         System.out.println(bean);
	
		

	}

}

