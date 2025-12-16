package com.whatsapp.core.model;

import com.whatsapp.core.enums.MessageStatus;

public class Message {
    private String id;
    private String senderId;
    private String receiverId;
    private String content;
    private MessageStatus status;

    public Message(String id, String senderId, String receiverId, String content) {
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.status = MessageStatus.SENT;
    }

    public String getContent() { return content; }
    public MessageStatus getStatus() { return status; }
    public void setStatus(MessageStatus status) { this.status = status; }
}
