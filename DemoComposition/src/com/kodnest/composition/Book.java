package com.kodnest.composition;

public class Book {
	
	page page;
	
	public Book(String content) {
		this.page=new page(content);
	}

	void  readPage() {
		System.out.println("Reading the Pages");
	}
}
