package userinput;


import javax.swing.JOptionPane;
public class InputBoxes {
	public static void main(String[] args) {
		
		String first_name, family_name, full_name;
		
		first_name = JOptionPane.showInputDialog("First Name", "Enter your First Name");
		family_name = JOptionPane.showInputDialog("Family Name", "Enter your Family Name");
		full_name = "Welcome " + first_name + " " + family_name;
		
		JOptionPane.showMessageDialog(null,full_name, "Name", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}

}