package MenuElements;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabMenuExample {

	public static void main(String[] args) {
		JFrame frame=new JFrame("Hello Example");
		frame.setSize(400,300);
		frame.setLayout(new FlowLayout());
		
		JMenuBar menuBar=new JMenuBar();
		
		JMenu fileMenu=new JMenu("File");
		JMenu editMenu=new JMenu("Edit");
		
		

	
		JMenuItem newMenuItem=new JMenuItem("New");
		JMenuItem SaveMenuItem=new JMenuItem("Save");
		JMenuItem ExitMenuItem=new JMenuItem("Exit"); 
		
		JMenuItem firstItem=new JMenuItem("first");
		
		ExitMenuItem.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		
		fileMenu.add(newMenuItem);
		fileMenu.add(SaveMenuItem);
		fileMenu.addSeparator();
		fileMenu.add(ExitMenuItem);
		
		editMenu.add(firstItem);
		
		frame.add(menuBar);
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		
		 
		
		frame.setVisible(true);
		
				
		
		
	}

}
