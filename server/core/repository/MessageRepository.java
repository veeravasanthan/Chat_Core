package com.whatsapp.core.repository;

import com.whatsapp.core.model.Message;
import java.util.ArrayList;
import java.util.List;

public class MessageRepository {
    private List<Message> messages = new ArrayList<>();

    public void save(Message message) {
        messages.add(message);
    }

    public List<Message> findAll() {
        return messages;
    }
}
