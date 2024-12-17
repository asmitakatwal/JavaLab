package DialogBox;
import javax.swing.*;

public class MsgDialogExample {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Main Window");
		frame.setSize(300,200);
		frame.setVisible(true);
		
		JOptionPane.showMessageDialog(null,"Hello from dialog","This is dialog Box", JOptionPane.INFORMATION_MESSAGE);

	}

}
