package aWTExample;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class ItemEventExample implements ItemListener{
Frame frame;
JCheckBox box;
public ItemEventExample() {
	frame=new Frame("This is frame");
    box=new JCheckBox();
    frame.setSize(400,400);
    frame.add(box);
    frame.addWindowListener(new WindowAdapter() {
    	public void windowClosing(WindowEvent e) {
    		System.out.println("Window is closed");
    		System.exit(0);
    	}
    });
    box.addItemListener(this);
    frame.setVisible(true);
}
public void itemStateChanged(ItemEvent e) {
	System.out.println("CheckBox status changed");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new ItemEventExample();
	}

}
