package com.chamath.springemail.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.chamath.springemail.dto.EmailReqDTO;
import com.chamath.springemail.service.EmailService;
import com.chamath.springemail.util.ResponseUtil;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public ResponseUtil sendEmail(EmailReqDTO emailReqDTO) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("chamamanchanayake97@gmail.com");
            message.setTo(emailReqDTO.getEmail());
            message.setSubject(emailReqDTO.getSubject());
            message.setText(emailReqDTO.getContent());

            javaMailSender.send(message);

            return new ResponseUtil(200, "Email sent successfully", null);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Email sent Unsuccessfully");
        }
    }

}
