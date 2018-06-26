package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot ferb = new Robot();
	ferb.setSpeed(250);
	ferb.penDown();
	ferb.sparkle();
	int red = 0;
	int green = 125;
	int blue = 255;
	for(int x = 0; x < 4;) {
		ferb.setPenColor(red, green, blue);
		ferb.move(250);
	ferb.turn(90);
	x = x + 1;
	red = red + 75;
	green = green + 20;
	blue = blue - 75;
	}
	ferb.penUp();
	ferb.turn(-90);
	ferb.move(100);
	
	for(int x = 0; x < 1;) {
		ferb.turn(10);
	}
	}
	}

