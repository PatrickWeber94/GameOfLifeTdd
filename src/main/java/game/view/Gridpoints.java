package game.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gridpoints implements Iterable<Gridpoint> {

	private List<Gridpoint> gridpoints = new ArrayList<Gridpoint>();

	public Gridpoints() {
		gridpoints.add(new Gridpoint(10, 10, ViewProperties.livingCellColor));
	}

	@Override
	public Iterator<Gridpoint> iterator() {
		return gridpoints.iterator();
	}

}