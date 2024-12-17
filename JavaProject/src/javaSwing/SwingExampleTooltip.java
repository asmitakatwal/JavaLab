package javaSwing;

import java.awt.*;

import javax.swing.*;

public class SwingExampleTooltip {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Tooltip Example");
		frame.setSize(400,300);
		
		frame.setLayout(new FlowLayout());
		
		//create components
		JButton button=new JButton("Hover over me");
		JTextField textfield=new JTextField("enter text");
		JLabel label=new JLabel("This is label");
		
		button.setToolTipText("This is button");
		label.setToolTipText("This is label");
		
		frame.add(label);
		frame.add(button);
		frame.add(textfield);	
		frame.setVisible(true);

	}

}
