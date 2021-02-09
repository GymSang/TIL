package client2; //내가한거

import java.awt.*;
import java.awt.event.*;

public class ClientUI {

	TextArea ta;
	TextField tf;
	
	public static void main(String[] args) {
		Frame f=new Frame("너랑나");
		Panel p=new Panel();
		Panel p2=new Panel();
		Button b1=new Button("아이유");
		Button b2=new Button("이지은");
		TextField tf=new TextField(20);
		TextArea ta=new TextArea(); //메써드로  MybuttonHandler에 전달하면 채팅하듯이 가능해
		
		Button b3=new Button("이지금");
//		Button b4=new Button("이지안");
//		Button b5=new Button("이순신");//한글 깨질시, Run config -> Vm argument -> -Dfile.encoding=MS949 코드 추가
//		
		WindowListener fHandler=new MyFrameHandler();
		f.addWindowListener(fHandler);
		
		
//		GridLayout mgr=new GridLayout(2,3);
		//FlowLayout mgr=new FlowLayout();
		//f.setLayout(mgr);
//		ActionListener l=new ActionListener(); 이게 아니라 아래 마이버튼핸들러로
		MyButtonHandler b1Handler=new MyButtonHandler();
		MyButtonHandler b2Handler=new MyButtonHandler();
		b1Handler.setResource(ta,tf);

		b1.addActionListener(b1Handler);
		tf.addActionListener(b1Handler);
		
		
		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);

		p.add(tf);
		p.add(b1);
		p2.add(b2,"East");
		p2.add(b3,"North");
//		p.add(b4);
//		p.add(b5);
		
		p.setBackground(Color.cyan);
		p2.setBackground(Color.BLACK);
		f.setLocation(0, 600);
		f.setSize(800, 600);
		f.setBackground(Color.GRAY);
		f.setVisible(true);
		
	}
	
	

}