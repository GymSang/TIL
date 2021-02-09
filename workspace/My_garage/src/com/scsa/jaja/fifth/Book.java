package com.scsa.jaja.fifth;

public class Book {
	private String isbn;
	private String title; // \t 간격 조절
	
	@Override
	public String toString() { //if(isbn!=null)
		
		return isbn +"|"+ title;
		
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
