package com.GreenSQA.exceptions;

public class GeneralExcepcion extends AssertionError {
    private static final long serialVersionUID =1L;
    public GeneralExcepcion (String message, Throwable cause){
        super(message, cause);
    }
}
