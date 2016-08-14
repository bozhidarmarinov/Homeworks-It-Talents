
public class WaiterException extends Exception {

	private static final long serialVersionUID = -7088463210424193691L;

	public WaiterException() {
		super();
	}

	public WaiterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WaiterException(String message, Throwable cause) {
		super(message, cause);
	}

	public WaiterException(String message) {
		super(message);
	}

	public WaiterException(Throwable cause) {
		super(cause);
	}

}
