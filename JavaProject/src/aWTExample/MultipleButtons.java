package aWTExample;
import java.awt.*;
import java.awt.event.*;

public class MultipleButtons implements ActionListener {
    Frame f;
    Button b1, b2;

    public  MultipleButtons() {
        f = new Frame("Multi-Button Example");
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");

        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.add(b1);
        f.add(b2);

        // Register this class as the listener
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Button 1 clicked!");
        } else if (e.getSource() == b2) {
            System.out.println("Button 2 clicked!");
        }
    }

    public static void main(String[] args) {
        new  MultipleButtons();
    }
}
