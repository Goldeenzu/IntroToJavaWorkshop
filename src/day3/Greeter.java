package day3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Do you like waffles?");
			JOptionPane.showMessageDialog(null, answer + " sucker");
}
}
