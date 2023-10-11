package soc;

import princeton.introcs.StdDraw;

/**
 * Draws a ForestFire automaton as a regular grid of square cells. Empty cells
 * are colored in black, trees are colored in green, and burning cells are
 * colored in red.
 * 
 * {@code Viewer.init} should be called once to set the aspect ratio of the
 * image before calling {@code Viewer.draw}.
 */
public class Viewer {
	/**
	 * The maximum side length of the image in pixels. If the ForestFire has more
	 * columns than rows then the image is {@code MAX_LENGTH} pixels wide, otherwise
	 * it is {@code MAX_LENGTH} pixels tall.
	 */
	public static final int MAX_LENGTH = 600;

	/**
	 * Sets the aspect ratio of the image. Users should call {@code Viewer.init}
	 * once before calling {@code Viewer.draw}.
	 * 
	 * @param cells the cells of the ForestFire
	 */
	public static void init(State[][] cells) {
		int rows = ForestFire.rowsIn(cells);
		int cols = ForestFire.colsIn(cells);
		if (rows == 0 || cols == 0) {
			throw new IllegalArgumentException();
		}
		if (rows < cols) {
			StdDraw.setCanvasSize(MAX_LENGTH, rows * MAX_LENGTH / cols);
		} else {
			StdDraw.setCanvasSize(cols * MAX_LENGTH / rows, MAX_LENGTH);
		}
	}

	
	/**
	 * Draws a ForestFire.
	 * 
	 * @param cells the cells of a ForestFire automaton
	 */
	public static void draw(State[][] cells) {
		int rows = ForestFire.rowsIn(cells);
		int cols = ForestFire.colsIn(cells);

		StdDraw.setXscale(0, cols);
		StdDraw.setYscale(0, rows);
		StdDraw.clear(StdDraw.BLACK);

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (cells[r][c] == State.OCCUPIED) {
					StdDraw.setPenColor(StdDraw.GREEN);
					StdDraw.filledSquare(c + 0.5, rows - r - 0.5, 0.5);
				} else if (cells[r][c] == State.BURNING) {
					StdDraw.setPenColor(StdDraw.RED);
					StdDraw.filledSquare(c + 0.5, rows - r - 0.5, 0.5);
				}
			}
		}
		StdDraw.show(50);
	}

	/**
	 * Demonstration program that draws a random ForestFire.
	 *  
	 * @param args not used
	 */
	public static void main(String[] args) {
		State c[][] = new State[50][100];
		// ForestFire.fill(c, State.OCCUPIED);
		ForestFire.checkerBoard(c);
		// ForestFire.randomize(0.5, 0.01, c);
		Viewer.init(c);
		Viewer.draw(c);
	}
	/**
     * Updates {@code cells} so that it is equal to the next generation of cells.
     * 
     * <p>
     * See the assignment document for details.
     * 
     * @param cells the cells of a Forest-fire model
     */
    public static void update(State[][] cells) {
        State[][] copy = ForestFire.copy(cells);
        	
    }
}
