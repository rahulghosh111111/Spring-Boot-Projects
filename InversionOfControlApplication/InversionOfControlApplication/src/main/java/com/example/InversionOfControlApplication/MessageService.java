package com.example.InversionOfControlApplication;

public class MessageService {
    private final EmailService emailService;

    public MessageService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void send(String message) {
        emailService.sendEmail(message);
    }
}
