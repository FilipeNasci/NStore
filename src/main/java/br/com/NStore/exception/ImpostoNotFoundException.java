package br.com.NStore.exception;

public class ImpostoNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1091522906493746273L;

	public ImpostoNotFoundException() {
    }

    public ImpostoNotFoundException(String message) {
        super(message);
    }

    public ImpostoNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ImpostoNotFoundException(Throwable cause) {
        super(cause);
    }

    public ImpostoNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
