package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
 public static void main(String[] args) {
	String Bday=JOptionPane.showInputDialog("What is your birthday?");
	if (Bday.equals("9,3")) {
		JOptionPane.showMessageDialog(null, "Happy birthday!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Merry unbirthday!");
	}
   }

}
