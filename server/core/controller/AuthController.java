package com.whatsapp.core.controller;

import com.whatsapp.core.service.UserService;

public class AuthController {
    private final UserService userService = new UserService();

    public void register(String id, String name) {
        userService.register(id, name);
    }

    public void login(String id) {
        userService.login(id);
    }
}
