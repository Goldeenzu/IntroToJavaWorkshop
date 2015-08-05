package day3;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your favorite object");
		JOptionPane.showMessageDialog(null, answer + " is awesome!!!");
	}

}
