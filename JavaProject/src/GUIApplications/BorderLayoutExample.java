package GUIApplications;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {

	public static void main(String[] args) {
	JFrame frame=new JFrame("BorderLayout Example");
	frame.setSize(400,400);
	frame.getContentPane().setLayout(new BorderLayout());
	frame.add(new JButton("North"),BorderLayout.NORTH);
	frame.add(new JButton("South"),BorderLayout.SOUTH);
	frame.add(new JButton("East"),BorderLayout.EAST);
	frame.add(new JButton("West"),BorderLayout.WEST);
	frame.add(new JButton("Center"),BorderLayout.CENTER);
frame.setVisible(true);
	}

}
