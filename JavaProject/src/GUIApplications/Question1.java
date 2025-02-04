package GUIApplications;
import javax.swing.*;
import java.awt.*;

public class Question1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Box());
    }
    static class Box extends JFrame {
        JButton one = new JButton("Btn 1");
        JButton two = new JButton("Btn 2");
        JButton three = new JButton("Btn 3");
        JButton four = new JButton("long names Btn 4");
        JButton five = new JButton("Btn 5");

        public Box() {
            setTitle("Vertical Buttons Example");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(400, 400);

            // Set BoxLayout with vertical alignment
            setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

            // Set alignment for buttons
            one.setAlignmentX(Component.LEFT_ALIGNMENT);
            two.setAlignmentX(Component.LEFT_ALIGNMENT);
            three.setAlignmentX(Component.LEFT_ALIGNMENT);
            four.setAlignmentX(Component.LEFT_ALIGNMENT);
            five.setAlignmentX(Component.LEFT_ALIGNMENT);

            // Add buttons to frame
            add(one);
            add(two);
            add(three);
            add(four);
            add(five);

            // Adjust frame size
            pack();
            setVisible(true);
        }
   
    }
    
}
