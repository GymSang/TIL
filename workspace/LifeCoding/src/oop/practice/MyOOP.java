package oop.practice;

public class MyOOP {
	public static String delimiter = "";
	
	public static void main(String[] args) {
		
		delimiter = "----";
		PrintA();
		PrintA();
		
		PrintB();
		PrintB();
		
		delimiter = "****";
		
		PrintA();
		PrintA();
		
		PrintB();
		PrintB();

	}

	public static void PrintA() {
		System.out.println(delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	public static void PrintB() {
		System.out.println(delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}
