package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Liam = "Good at math";
String Thatonekidthatanimateslegos = "He animated the lego scene in spoderverse";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("Name some one");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equals("14")) {
	JOptionPane.showMessageDialog(null, Thatonekidthatanimateslegos);
}
if (name.equals("Liam")) {
	JOptionPane.showMessageDialog(null, Liam);
}

	}
}

