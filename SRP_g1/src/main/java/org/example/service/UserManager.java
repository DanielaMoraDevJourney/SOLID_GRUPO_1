package org.example.service;


import org.example.repository.UserRepository;
import org.example.validators.EmailValidator;
import org.example.validators.PasswordValidator;
public class UserManager {

    private final EmailValidator emailValidator;
    private final PasswordValidator passwordValidator;
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserManager() {
        this.emailValidator = new EmailValidator();
        this.passwordValidator = new PasswordValidator();
        this.userRepository = new UserRepository();
        this.emailService = new EmailService();
    }

    public void addUser(String email, String password) {

        boolean emailValido = emailValidator.isValid(email);
        boolean passwordValida = passwordValidator.isValid(password);

        if (!emailValido || !passwordValida) {
            System.out.println("Invalid email or password. User not added.");
            return;
        }

        // Si ambos son válidos:
        userRepository.save(email, password);
        emailService.sendWelcomeEmail(email);
    }
}