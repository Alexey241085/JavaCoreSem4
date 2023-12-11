package org.example;

public class InsufficientFundsException extends Exception {

    InsufficientFundsException(String message) {
        super(message);
    }
}
