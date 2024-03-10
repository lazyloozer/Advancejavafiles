
//Consider a scenario where you are developing a high-frequency trading application. 
//The trading engine receives price updates for stocks, and it needs to maintain a set of unique price points, 
//sorted according to custom rules. Instead of the natural ordering, the sorting must prioritize even numbers followed by odd numbers, 
//both in ascending order. You are tasked to implement this sorting within a TreeSet using a custom comparator in Java.


package com.kodnest.collect;
import java.util.*;


public class Sortedeven {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    TreeSet<Integer> customSortedNumbers = new TreeSet<>(new CustomComparator());

    while (scanner.hasNextInt()) {

      customSortedNumbers.add(scanner.nextInt());

    }

    customSortedNumbers.forEach(number -> System.out.print(number + " "));

  }

  }

  class CustomComparator implements Comparator<Integer> {

    @Override

    public int compare(Integer num1, Integer num2) {

      if ((num1 % 2 == 0) && (num2 % 2 != 0)) {

        return -1;

      } else if ((num1 % 2 != 0) && (num2 % 2 == 0)) {

        return 1;

      } else {

        return num1.compareTo(num2);

      }

    }

  }