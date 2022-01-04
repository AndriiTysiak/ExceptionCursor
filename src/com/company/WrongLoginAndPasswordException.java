package com.company;

public class WrongLoginAndPasswordException extends Exception {
    public WrongLoginAndPasswordException(String message) {
        super(message);
    }
}
