package br.com.NStore.exception;

public class CategoriaNotFoundException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = -972046859318711829L;

	public CategoriaNotFoundException() {
    }

    public CategoriaNotFoundException(String message) {
        super(message);
    }

    public CategoriaNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public CategoriaNotFoundException(Throwable cause) {
        super(cause);
    }

    public CategoriaNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
