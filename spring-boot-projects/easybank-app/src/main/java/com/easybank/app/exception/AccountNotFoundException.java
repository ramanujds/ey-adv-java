package com.easybank.app.exception;

public class AccountNotFoundException extends RuntimeException {

    public AccountNotFoundException(String message){
        super(message);
    }

}
