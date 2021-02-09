package client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket s=new Socket("localhost",1144);
			System.out.println("Server Connect Complete");
			
			DataOutputStream out=new DataOutputStream(s.getOutputStream());
			out.writeUTF("fuck");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
