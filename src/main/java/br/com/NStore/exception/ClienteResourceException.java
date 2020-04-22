package br.com.NStore.exception;

public class ClienteResourceException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3772987385294133977L;

	public ClienteResourceException() {
    }

    public ClienteResourceException(String message) {
        super(message);
    }

    public ClienteResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClienteResourceException(Throwable cause) {
        super(cause);
    }

    public ClienteResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
