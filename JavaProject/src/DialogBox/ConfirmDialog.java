//package DialogBox;
//
//import javax.swing.*;
//
//
//public class ConfirmDialog {
//
//	public static void main(String[] args) {
//		JFrame frame=new JFrame("This is Dialog box");
//		frame.setSize(300,200);
//	
//		frame.setVisible(true);
//	int response=JOptionPane.showConfirmDialog(null,"Do you want to proceed?","COnfirm Dialog",JOptionPane.YES_NO_OPTION);
//	if(response==JOptionPane.YES_OPTION) {
//		
//		JLabel label=new JLabel("User choice Yes",SwingConstants.CENTER);
//		frame.add(label);
//	frame.setVisible(true);
//	}
//
//	}
//
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmDialog {
    public static void main(String[] args) {
        // Create a JFrame (main window)
        JFrame frame = new JFrame("Text Field Style Changer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        // Create a JTextField
        JTextField textField = new JTextField("Enter some text here", 20);
        textField.setFont(new Font("Arial", Font.PLAIN, 16)); // Default font

        // Create a JButton
        JButton button = new JButton("Change Text Style");

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change text color to red
                textField.setForeground(Color.RED);

                // Change font to Arial, Bold, 20 pts
                textField.setFont(new Font("Arial", Font.BOLD, 20));
            }
        });

        // Add components to the frame
        frame.add(textField);
        frame.add(button);

        // Make the frame visible
        frame.setVisible(true);
    }
}
