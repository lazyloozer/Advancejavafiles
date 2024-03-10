//
//You are developing a Java program to manage student grades using a TreeSet and implementing the Comparable interface.
//Each student is represented by a Student object containing their name and grade. 
//Implement a solution that efficiently uses a TreeSet to store and sort students based on their grades.
package com.kodnest.collect;

	import java.util.*;
	



	class Student implements Comparable<Student> {

	  private String name;

	  private int grade;



	  public Student(String name, int grade) {

	    this.name = name;

	    this.grade = grade;

	  }



	  @Override

	  public int compareTo(Student other) {

	    return Integer.compare(this.grade, other.grade);

	  }



	  public String toString() {

	    return name + " - " + grade;

	  }

	}

public class StudentGrade {


	  public static void main(String[] args) {

	    Scanner scanner = new Scanner(System.in);

	    TreeSet studentGrades = new TreeSet();



	    // Reading input and processing student grades

	    while (scanner.hasNext()) {

	      String name = scanner.next();

	      int grade = scanner.nextInt();

	      Student student = new Student(name, grade);

	      studentGrades.add(student);

	    }



	    // Displaying sorted student grades

	    System.out.println("Sorted Student Grades:");

	    for (Student student : studentGrades) {

	      System.out.println(student);

	    }

	  }

	}


