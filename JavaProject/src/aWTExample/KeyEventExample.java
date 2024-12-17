package aWTExample;
import java.awt.*;
import java.awt.event.*;

public class KeyEventExample implements KeyListener{
	Frame frame;
	TextField txt;
public KeyEventExample() {
	frame=new Frame("key Event Example");
	txt=new TextField("");
	txt.addKeyListener(this);
	frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.out.println("Window is closed");
			System.exit(0);
		}
	});
	frame.add(txt);
	frame.setSize(400,400);
	frame.setVisible(true);
}
public void keyTyped(KeyEvent e) {}
public void keyPressed(KeyEvent e) {
	System.out.println("Key is pressed"+e.getKeyChar());
}
public void keyReleased(KeyEvent e) {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new KeyEventExample();
	}

}
