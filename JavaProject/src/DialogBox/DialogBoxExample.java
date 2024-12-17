package DialogBox;

import javax.swing.*;

public class DialogBoxExample{
	public static void main(String[] args) {
		JFrame frame=new JFrame("Main Frame");
		frame.setSize(300,400);
		frame.setVisible(true);
		
		JDialog dialog=new JDialog(frame,"Custom Dialog",true);
		dialog.setSize(200,150);
		dialog.setLocationRelativeTo(frame);
		
		
		JLabel label=new JLabel("This is label",SwingConstants.CENTER);
		dialog.add(label);
	dialog.setVisible(true);
	}
}