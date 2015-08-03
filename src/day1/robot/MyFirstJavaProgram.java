package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot r2d2 = new Robot();
r2d2.penDown();
r2d2.setPenColor(100, 0, 155);
for (int i = 0; i <4; i++) {
r2d2.move(250);
r2d2.turn(90);
}
r2d2.turn(180);
for (int i = 0; i <4; i++) {
	
}
	}
}
