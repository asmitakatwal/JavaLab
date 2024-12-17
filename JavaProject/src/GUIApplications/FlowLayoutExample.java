package GUIApplications;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
public static void main(String[] args) {
	JFrame f=new JFrame();
	f.setSize(400,400);
	f.getContentPane().setLayout(new FlowLayout(FlowLayout.TRAILING));
	f.add(new JButton("Button 1"));

	f.setVisible(true);
}
}
