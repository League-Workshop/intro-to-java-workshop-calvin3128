package section2;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		// 13. Set the speed to 8
robot.setSpeed(500);
		// 6. Make a variable to hold the X position of the Robot and set it to 10
int xpos = 10;
int rgb = 0;
		// 7. Make a variable to hold the Y position of the Robot and set it to 600
int ypos = 1000;
		// 8. Make a variable to hold the star size and set it to 25
int sizestar = 25;
		// 12. Use a for loop to repeat steps #19 to #18, 30 times
for(int x = 0; x < 30; x++) {
			// 19. Set the pen width to i 
robot.setPenWidth(x);	
			// 10. Set the X position of the robot to your X variable
robot.setX(xpos);
			// 11. Set the Y position of the robot to your Y variable
robot.setY(ypos);
			// 9. Call the drawStar() method with your star size variable
	drawStar(sizestar);
			// 14. Increase the value of the X position variable by star size. See Figure 2
	xpos = xpos  + sizestar;
			// 15. decrease the value of the Y position variable by star size. See Figure 3
	ypos = ypos - sizestar;
			// 16. Increase the star size by 20
	sizestar = sizestar + 20;
			// 17. Turn the robot 12 degrees
	robot.turn(12);
			// 18. Make each star a different random color like in Figure 4
	robot.setPenColor(rgb, rgb, rgb);
	rgb = rgb + 25;
	
}
	}

	private void drawStar(int sizestar) {
		// 2. Put the robot's pen down
robot.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at http://bit.ly/star-show
for(int x = 0; x < 5; x++) {
			// 1. Move the robot the distance of the starSize variable
	robot.move(sizestar);
			// 3. Turn the robot 144 degrees
			robot.turn(144);
}
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}



