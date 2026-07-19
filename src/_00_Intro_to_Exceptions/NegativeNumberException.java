package _00_Intro_to_Exceptions;

import javax.swing.JOptionPane;

public class NegativeNumberException extends Exception {
	public static void main(String[] args) {
		try {
			testPositive(-1);
		} catch (NegativeNumberException e) {
			e.scaryPopup();
			// TODO Auto-generated catch block
		} finally {
			JOptionPane.showMessageDialog(null, "you computer is okay");
		}

	}

	public void scaryPopup() {
		JOptionPane.showMessageDialog(null, "You have triggered a critical error in your laptop");
	}

	public static void testPositive(int num) throws NegativeNumberException {
		if (num < 0) {
			throw new NegativeNumberException();
		}
	}
}
