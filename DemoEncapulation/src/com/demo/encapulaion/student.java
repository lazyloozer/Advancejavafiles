package com.demo.encapulaion;

public class student {
              //hiding data using access specifiers
			private String name;
			private int age;
			
			//controller access to hidden data
	        public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
		

		

	}


