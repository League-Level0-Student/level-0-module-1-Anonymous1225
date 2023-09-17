package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String awnser1 = JOptionPane.showInputDialog(null, "I have no lung but I need to breath.=, if I touch water I die, what am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (awnser1.equals("fire")) {
	JOptionPane.showMessageDialog(null, "DING! Correct!");
	score +=1;
}
else {
	JOptionPane.showMessageDialog(null, "ERRR! Incorrect.");
	score -=1;
}
String awnser2 = JOptionPane.showInputDialog(null,"I am easy to lift but hard to throw what am I?");
if (awnser2.equals("A feather")) {
	JOptionPane.showMessageDialog(null, "DING! Correct!");
	score +=1;
}
else {
	JOptionPane.showMessageDialog(null, "ERRR! Incorrect.");
	score -=1;
}
String awnser3 = JOptionPane.showInputDialog("An electric train is heading east at 400 mph. How fast will the smoke blow?");
if (awnser3.equals("No smoke")) {
	JOptionPane.showMessageDialog(null, "DING! Correct!");
	score +=1;
}
else {
	JOptionPane.showMessageDialog(null, "ERRR! Incorrect.");
	score -=1;
}
String awnser4 = JOptionPane.showInputDialog("Kids can make it but never hold it or see it. What is it");
if (awnser4.equals("Noise")) {
	JOptionPane.showMessageDialog(null, "DING! Correct!");
	score +=1;
}
else {
	JOptionPane.showMessageDialog(null, "ERRR! Incorrect.");
	score -=1;

}
// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

