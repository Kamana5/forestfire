package soc;

/**
 * Thrown to indicate that a row or column index is out of range.
 */
public class ForestFireIndexException extends IndexOutOfBoundsException {

	private static final long serialVersionUID = 4962275759591344654L;

	/**
	 * Initializes an exception with no detail message.
	 */
	public ForestFireIndexException() {
		super();
	}

	/**
	 * Initializes an exception with the specified detail message.
	 * 
	 * @param msg the detail message
	 */
	public ForestFireIndexException(String msg) {
		super(msg);
	}
}
