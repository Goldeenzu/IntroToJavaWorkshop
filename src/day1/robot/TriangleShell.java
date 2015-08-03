package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot stuff = new Robot();

	
	void go() {
		drawTriangle(100); // 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		stuff.setSpeed(10);

		// 4. make a variable to hold the length of the triangle and set it to 50
		int drawTriangle = (60);

		// 7. Do the following (up to step 10) 60 times
		for (int i = 0; i <60; i++) {
			

			// 9. Change the color of the pen to a random color
			stuff.setRandomPenColor();
	
			// 8. Increase the length of the side by 10 pixels
	
			// 5. call your drawTriangle() method using your length variable
		drawTriangle(drawTriangle);
	
			// 10. Turn the tortoise 6 degrees to the righ
		stuff.turn(60);
		
		}

	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int size) {
		for (int i = 0; i <3; i++) {
			stuff.penDown();
			stuff.move(size);
			stuff.turn(120);
		}
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
