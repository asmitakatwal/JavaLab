package MenuElements;
import javax.swing.*;
import java.awt.*;

public class ToolTipExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Tooltip Example");
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new FlowLayout());

        // Create components
        JButton button = new JButton("Hover over me");
        JTextField textField = new JTextField(15);
        JLabel label = new JLabel("Hover over the button");

       
        button.setToolTipText("This is a button. Click to perform an action.");
        textField.setToolTipText("Enter your text here.");
        label.setToolTipText("This is a label.");

        
        frame.add(label);
        frame.add(button);
        frame.add(textField);

        // Display the frame
        frame.setVisible(true);
    }
}


