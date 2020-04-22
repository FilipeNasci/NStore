package br.com.NStore.exception;

public class ImpostoResourceException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8146368522081359774L;

	public ImpostoResourceException() {
    }

    public ImpostoResourceException(String message) {
        super(message);
    }

    public ImpostoResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImpostoResourceException(Throwable cause) {
        super(cause);
    }

    public ImpostoResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
