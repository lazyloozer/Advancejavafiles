package com.kodnest.collections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ts=new ArrayList();
		/*
		 * PriorityQueue pq=new PriorityQueue(); pq.add(30); pq.add(40); pq.add(10);
		 * pq.add(50); pq.add(78);
		 * 
		 */
		/*
		 * ts.add(30); ts.add(40); ts.add(10); ts.add(50); ts.add(78);
		 * 
		 * System.out.println(ts); ts.set(0, 78); ts.add(1,30); ts.remove(5);
		 * System.out.println(ts);
		 */
		TreeSet ts1=new TreeSet();
		ts1.add(30);
		ts1.add(40);
		ts1.add(10);
		ts1.add(50);
		
		ts1.add(78);
		System.out.println(ts1);
	

		
	}

}
