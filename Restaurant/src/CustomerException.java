

public class CustomerException extends Exception {

	private static final long serialVersionUID = 5021356663416263291L;

	public CustomerException() {
		super();
	}

	public CustomerException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public CustomerException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CustomerException(String arg0) {
		super(arg0);
	}

	public CustomerException(Throwable arg0) {
		super(arg0);
	}

}
