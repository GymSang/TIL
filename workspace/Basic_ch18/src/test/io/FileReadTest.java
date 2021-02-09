package test.io;

import java.io.*;


public class FileReadTest {

	public static void main(String[] args) {
			FileReader fr=null;
			BufferedReader br=null;
		
		try {
			
			fr=new FileReader("c:\\0java\\a.txt");
		    br=new BufferedReader(fr);
			String oneLine="";
			while((oneLine=br.readLine()) != null) {
			System.out.println(oneLine);
					}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(br !=null) br.close();  
				if(fr !=null) fr.close();
			}catch(IOException e) {
				
			}
			}
		}

	}

