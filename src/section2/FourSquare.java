package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot ferb = new Robot();
	// 2. Create a new Robot

	void go() {
		// 4. Make the robot move as fast as possible
ferb.setSpeed(500);
		// 5. Set the pen width to 5
ferb.setPenWidth(5);
ferb.penDown();
		// 6. Use a for loop to repeat steps #7 to #8, four times...
for(int x = 0; x < 4; x++) {
ferb.setRandomPenColor();
drawSquare();
ferb.turn(90);
}
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method

			// 8. Turn the robot 90 degrees to the right

	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		ferb.move(50);
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



