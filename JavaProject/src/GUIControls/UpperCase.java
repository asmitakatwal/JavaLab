package GUIControls;

import javax.swing.*;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;

class Example {
	JFrame frame;
	JButton red,blue,black;
	
	public Example()
	{
		frame=new JFrame();
		frame.setSize(400,400);
		red=new JButton("Red");
		blue=new JButton("blue");
		black=new JButton("black");
		
		frame.add(red);
		frame.add(blue);
		frame.add(black);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		red.addActionListener((ActionListener) this);
		blue.addActionListener((ActionListener) this);
		black.addActionListener((ActionListener) this);	
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==red) {
			frame.setBackground(Color.RED);
			frame.getContentPane().setBackground(Color.RED);
		}
		else if(e.getSource()==blue) {
			frame.getContentPane().setBackground(Color.RED);
		}
		else {
			frame.getContentPane().setBackground(Color.RED);
			
		}
		
	}

	
}

public class UpperCase {

public static void main(String[] args) {
	new Example();
}

}
