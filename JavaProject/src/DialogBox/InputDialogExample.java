package DialogBox;
import javax.swing.*;
//import java.awt.*;

public class InputDialogExample {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Main window");
		frame.setSize(300,200);
		frame.setVisible(true);
		
		String input=JOptionPane.showInputDialog(null,"Enter your Name");
			//System.out.println("you entered: "+input);
		JLabel label=new JLabel("You entered "+input,SwingConstants.CENTER);
		frame.add(label);
		frame.setVisible(true);
	}

}
