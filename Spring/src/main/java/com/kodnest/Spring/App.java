package com.kodnest.Spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Laptop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Laptop bean=(Laptop) context.getBean("L1");
		System.out.println(bean);

    }
}
