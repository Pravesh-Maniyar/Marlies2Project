package com.Project.RecordNotFoundException;

public class RecordNotFoundExceptions extends Exception{
    public RecordNotFoundExceptions() {
    }

    public RecordNotFoundExceptions(String message) {
        super(message);
    }

    public RecordNotFoundExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public RecordNotFoundExceptions(Throwable cause) {
        super(cause);
    }

    public RecordNotFoundExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
