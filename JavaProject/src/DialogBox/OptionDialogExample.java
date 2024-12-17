package DialogBox;
import javax.swing.*;

public class OptionDialogExample {

	public static void main(String[] args) {
		Object[] options = {"Option 1", "Option 2", "Option 3"};
		int choice = JOptionPane.showOptionDialog(null, "Choose an option:", "Option Dialog",
		        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

		System.out.println("User chose: " + options[choice]);


	}

}
