package client2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//public class MyFrameHandler implements WindowListener{
public class MyFrameHandler extends WindowAdapter{
//	@Override
//	public void windowOpened(WindowEvent e) {
//		System.out.println("windowOpened");
//		
//	}
//
//	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
		System.exit(0);
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		System.out.println("windowClosed");
//		
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		System.out.println("windowIconified(W");
//		
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		System.out.println("창이 비아이콘화 되었읍니다");
//		
//	}
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		System.out.println("windowActivated");
//		
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		System.out.println("windowDeactivated");
		
	}
	

}
