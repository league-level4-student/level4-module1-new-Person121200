package _02_Intro_To_Abstract_Classes_and_Interfaces;

import javax.swing.JOptionPane;

public class AbstractExtension extends AbstractClassDemo{
	int hello;
	int hello1;
	@Override
	public void abstractDemo() {
		JOptionPane.showMessageDialog(null, getClass());
	}

	public int abstractNumDemo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
