package br.com.NStore.exception;

public class ProdutoResourceException extends Exception{
    public ProdutoResourceException() {
    }

    public ProdutoResourceException(String message) {
        super(message);
    }

    public ProdutoResourceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProdutoResourceException(Throwable cause) {
        super(cause);
    }

    public ProdutoResourceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
