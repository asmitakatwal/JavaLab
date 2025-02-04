package aWTExample;
import java.awt.*;
import java.awt.event.*;
//
//public class ClosableAwt {
//
//	public static void main(String[] args) {
//Frame frame=new Frame("Closablel frame");
//frame.setSize(400,400);
//frame.setLocationRelativeTo(null);
//frame.addWindowListener(new WindowListener() {
//	public void windowOpened(WindowEvent e) {}
//	public void windowClosing(WindowEvent e) {
//		System.out.println("Frame is closing");
//		System.exit(0);
//	}
//	public void windowClosed(WindowEvent e) {}
//	public void windowIconified(WindowEvent e) {}
//	public void windowDeiconified(WindowEvent e) {}
//	public void windowActivated(WindowEvent e) {}
//	public void windowDeactivated(WindowEvent e) {}
//});
//
//Label label=new Label("CLose the window");
//frame.add(label);
//frame.setVisible(true);
//	}
//
//}
//public class ClosableAwt{
// 	public static void main(String[] args) {
// 		Frame frame=new Frame("CLosable awt");
// 		frame.setSize(400,400);
// 		frame.setLocationRelativeTo(null);
// 		
// 		frame.addWindowListener(new WindowAdapter() {
// 			public void windowClosing(WindowEvent e) {
// 				System.out.println("Window closed");
// 				System.exit(0);
// 			}
// 		});
// 		
// 		Label label=new Label("Close the window");
// 		frame.add(label);
// 		frame.setVisible(true);
// 		
// 	}
//}

public class ClosableAwt implements WindowListener{
	Frame f;
	public ClosableAwt() {
		f=new Frame("Closable frame");
		f.setSize(400,400);
		f.setVisible(true);
		f.addWindowListener(this);
	}
	@Override
	public void windowClosing(WindowEvent e)
	{
		f.dispose();
		System.exit(0);
	}
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosed(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	
	public static void main(String[] args) {
		new ClosableAwt();
	}
	
}



































