package com.whatsapp.core.model;

import java.util.ArrayList;
import java.util.List;

public class Chat {
    private final String chatId;
    private final List<Message> messages = new ArrayList<>();

    public Chat(String chatId) {
        this.chatId = chatId;
    }

    public void addMessage(Message message) {
        messages.add(message);
    }

    public List<Message> getMessages() {
        return messages;
    }
}
