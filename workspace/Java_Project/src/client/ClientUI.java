package client;

import java.awt.*;
import java.awt.event.*;

public class ClientUI {

	public static void main(String[] args) {
		Frame f=new Frame("너랑나");
		Panel p=new Panel();
		Button b1=new Button("아이유");
		TextField tf=new TextField(20);
		TextArea ta=new TextArea(); //메써드로  MybuttonHandler에 전달하면 채팅하듯이 가능해
		Button b2=new Button("이지은");
//		Button b3=new Button("이지금");
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
		b1Handler.setTextArea(ta);
		b1Handler.setTextField(tf);
		b1.addActionListener(b1Handler);
		tf.addActionListener(b1Handler);
		
		
		f.add(ta,BorderLayout.CENTER);
		f.add(p,BorderLayout.SOUTH);

		p.add(tf);
		p.add(b1);
		p.add(b2);
//		p.add(b3);
//		p.add(b4);
//		p.add(b5);
		
		p.setBackground(Color.cyan);
		
		f.setLocation(0, 600);
		f.setSize(800, 600);
		f.setBackground(Color.GRAY);
		f.setVisible(true);
		
	}

}