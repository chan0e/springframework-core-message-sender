package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.annotation.ElapsedTimeLog;
import com.nhnacademy.edu.springframework.messagesender.sender.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageSendService {
    private MessageSender messageSender;

    @Value("${from}")
    private String from;

    @Autowired
    public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }



    public void doSendMessage() {
        User user = new User("nhnacademy@nhn.com", "01099999999");
        System.out.println("From : " + from);
        messageSender.sendMessage(user, "message");
    }

}
