package section3;

import static javax.swing.JOptionPane.*;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String code = showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if(code.equalsIgnoreCase("yes")||code.equalsIgnoreCase("yeah")||code.equalsIgnoreCase("of course")||code.equalsIgnoreCase("yeet")) {
	showMessageDialog(null, "You're going to leave earth and rule Mars.");
	
} 
else {
	showMessageDialog(null, "Have fun taking my order at McDonald's");
}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}

