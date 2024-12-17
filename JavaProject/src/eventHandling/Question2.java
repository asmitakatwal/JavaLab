package eventHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Question2 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("COlor frame");
		
		JButton redbutton=new JButton("red");
		JButton greenbutton=new JButton("green");
		JButton bluebutton=new JButton("blue");
		
		frame.add(redbutton);
		frame.add(greenbutton);
		frame.add(bluebutton);
		
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		redbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.RED);
				}
		});
		
		greenbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.getContentPane().setBackground(Color.GREEN);
			}
		});
		
		bluebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frame.getContentPane().setBackground(Color.BLUE);
		}
		});
		

	}

}
