package com.whatsapp.core.repository;

import com.whatsapp.core.model.User;
import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    private final Map<String, User> users = new HashMap<>();

    public void save(User user) {
        users.put(user.getId(), user);
    }

    public User findById(String id) {
        return users.get(id);
    }
}
