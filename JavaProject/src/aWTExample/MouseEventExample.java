package aWTExample;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample implements MouseListener{
Frame frame;
Button button;
public MouseEventExample() {
	frame=new Frame("Mouse Event listener");
	button=new Button("Click");
	
	frame.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.out.println("Window is closing");
			System.exit(0);
		}
	});
//	MouseEventExample listener=new MouseEventExample();
//	button.addMouseListener(listener);
	button.addMouseListener(this);
	frame.add(button);
	frame.setSize(400,400);
	frame.setVisible(true);
}

public void mouseClicked(MouseEvent e) {
	System.out.println("Mouse Clciked");
}

public void mousePressed(MouseEvent e){}

public void mouseReleased(MouseEvent e) {}

public void mouseEntered(MouseEvent e) {}

public void mouseExited(MouseEvent e){}

public static void main(String[] args) {
	
new MouseEventExample();
	}

}

