package MenuElements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class PopupMenuExample  {

	public static void main(String[] args) {
		
		
		JLabel label=new JLabel();
		JPopupMenu menu;
		JMenuItem one,two;
		
		public Popup() {
		
			l=new JLabel();
			f=new JFrame();
			f.setSize(300,300);
			f.setLayout(new FlowLayout());
			menu.new PopupMenu();
			f.add(Menu);
			one=new JMenuItem("One");
			two=new  JMenuItem("Two");
			
			menu.add(one);
			menu.add(two);
			f.setVisible(true);
	
			one.addActionListener(this);
			two.addActionListener(this);
			f.addMouseListener(this);
				
		}
		
		public void MouseClicked(MouseEvent e) {
			menu.show(f,e.getX(),e.getY());
		}
		
		public void actionPerformed(ActionEvent e) {
			String Item=e.getActionCommand();
			T.SetText(item+"is selected");
		}
		
		public void mousePressed(MouseEvent e) {
			String Item=e.getActionCommand();
			T.SetText(item+"is selected");

		}
		public void MouseReleased()
	}

}
