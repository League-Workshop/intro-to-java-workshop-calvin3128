package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot ferb = new Robot();
		// 5. Set your robot's pen down 
		ferb.penDown();
		// 3. Set the robot to go at max speed (100)
		ferb.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int x = 0; x < 75; x++) {
			
			// 7. Change the pen color to random
			ferb.setRandomPenColor();
			
			// 6. Move the robot 5 times the loop counter (5*i)
			ferb.move(5*x);
			
			// 2. Turn the robot 360/7 degrees to the right
			ferb.turn(360/7);
			
			// 8. Set the pen width to i
		ferb.setPenWidth(x);
		
	}
	}
}
