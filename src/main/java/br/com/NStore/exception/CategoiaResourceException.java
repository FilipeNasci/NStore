package br.com.NStore.exception;

public class CategoiaResourceException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -708713247625728586L;

	public CategoiaResourceException() {
    }

    public CategoiaResourceException(String message) {
        super(message);
    }

    public CategoiaResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public CategoiaResourceException(Throwable cause) {
        super(cause);
    }

    public CategoiaResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
