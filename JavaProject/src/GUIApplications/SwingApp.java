package GUIApplications;
import javax.swing.*;


public class SwingApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello Swing");
        JButton button = new JButton("Click Me!");
        button.setBounds(50, 50, 100, 30);

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

