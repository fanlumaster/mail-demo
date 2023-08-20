package com.fanyfull.maildemo.util;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailUtilServiceImplTest {

    @Resource
    private EmailUtilService emailUtilService;

    @Test
    void sendSimpleMail() {
        String to = "xxx@gmail.com"; // replace with your own email
        String subject = "spring mail test";
        String content = "This is an email from spring-mail, just a test.";
        emailUtilService.sendSimpleMail(to, subject, content);
    }
}