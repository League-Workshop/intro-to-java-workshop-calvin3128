package section3;

import static javax.swing.JOptionPane.*;

public class Snooper {

	public static void main(String[] args) {
		String name = showInputDialog("What do you go by?");
		String feel = showInputDialog("How are you feeling?");
				showMessageDialog(null, "Hi " + feel + ", I'm Dad.");
				
		String address = showInputDialog("Where do you come from?");
		String future = showInputDialog("Where did you go?");
		String address2 = showInputDialog("Where did you come from?");
		showMessageDialog(null, "Cotton Eyed Joe");
		String car = showInputDialog("What car do you have?");
		String favorite = showInputDialog("Who is your favorite musician");
		showMessageDialog(null, "Hello, " + name + ". According to our very sophisticated neural network reliant human analysis engine, we have located your residence to be located at " + address + ".\n Your second estate is located at " + address2 + ". You seem like the type of person to drive with a " + car + " while listening to " + favorite + "'s newest album.\n Our completely accurate analysis database and neural network have calculated your future to involve a voyage to " + future + ".\n Also, you're predicted to be the very first human to ever land on Neptune. This will be at your prime age of 89. Sadly, your death will also occur here due to a failure of not reading the terms and services of that one iTunes update back in 2008.");
	}
	
	
	
}
