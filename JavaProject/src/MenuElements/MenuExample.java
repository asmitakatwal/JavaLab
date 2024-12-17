package MenuElements;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample{
	public static void main(String[] args) {
		JFrame frame=new JFrame("Menu Example");
		frame.setSize(300,200);
		
		frame.setLayout(new FlowLayout());
		
		JMenuBar menuBar=new JMenuBar();
		
		JMenu fileMenu=new JMenu("file");
		JMenu editMenu=new JMenu("edit");
		JMenu helpMenu=new JMenu("help");
		
		JMenuItem newItem=new JMenuItem("New");
		JMenuItem openItem=new JMenuItem("open");
		JMenuItem exitItem=new JMenuItem("Exit");
		
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator();
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		frame.add(menuBar);
		
		frame.setVisible(true);
		
		
	}
	
}