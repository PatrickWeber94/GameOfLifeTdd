package game.view;

import java.awt.Color;

import javax.swing.JFrame;

public interface ViewProperties {

	Color livingCellColor = Color.BLACK;
	Color deadCellColor = Color.LIGHT_GRAY;
	int windowWidth = 840;
	int windowHeigth = 560;
	int defaultCloseOperation = JFrame.EXIT_ON_CLOSE;
	int cellWidth = 5;

}
