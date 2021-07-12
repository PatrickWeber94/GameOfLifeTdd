package game.view;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class Grid extends JPanel {

	private static final long serialVersionUID = -3750350995067764816L;
	private List<Gridpoint> cells;

	public Grid() {
		cells = new ArrayList<>();
	}

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		for (Gridpoint filledCell : cells) {
			int cellX = 10 + (filledCell.getX() * ViewProperties.cellWidth);
			int cellY = 10 + (filledCell.getY() * ViewProperties.cellWidth);
			graphics.setColor(filledCell.getColor());
			graphics.fillRect(cellX, cellY, ViewProperties.cellWidth, ViewProperties.cellWidth);
		}
	}

	public void fillCell(Gridpoint point) {
		cells.add(point);
	}

	public void clear() {
		cells.clear();
	}

}
