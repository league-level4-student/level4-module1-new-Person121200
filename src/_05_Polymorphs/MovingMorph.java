package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{
	Random rand = new Random();
	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		int temp = rand.nextInt(2);
		if (x >= 0 && x < PolymorphWindow.WIDTH && y >= 0 && y < PolymorphWindow.HEIGHT) {
			if(temp == 0) {
				x += rand.nextInt(5);
				y += rand.nextInt(5);
			}
			if (temp == 1) {
				x -= rand.nextInt(5);
				y -= rand.nextInt(5);
			}
		}
		else {
			x=100;
			y=100;
		}
		
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y,width, height);
	}

}
