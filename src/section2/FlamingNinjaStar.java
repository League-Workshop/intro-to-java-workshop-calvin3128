package section2;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
Robot ferb = new Robot();
ferb.penDown();
ferb.setSpeed(500);
ferb.setPenColor(100, 100, 255);
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		ferb.setX(400);
		ferb.setY(300);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10

		// 13. Use a for loop to repeat all of the code below 25 times
for(int x = 0; x < 25; x++){
			// 2. Turn the robot 1/8 of a circle
		ferb.turn(360/8);
			// 3. Move the robot 64 pixels
ferb.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			ferb.turn(-40);
			ferb.setPenColor(255, 50, 50);
			// 5. Move the robot the distance in the variable flameSize
			ferb.move(flameSize);
			// 6. Turn the robot 170 degrees
			ferb.turn(170);
			
			// 7. Move the robot the distance in the variable flameSize (again)
			ferb.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
			ferb.turn(64);
			ferb.setPenColor(100, 100, 255);
			// 9. Move the robot the distance in the variable baseSize
			ferb.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
			
}
	}

}


