package com.whatsapp.core.repository;

import com.whatsapp.core.model.Chat;
import com.whatsapp.core.model.Message;

import java.util.HashMap;
import java.util.Map;

public class ChatRepository {

    // Stores chatId -> Chat
    private Map<String, Chat> chatStore = new HashMap<>();

    // Create chat if not exists
    public Chat getOrCreateChat(String chatId) {
        if (!chatStore.containsKey(chatId)) {
            chatStore.put(chatId, new Chat(chatId));
        }
        return chatStore.get(chatId);
    }

    // Add message to a chat
    public void addMessage(String chatId, Message message) {
        Chat chat = getOrCreateChat(chatId);
        chat.addMessage(message);
    }

    // Get full chat history
    public Chat getChat(String chatId) {
        return chatStore.get(chatId);
    }
}
