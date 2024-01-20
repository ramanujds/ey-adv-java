package com.mywebapp.service;

import com.mywebapp.model.Message;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MessageService {

    private static List<Message> messages = new ArrayList<>(Arrays.asList(
            new Message("Hello Sir", "John"),
            new Message("How are you?", "Jane"),
            new Message("I am fine", "John"),
            new Message("How about you?", "John")

    ));

    public List<Message> getAllMessages() {
        return messages;
    }

    public Message getMessage(String name) {
        return messages.stream().filter(m -> m.getName().equals(name)).findFirst().get();
    }

    public Message addMessage(Message message) {
        messages.add(message);
        return message;
    }

    public Message updateMessage(Message message) {
        if (message.getName().isEmpty()) {
            return null;
        }
        for (int i = 0; i < messages.size(); i++) {
            Message m = messages.get(i);
            if (m.getName().equals(message.getName())) {
                messages.set(i, message);
                return message;
            }
        }
        return null;
    }

    public Message removeMessage(String name) {
        Message message = messages.stream().filter(m -> m.getName().equals(name)).findFirst().get();
        messages.remove(message);
        return message;
    }



}
