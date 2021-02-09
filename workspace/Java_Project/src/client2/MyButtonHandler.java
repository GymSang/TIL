package client2;

import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyButtonHandler implements ActionListener {
	TextArea ta;
	TextField tf;
	@Override
	public void actionPerformed(ActionEvent e) {
			//하고싶은일
		String msg=tf.getText();
		ta.append(msg+"\n");
		tf.setText("");
	}
	
	public void setResource(TextArea ta,TextField tf) {
		this.ta=ta;
		this.tf=tf;}
}
