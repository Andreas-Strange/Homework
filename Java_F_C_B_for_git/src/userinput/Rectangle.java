package userinput;
import javax.swing.JOptionPane;;

public class Rectangle {
	public static void main(String[] args) {
		
		String bredde, højde;
		double areal;
		
		bredde = JOptionPane.showInputDialog("Bredde", "Indtast Bredde");
		højde = JOptionPane.showInputDialog("Højde", "Indtast Højde");
		areal = Double.parseDouble(bredde)*Double.parseDouble(højde);
		
		JOptionPane.showMessageDialog(null, areal, "Arealet på rektanglen er", JOptionPane.INFORMATION_MESSAGE);
	}

}