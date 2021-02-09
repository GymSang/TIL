package test.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {

	public static void main(String[] args) {
		FileWriter fw=null;
		try {
			fw=new FileWriter("c:\\0java\\b.txt");
			fw.write("do'ooh\n");
			fw.write("mmmmmmm");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			 try {
				 if(fw !=null ) fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		

	}

}

