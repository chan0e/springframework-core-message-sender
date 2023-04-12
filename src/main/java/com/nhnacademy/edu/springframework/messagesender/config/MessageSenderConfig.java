package com.nhnacademy.edu.springframework.messagesender.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sender.properties")
@ComponentScan(basePackages = "com.nhnacademy.edu.springframework.messagesender")
@EnableAspectJAutoProxy
public class MessageSenderConfig {}
