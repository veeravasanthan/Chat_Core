package com.whatsapp.core.service;

import com.whatsapp.core.model.Message;
import com.whatsapp.core.repository.ChatRepository;
import com.whatsapp.core.repository.MessageRepository;

public class MessageService {

    private final MessageRepository messageRepo = new MessageRepository();
    private ChatRepository chatRepo = new ChatRepository();

    public Message sendMessage(String id, String sender, String receiver, String text) {

        Message message = new Message(id, sender, receiver, text);

        // Store globally (optional)
        messageRepo.save(message);

        // Generate chatId (simple rule)
        String chatId = sender.compareTo(receiver) < 0
                ? sender + "_" + receiver
                : receiver + "_" + sender;

        // Store inside chat
        chatRepo.addMessage(chatId, message);

        return message;
    }
}
