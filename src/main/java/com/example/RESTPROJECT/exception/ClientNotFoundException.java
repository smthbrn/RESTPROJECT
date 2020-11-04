package com.example.RESTPROJECT.exception;

public class ClientNotFoundException extends Throwable {
    private long book_id;

    public ClientNotFoundException(long client_id) {
        super(String.format("Client is not found with id : '%s'", client_id));
    }
}