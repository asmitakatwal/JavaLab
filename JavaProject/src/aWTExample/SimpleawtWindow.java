package aWTExample;

import java.awt.Frame;

public class SimpleawtWindow {
    public static void main(String[] args) {
       
        Frame frame = new Frame("Simple AWT Window");

        // Set the size of the window
        frame.setSize(300, 200);

        // Make the window visible
        frame.setVisible(true);

       
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent we) {
                System.exit(0);
            }
        });

    }
}
