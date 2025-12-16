package com.whatsapp.core.controller;

import com.whatsapp.core.service.MessageService;

public class ChatController {
    private final MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String id, String from, String to, String text) {
        messageService.sendMessage(id, from, to, text);
    }
}
