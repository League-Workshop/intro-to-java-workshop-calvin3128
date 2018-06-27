package section3;

import static javax.swing.JOptionPane.*;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
String who = showInputDialog("Mirror mirror on the wall, who here is the worst of all?");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		showMessageDialog(null, "Feelsbad. You actually have a crush on " + who + ".");
		// 3. Ask the user for the name of their best friend
String friend = showInputDialog("Who's your best friend?");
		// 4. Tell them their best friend is as sweet as candy
showMessageDialog(null, "Good choice! As a matter of fact, " + friend + " is as sweet as candy!");
	} 
}



