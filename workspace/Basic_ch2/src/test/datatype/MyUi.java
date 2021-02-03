package test.datatype;

import java.awt.*;

public class MyUi {

	public static void main(String[] args) {
		Button b=new Button("힘내");
        Frame f=new Frame();
        f.setSize(500, 400);
        f.add(b,BorderLayout.SOUTH);
        f.setVisible(true);
	}

}
