package userinput;
import javax.swing.JOptionPane;;

public class Rectangle {
	public static void main(String[] args) {
		
		String bredde, h�jde;
		double areal;
		
		bredde = JOptionPane.showInputDialog("Bredde", "Indtast Bredde");
		h�jde = JOptionPane.showInputDialog("H�jde", "Indtast H�jde");
		areal = Double.parseDouble(bredde)*Double.parseDouble(h�jde);
		
		JOptionPane.showMessageDialog(null, areal, "Arealet p� rektanglen er", JOptionPane.INFORMATION_MESSAGE);
	}

}