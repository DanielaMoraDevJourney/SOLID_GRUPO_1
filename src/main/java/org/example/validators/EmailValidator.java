package org.example.validators;

import java.util.regex.Pattern;

public class EmailValidator {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";

    public boolean isValid(String email) {
        if (email == null) return false;
        return Pattern.matches(EMAIL_REGEX, email);
    }
}
