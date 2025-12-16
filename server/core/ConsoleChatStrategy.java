package com.whatsapp.core.ui;

import com.whatsapp.core.controller.AuthController;
import com.whatsapp.core.controller.ChatController;

import java.util.Scanner;

public class ConsoleChatStrategy implements UIInteractionStrategy {

    private AuthController authController;
    private ChatController chatController;

    public ConsoleChatStrategy(AuthController authController,
                               ChatController chatController) {
        this.authController = authController;
        this.chatController = chatController;
    }

    @Override
    public void start() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Chatify Console UI ===");

        System.out.print("Enter your userId: ");
        String userId = sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        authController.register(userId, name);
        authController.login(userId);

        while (true) {
            System.out.print("\nSend To (userId): ");
            String receiver = sc.nextLine();

            System.out.print("Message (type exit to quit): ");
            String text = sc.nextLine();

            if ("exit".equalsIgnoreCase(text)) break;

            chatController.sendMessage(
                    "msg-" + System.currentTimeMillis(),
                    userId,
                    receiver,
                    text
            );
        }

        System.out.println("Chat ended.");
        sc.close();
    }
}
