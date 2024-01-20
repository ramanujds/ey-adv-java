package com.mywebapp.model;





public class Message {

private String message;
private String name;

    public Message(String message, String name) {
        this.message = message;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Message() {

    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {

            return "Message{" +
                    "message='" + message + '\'' +
                    ", name='" + name + '\'' +
                    '}';
    }
}
