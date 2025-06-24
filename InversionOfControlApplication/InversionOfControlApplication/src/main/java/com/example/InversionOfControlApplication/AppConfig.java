package com.example.InversionOfControlApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public EmailService emailService() {
        return new SimpleMessageService(); // make sure class name matches
    }

    @Bean
    public MessageService messageService() {
        return new MessageService(emailService());
    }
}
