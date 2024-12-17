package eventHandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.awt.event,*;


public class Question1 {

	public static void main(String[] args) {
		JFrame frame=new JFrame("This is frame");
		JTextField textfield=new JTextField("hello world");
		JButton button=new JButton("Click");
		
		frame.add(button);
		frame.add(textfield);
		frame.setSize(400,400);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
//		button.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				String currentText=textfield.getText();
//				textfield.setText(currentText.toUpperCase());
//			}
//		});
button.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String currentText=textfield.getText();
		textfield.setText(currentText.toUpperCase());
	}
});
	}

}
