package com.example.InversionOfControlApplication;

public class SimpleMessageService implements EmailService{
    public void sendEmail(String message){
        System.out.println("Sending Email :"+ message);
    }
}
