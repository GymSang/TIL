package server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class Server {

	public static void main(String[] args) {
		try {
			ServerSocket ss=new ServerSocket(1144);
			Socket s=ss.accept();
			System.out.println(s.getInetAddress()+"connection");
			
			DataInputStream in=new DataInputStream(s.getInputStream());
			String msg=in.readUTF();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
