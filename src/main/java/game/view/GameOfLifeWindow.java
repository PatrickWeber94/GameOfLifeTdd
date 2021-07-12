package game.view;

import javax.swing.JFrame;

public class GameOfLifeWindow extends JFrame {

	private static final long serialVersionUID = -6455776789647073154L;

	public GameOfLifeWindow(Grid grid) {
		JFrame window = new JFrame();
		window.setSize(ViewProperties.windowWidth, ViewProperties.windowHeigth);
		window.setDefaultCloseOperation(ViewProperties.defaultCloseOperation);
		window.add(grid);
		window.setVisible(true);
	}

}
