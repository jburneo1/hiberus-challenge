package com.hiberu.exception;


public class ModelNotFoundException extends RuntimeException{
    public ModelNotFoundException(String msg) {
        super(msg);
    }
}
