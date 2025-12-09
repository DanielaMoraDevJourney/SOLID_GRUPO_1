package org.example.validators;

public class PasswordValidator {

    private static final int MIN_LENGTH = 8;

    public boolean isValid(String password) {
        if (password == null) return false;
        return password.length() >= MIN_LENGTH;
    }
}