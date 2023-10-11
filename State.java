package soc;

/**
 * The three possible states for a cell in the Forest-Fire model.
 */
public enum State {
	/**
	 * An empty cell having no tree and not burning.
	 */
	EMPTY,
	
	/**
	 * A cell having a tree and not burning.
	 */
	OCCUPIED,
	
	/**
	 * A cell having a burning tree.
	 */
	BURNING
}
