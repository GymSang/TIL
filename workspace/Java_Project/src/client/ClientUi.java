package client; //강사님이 바꿔주신거

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ClientUi {
	TextArea ta;
	TextField tf;
	
	public void chatMsg() {
		String msg=tf.getText();
		ta.append(msg+"\n");
		tf.setText("");
	}
	
	public void onCreate() {
		Frame f=new Frame("유앤아이");
		Panel p=new Panel();
		Button b1=new Button("아이유");
		 tf=new TextField(20);
		 ta=new TextArea();	
		 MenuBar mb=new MenuBar();
		 Menu file_menu=new Menu("화일");
		 Menu file_menu2=new Menu("판집");
		 MenuItem open_item=new MenuItem("열기");
		 MenuItem save_item=new MenuItem("저장");
		 
		 file_menu.add(open_item);
		 file_menu.add(save_item);
		 mb.add(file_menu2);
		 mb.add(file_menu);
		 f.setMenuBar(mb);
		 
		 open_item.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent ae) {
				System.out.println("file open!");
				FileDialog open=new FileDialog(f, "열기 창", FileDialog.LOAD);
				open.setVisible(true);
				FileReader fr=null;
				BufferedReader br=null;
			
			try {
				
				fr=new FileReader(open.getDirectory()+open.getFile());
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
		
//		 ta.addMouseListener(new MouseAdapter() {
//			 
//			 @Override
//		public void mouseEntered(MouseEvent e) {
//				ta.append("마우스가 들어왔습니다.\n");
//		}});
//		 
		 
		 
		 
		 f.addWindowListener(new WindowAdapter() {@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
		
		b1.addActionListener(e-> chatMsg());{ //람다식 표현
			
	
	
		 
			
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				chatMsg();
				
			}
		});
		

		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);
		p.add(tf);
		p.add(b1);
		
		p.setBackground(Color.pink);
		
		//Color bgColor=new Color(123,24,56);
		f.setBackground(Color.GREEN);
		f.setLocation(800, 200);
		f.setSize(400,500);
		f.setVisible(true);
		
	

	public static void main(String[] args) {
		ClientUi ui=new ClientUi();
		ui.onCreate();
	}//end main
	
//	public class MyButtonHandler implements {
//		
////		@Override
////		public void actionPerformed(ActionEvent e) {
////			// 하고 싶은 일
////			String msg=tf.getText();
////			ta.append(msg+"\n");
////			tf.setText("");
////		}
////		
////	}
//	
//	public class MyFrameHandler extends WindowAdapter{	
//
//		@Override
//		public void windowClosing(WindowEvent e) {
//			System.out.println("windowClosing");
//			System.exit(0);
//		} 아웃터 클래스를 위로 보냈음
//
	


}//end ClientUi