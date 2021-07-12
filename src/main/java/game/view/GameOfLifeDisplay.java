package game.view;

public class GameOfLifeDisplay implements Display {

	private Grid grid;

	public GameOfLifeDisplay() {
		grid = new Grid();
		new GameOfLifeWindow(grid);
	}

	@Override
	public void update(Gridpoints gridpoints) {
		grid.clear();

		for (Gridpoint gridPoint : gridpoints) {
			grid.fillCell(gridPoint);
		}

		grid.repaint();
	}
}
