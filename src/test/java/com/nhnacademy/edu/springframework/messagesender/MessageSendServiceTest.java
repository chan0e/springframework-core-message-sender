package com.nhnacademy.edu.springframework.messagesender;

import com.nhnacademy.edu.springframework.messagesender.sender.SmsMessageSender;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.util.ReflectionTestUtils;

@TestPropertySource("classpath:sender.properties")
public class MessageSendServiceTest {
    MessageSendService messageSendService;

    @Test
    void testMessageSendService() {
        ReflectionTestUtils.setField(messageSendService, "messageSender", new SmsMessageSender());
        messageSendService.doSendMessage();
    }
}