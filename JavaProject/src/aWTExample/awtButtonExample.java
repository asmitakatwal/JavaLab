package aWTExample;
import java.awt.*;

import javax.swing.*;

/*
 * public class awtButtonExample { public static void main(String[] args) { //
 * Create a frame Frame frame = new Frame("AWT Button Click Example");
 * 
 * // Create a button Button button = new Button("Click Me");
 * 
 * // Create a label Label label = new Label("Button not clicked");
 * 
 * 
 * button.addActionListener(new ActionListener() { public void
 * actionPerformed(ActionEvent e) { label.setText("Button clicked!"); } });
 * 
 * // Layout frame.setLayout(new FlowLayout()); frame.add(button);
 * frame.add(label);
 * 
 * // Set the size and make it visible frame.setSize(300, 200);
 * frame.setVisible(true);
 * 
 * 
 * frame.addWindowListener(new WindowAdapter() { public void
 * windowClosing(WindowEvent we) { System.exit(0); } }); } }
 */

public class awtButtonExample{
	public static void main(String[] args) {
		JFrame frame=new JFrame("Frame example");
		Label label=new Label("Hello");
		JLabel label2=new JLabel("Hello");
		
		TextField textfield=new TextField("text here");
		JTextField textfield2=new JTextField("text here");
		
		Button button=new Button("button");
		JButton button2=new JButton("button");
		
		Checkbox box=new Checkbox();
		JCheckBox box1=new JCheckBox();
		
		
		frame.setLayout(new FlowLayout());
		frame.add(label);
		frame.add(label2);
		
		frame.add(textfield);
		frame.add(textfield2);
		
		
		frame.add(button);
		frame.add(button2);
		
		frame.add(box);
		frame.add(box1);
		frame.setSize(300,400);
		frame.setVisible(true);
	}
}