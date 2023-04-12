package com.nhnacademy.edu.springframework.messagesender;

public class User {
    private final String email;
    private final String PhoneNumber;

    public User(String email, String phoneNumber) {
        this.email = email;
        this.PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
