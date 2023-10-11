package soc;

public class RunForestFire {

	/**
	 * Visualizes 1000 iterations of the Forest-fire model.
	 *  
	 * @param args not used
	 */
	public static void main(String[] args) {
		State c[][] = new State[50][100];
		ForestFire.fill(c, State.OCCUPIED);
		// ForestFire.checkerBoard(c);
		// ForestFire.randomize(0.25, 0.01, c);
		
		Viewer.init(c);
		for (int t = 0; t < 1000; t++) {
			Viewer.draw(c);
			ForestFire.update(c);
		}
	}
}
