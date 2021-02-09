package temporary;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ATest {
	public static void main(String[] args) {
		Frame f=new Frame();
		TextArea ta=new TextArea();
		
		A handler=new A();
		ta.addMouseListener(handler);
		
		ta.setBackground(Color.RED);
//		Button b=new Button("Button");
		f.add(ta,BorderLayout.CENTER);
		Panel p=new Panel();
		p.setSize(100,200);
		p.setBackground(Color.BLUE);
		f.add(p,BorderLayout.SOUTH);
		f.setSize(400,300);
		f.setVisible(true);
		
	}
}

class A implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("클릭");
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("누르고있음");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("마우스 뗌");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("마우스들어옴");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("마우스나감");
	}
	
}