package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		Robot steven = new Robot();
		steven.setSpeed(20);
		for (int i = 0; i <120; i++) {
		steven.move(5*i);
		steven.turn(120);
		steven.setPenWidth(i);
		
		}

	}
}
