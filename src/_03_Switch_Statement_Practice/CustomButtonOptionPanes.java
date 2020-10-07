package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "One more day until sadness");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Sadness");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null, "PogO Java Class");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Back to sadness");
			break;
		case "Thurday":
			JOptionPane.showMessageDialog(null, "One more day until happiness");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null, "Happiness");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null, "Two more days until sadness");
			break;
			
		}
	}
}
