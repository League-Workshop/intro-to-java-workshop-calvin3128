package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot ferb = new Robot();
Robot guido = new Robot();
	int bright = 0;
	void go() {

		// 6. Make the robot go as fast as possible
ferb.setSpeed(500);
guido.setSpeed(500);
ferb.penDown();
guido.penDown();
ferb.hide();
guido.hide();
guido.sparkle();
ferb.sparkle();
guido.setX(1000);
ferb.setY(750);
guido.setY(750);

		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for(int x = 0; x < 60; x++) {
			// 9. Change the color of the pen to a random color
ferb.setPenColor(bright, 255, bright);

guido.setPenColor(bright, 255, bright);
bright = bright + 4;
			// 8. Increase the length variable by 10
	length = length + 10;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
	ferb.turn(6);
	guido.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		
		for(int x = 0; x < 3;x++) {
			ferb.move(length);
			ferb.turn(120);
			guido.move(length*2);
			guido.turn(120);
		}
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
