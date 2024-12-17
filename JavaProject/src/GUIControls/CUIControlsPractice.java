//package GUIControls;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class CUIControlsPractice {
//
//	public static void main(String[] args) {
//		JFrame frame=new JFrame("Registration Form");
//		frame.setSize(400,400);
//		frame.setLayout(new FlowLayout());
//	
//		JLabel label=new JLabel("enter teat here");
//		JButton button=new JButton("Clicke me");
//		JPasswordField passwordfield=new JPasswordField(20);
//		JRadioButton radiobutton=new JRadioButton("Check here");
//		
//		
//		frame.add(passwordfield);
//		frame.add(label);
//		frame.add(button);
//		frame.add(radiobutton);
//		
//		frame.setVisible(true);
//		
//	}
//
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CUIControlsPractice {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("GUI Controls Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2, 10, 10)); // 6 rows, 2 columns, spacing

        // Add a JLabel
        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);

        // Add a JTextField
        JTextField nameField = new JTextField();
        panel.add(nameField);

        // Add a JLabel and JPasswordField
        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);
        JPasswordField passwordField = new JPasswordField();
        panel.add(passwordField);

        // Add a JCheckBox
        JCheckBox agreeCheckBox = new JCheckBox("I agree to the terms");
        panel.add(agreeCheckBox);

        // Add a JComboBox
        JLabel genderLabel = new JLabel("Gender:");
        panel.add(genderLabel);
        JComboBox<String> genderComboBox = new JComboBox<>(new String[] {"Male", "Female", "Other"});
        panel.add(genderComboBox);

        // Add a JButton
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);

        // Add an ActionListener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (agreeCheckBox.isSelected()) {
                    JOptionPane.showMessageDialog(frame, 
                        "Welcome, " + nameField.getText() + "!\nGender: " + genderComboBox.getSelectedItem());
                } else {
                    JOptionPane.showMessageDialog(frame, "You must agree to the terms!");
                }
            }
        });

        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
