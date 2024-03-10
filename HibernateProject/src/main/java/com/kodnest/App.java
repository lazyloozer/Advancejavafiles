package com.kodnest;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kodnest.entity.Bike;
import com.kodnest.entity.student;

public class App 
{
    public static void main( String[] args )
    {
    	
        Configuration cfg = new Configuration();
        cfg.configure();
        
        SessionFactory factory= cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
//        //student student = new student(1,"Ben");
//        student student=session.get(student.class, 1);
//        System.out.println(student.getId()+"------"+student.getName());
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(student);
//        
//      //  session.save(student);
////        Bike bike = new Bike("duke",3.0);
//        session.save(bike);
        //one to one
//        Bike bike = new Bike("KTM",3.0);
//        session.save(bike);
//        student student = new student(10,"mike",bike);
//        session.save(student);
        //display all details
        
        List<student> list=session.createQuery("from student where id=3").list();
        for (student s : list) {
			
        	System.out.println(list);
		}
        
        transaction.commit();
        session.close();
        factory.close();
        
        
        
    }
}
