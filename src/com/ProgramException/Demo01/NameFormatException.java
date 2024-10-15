package com.ProgramException.Demo01;

public class NameFormatException extends RuntimeException {
    public NameFormatException(){}
    public NameFormatException(String message){
        super(message);
    }
}
