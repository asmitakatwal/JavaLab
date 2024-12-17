package EventHandling;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//
//public class ButtonClickedExample {
//
//	public static void main(String[] args) {
//		JFrame frame=new JFrame("Main frame");
//		frame.setSize(300,200);
//		JButton button =new JButton("Click here");
//		frame.setLayout(new FlowLayout());
//		frame.add(button);
//		frame.setVisible(true);
//		
//		button.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				JLabel label=new JLabel("Button Clicked",SwingConstants.CENTER);
//				frame.add(label);
//				frame.setVisible(true);
//			}
//		});
//	}
//
//}
import javax.swing.*;
import java.awt.event.*;

public class ButtonClickedExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Event Handling Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
