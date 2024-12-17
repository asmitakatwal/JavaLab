package GUIControls;
import javax.swing.*;
import java.awt.*;

public class GUIControlsExample{
	public static void main(String[] args) {
		JFrame frame =new JFrame("This is frame");
	
		
		frame.add(new JButton("Clickeme"));
		frame.add(new JCheckBox("I agree"));
		frame.add(new JTextField("write here"));
		
		
		frame.setLayout(new FlowLayout());
		frame.setSize(400,400);
		frame.setVisible(true);
	}
}

