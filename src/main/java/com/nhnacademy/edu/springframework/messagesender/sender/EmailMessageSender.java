package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.stereotype.Component;

@Component
public class EmailMessageSender implements MessageSender {

    public  EmailMessageSender() {
        System.out.println("Create EmailMessageSender!");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " +  user.getEmail() + " : " + message);
    }
}
