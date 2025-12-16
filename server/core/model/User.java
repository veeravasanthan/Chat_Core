package com.whatsapp.core.model;

public class User {
    private String id;
    private String name;
    private boolean online;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.online = false;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public boolean isOnline() { return online; }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
