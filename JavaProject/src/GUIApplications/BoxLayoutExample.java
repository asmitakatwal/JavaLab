package GUIApplications;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a JPanel with BoxLayout (vertical alignment)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add buttons to demonstrate layout
        panel.add(new JButton("Button 1"));
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Add vertical spacing
        panel.add(new JButton("Button 2"));
        panel.add(Box.createVerticalGlue()); // Add flexible spacing
        panel.add(new JButton("Button 3"));

        // Add panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}

