package GUIApplications;


import javax.swing.*;
import java.awt.event.*;

public class TextEditorApp extends JFrame implements ActionListener {
    private JTextArea textArea;
    private JMenuItem selectAll, cut, copy, paste, exit;

    
    private static final long serialVersionUID = 1L;

    public TextEditorApp() {
        setTitle("Menu Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setLayout(null); // Set layout to null for absolute positioning

        textArea = new JTextArea();
        textArea.setBounds(20, 20, 550, 300); // Set bounds for text area
        add(textArea);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu editMenu = new JMenu("Edit");

        // Create menu items
        selectAll = new JMenuItem("Select All");
        cut = new JMenuItem("Cut");
        copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        exit = new JMenuItem("Exit");

        // Add menu items to menu
        editMenu.add(selectAll);
        editMenu.add(cut);
        editMenu.add(copy);
        editMenu.add(paste);
        editMenu.addSeparator(); // Adds a separator line
        editMenu.add(exit);

        // Add menu to menu bar
        menuBar.add(editMenu);

        // Set menu bar to frame
        setJMenuBar(menuBar);

        // Add action listeners to menu items
        selectAll.addActionListener(this);
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);

        // Make frame visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == selectAll) {
            textArea.selectAll();
        } else if (e.getSource() == cut) {
            textArea.cut();
        } else if (e.getSource() == copy) {
            textArea.copy();
        } else if (e.getSource() == paste) {
            textArea.paste();
        } else if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TextEditorApp(); // Correct class instantiation
    }
}
