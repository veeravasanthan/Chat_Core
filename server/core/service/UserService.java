package com.whatsapp.core.service;

import com.whatsapp.core.model.User;
import com.whatsapp.core.repository.UserRepository;

public class UserService {
    private UserRepository repo = new UserRepository();

    public User register(String id, String name) {
        User user = new User(id, name);
        repo.save(user);
        return user;
    }

    public void login(String id) {
        User user = repo.findById(id);
        if (user != null) {
            user.setOnline(true);
        }
    }
}
