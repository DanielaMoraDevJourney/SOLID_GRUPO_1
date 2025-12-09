package org.example;

import org.example.service.UserManager;
public class Main {
    public static void main(String[] args) {

        UserManager userManager = new UserManager();

        // Caso válido
        userManager.addUser("example@domain.com", "password123");

        // Caso email inválido
        userManager.addUser("invalid-email", "password123");

        // Caso password inválida
        userManager.addUser("example@domain.com", "1234");

        // Ambos inválidos
        userManager.addUser("bad-email", "123");
    }
}