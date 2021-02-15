package com.scsa.java.fifth;

import com.scsa.java.sixth.Book;

public class BookTest {
	
	
	public static void main(String[] args) {
		
		System.out.println("*********************** 도서목록  **************************");
		Book b1=new Book();
		b1.setIsbn("21424");
		b1.setTitle("Java Pro");
		b1.setAuthor("김하나");
		b1.setPublisher("Jaen.kr");
		b1.setPrice(15000);
		b1.setDesc("기본문법");
		System.out.println(b1.toString());
		
		Book b2=new Book();
		b2.setIsbn("35355");
		b2.setTitle("OOAD 분석,설계");
		b2.setAuthor("소나무");
		b2.setPublisher("Jaen.kr");
		b2.setPrice(30000);
		b2.setDesc("");
		System.out.println(b2.toString());
		
		Magazine m1=new Magazine();
		m1.setIsbn("35535");
		m1.setTitle("Java World");
		m1.setAuthor("편집부");
		m1.setPublisher("androidjava.com");
		m1.setPrice(7000);
		m1.setYear(2013);
		m1.setMonth(2);
		m1.setDesc("");
		System.out.println(m1.toString());
		
		

	}

}
