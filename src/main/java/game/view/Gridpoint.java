package game.view;

import java.awt.Color;

public class Gridpoint {

	private Color color;
	private int positionX;
	private int positionY;

	public Gridpoint(int x, int y, Color color) {
		positionX = x;
		positionY = y;
		this.color = color;
	}

	public int getX() {
		return positionX;
	}

	public int getY() {
		return positionY;
	}

	public Color getColor() {
		return color;
	}

}
