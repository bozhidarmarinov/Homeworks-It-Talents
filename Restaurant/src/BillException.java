
public class BillException extends Exception {

	private static final long serialVersionUID = 8590982675564405704L;

	public BillException() {
		super();
	}

	public BillException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BillException(String message, Throwable cause) {
		super(message, cause);
	}

	public BillException(String message) {
		super(message);
	}

	public BillException(Throwable cause) {
		super(cause);
	}

}
