package com.scsa.java.sixth;

public class BookTest {

	public static void main(String[] args) {
		
		System.out.println("*********************** 도서목록  **************************");
		Book b1=new Book();
		b1.setIsbn("21424");
		b1.setTitle("Java Pro");
		b1.setAuthor("김하나");
		b1.setPublisher("Jaen.kr");
		b1.setPrice(15000);
		b1.setDesc("Java 기본 문법");
		System.out.println(b1.toString());
		
		Book b2=new Book();
		b2.setIsbn("33455");
		b2.setTitle("JDBC Pro");
		b2.setAuthor("김철수");
		b2.setPublisher("Jaen.kr");
		b2.setPrice(23000);
		b2.setDesc("");
		System.out.println(b2.toString());
		
		Book b3=new Book();
		b3.setIsbn("55355");
		b3.setTitle("Servlet/JSP");
		b3.setAuthor("박자바");
		b3.setPublisher("Jaen.kr");
		b3.setPrice(41000);
		b3.setDesc("Model2 기반");
		System.out.println(b3.toString());
		
		Book b4=new Book();
		b4.setIsbn("35332");
		b4.setTitle("Android App");
		b4.setAuthor("홍길동");
		b4.setPublisher("Jaen.kr");
		b4.setPrice(25000);
		b4.setDesc("");
		System.out.println(b4.toString());
		
		Book b5=new Book();
		b5.setIsbn("35355");
		b5.setTitle("OOAD 분석,설계");
		b5.setAuthor("소나무");
		b5.setPublisher("Jaen.kr");
		b5.setPrice(30000);
		b5.setDesc("");
		System.out.println(b5.toString());
		System.out.println("");
		System.out.println("*********************** 잡지목록  **************************");
		Magazine m1=new Magazine();
		m1.setIsbn("35535");
		m1.setTitle("Java World");
		m1.setAuthor("편집부");
		m1.setPublisher("Jaen.kr");
		m1.setPrice(7000);
		m1.setDesc("");
		m1.setYear(2013);
		m1.setMonth(2);
		System.out.println(m1.toString());
		
		Magazine m2=new Magazine();
		m2.setIsbn("33434");
		m2.setTitle("Mobile World");
		m2.setAuthor("편집부");
		m2.setPublisher("aJaen.kr");
		m2.setPrice(8000);
		m2.setDesc("");
		m2.setYear(2013);
		m2.setMonth(8);
		System.out.println(m2.toString());
		
		Magazine m3=new Magazine();
		m3.setIsbn("75342");
		m3.setTitle("Next Web");
		m3.setAuthor("편집부");
		m3.setPublisher("Jaen.kr");
		m3.setPrice(10000);
		m3.setDesc("AJAX 소개");
		m3.setYear(2012);
		m3.setMonth(10);
		System.out.println(m3.toString());
		
		
		Magazine m4=new Magazine();
		m4.setIsbn("76543");
		m4.setTitle("Architecture");
		m4.setAuthor("편집부");
		m4.setPublisher("Jaen.kr");
		m4.setPrice(5000);
		m4.setDesc("java 시스템");
		m4.setYear(2010);
		m4.setMonth(3);
		System.out.println(m4.toString());
		
		
		Magazine m5=new Magazine();
		m5.setIsbn("76534");
		m5.setTitle("Data Modeling");
		m5.setAuthor("편집부");
		m5.setPublisher("Jaen.kr");
		m5.setPrice(14000);
		m5.setDesc("");
		m5.setYear(2012);
		m5.setMonth(12);
		System.out.println(m5.toString());
		

	}

}
