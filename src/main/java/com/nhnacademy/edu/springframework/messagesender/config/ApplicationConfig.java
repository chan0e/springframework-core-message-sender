//package com.nhnacademy.edu.springframework.messagesender.config;
//
//import com.nhnacademy.edu.springframework.messagesender.MessageSendService;
//import com.nhnacademy.edu.springframework.messagesender.sender.EmailMessageSender;
//import com.nhnacademy.edu.springframework.messagesender.sender.MessageSender;
//import com.nhnacademy.edu.springframework.messagesender.sender.SmsMessageSender;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//
//@Configuration
//@PropertySource("classpath:sender.properties")
//public class ApplicationConfig {
//    private MessageSenderConfig messageSenderConfig;
//
//    public ApplicationConfig(MessageSenderConfig messageSenderConfig) {
//        this.messageSenderConfig = messageSenderConfig;
//    }
//
//    @Bean
//    public MessageSendService messageSendService() {
//        return new MessageSendService(messageSenderConfig.smsMessageSender());
//    }
//}
