package aWTExample;
import java.awt.*;
import java.awt.event.*;

public class FocusEventExample implements FocusListener{
Frame frame;
TextField txt;
Button button;

public FocusEventExample() {
	frame=new Frame("Focus event");
	txt=new TextField("enter");
	button=new Button("Click");
	txt.setBounds(50, 100, 300, 30);
	
	txt.addFocusListener(this);
	frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.out.println("Window is closed");
			System.exit(0);
		}
	});
	frame.setLayout(new FlowLayout());
	frame.add(txt);
	frame.add(button);
	frame.setSize(400,400);
	frame.setVisible(true);

}
public void focusGained(FocusEvent e) {
	System.out.println("Focus ganed");
}
public void focusLost(FocusEvent e) {
	System.out.println("Focus ganed");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new FocusEventExample();
	}

}
