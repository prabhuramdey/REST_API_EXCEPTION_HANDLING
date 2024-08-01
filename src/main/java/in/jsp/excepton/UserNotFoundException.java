package in.jsp.excepton;

public class UserNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -963156721218862031L;

	public UserNotFoundException() {

	}

	public UserNotFoundException(String msg) {
		super(msg);
	}
}
