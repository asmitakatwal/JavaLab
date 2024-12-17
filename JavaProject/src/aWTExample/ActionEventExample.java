package aWTExample;
import java.awt.*;
import java.awt.event.*;


//public class ActionEventExample {
//
//	public static void main(String[] args) {
//		Frame frame=new Frame("This is action event");
//		Button button=new Button("Click");
//		frame.setSize(400,400);
//		
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button Clicked");
//			}
//		});
//		frame.addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				System.out.println("Window closing");
//				System.exit(0);
//			}
//		});
//		frame.add(button);
//		frame.setVisible(true);
//
//	}
//
//}
public class ActionEventExample implements ActionListener{
	Frame frame;
	Button button;
	public ActionEventExample()
	{
		 frame=new Frame("This is window listener");
	  button=new Button("Click");
		frame.setSize(400,400);
		frame.add(button);
		
		button.addActionListener(this);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				//frame.dispose();
				System.out.println("Window CLosed");
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked");
	}
	
//	public void windowClosing(WindowEvent e) {
//		frame.dispose();
//		System.out.println("Window is closed");
//		System.exit(0);
//	}
	
		public static void main(String[] args) {
			new ActionEventExample();
	}
}










