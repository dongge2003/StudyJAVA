package com.ProgramException.Demo01;

public class AgeFormatException extends RuntimeException {
    public AgeFormatException() {}
    public AgeFormatException(String message) {
        super(message);
    }
}
