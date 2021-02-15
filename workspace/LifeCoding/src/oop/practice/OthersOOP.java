package oop.practice;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Math.ceil(Math.PI));
		System.out.println(Math.ceil(1.9));
		
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("Hello");
		f1.write("Java");
		f1.close();
		
		
	}
}
