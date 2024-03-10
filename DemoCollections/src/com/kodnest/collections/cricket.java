package com.kodnest.collections;
import java.util.*;

public class cricket {
		void cricket(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
				ArrayList cpl=new ArrayList();
				cpl.add(sc.nextLine());
				cpl.add(sc.nextLine());
				cpl.add(2, sc.nextLine());
				cpl.add(3, sc.nextLine());
				System.out.println(cpl);
				System.out.println("Succesfully");
				}
				void footbal(){
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the name");
				ArrayList fbl=new ArrayList();
				fbl.add(sc.nextLine());
				fbl.add(sc.nextLine());
				fbl.add(2, sc.nextLine());
				fbl.add(3, sc.nextLine());
				System.out.println(fbl);
				System.out.println("Succesfully");
				}
				void remove() {
					ArrayList cpl=new ArrayList();
					Scanner sc=new Scanner(System.in);
					cpl.remove(sc.nextLine());
					System.out.println(cpl);
					System.out.println("Succesfully");
					}
					
				}


