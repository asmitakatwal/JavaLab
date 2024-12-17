package aWTExample;

import java.awt.*;
import java.awt.event.*;

public class MultiEventExample implements ActionListener, WindowListener {
    Frame f;
    Button b;

    public MultiEventExample() {
        f = new Frame("Multi-Event Example");
        b = new Button("Click Me");

        f.setSize(400, 400);
        f.setLayout(new FlowLayout());
        f.add(b);

        // Register this class as the listener
        b.addActionListener(this);
        f.addWindowListener(this);

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window is closing!");
        f.dispose();
        System.exit(0);
    }

    // Other window listener methods (empty implementations)
    @Override public void windowOpened(WindowEvent e) {}
    @Override public void windowClosed(WindowEvent e) {}
    @Override public void windowIconified(WindowEvent e) {}
    @Override public void windowDeiconified(WindowEvent e) {}
    @Override public void windowActivated(WindowEvent e) {}
    @Override public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new MultiEventExample();
    }
}

