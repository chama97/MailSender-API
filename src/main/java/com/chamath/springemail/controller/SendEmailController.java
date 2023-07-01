package com.chamath.springemail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chamath.springemail.dto.EmailReqDTO;
import com.chamath.springemail.service.EmailService;
import com.chamath.springemail.util.ResponseUtil;

@RestController
@RequestMapping("api/v1/email")
@CrossOrigin(origins = "*")
public class SendEmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/send")
    public ResponseUtil sendEmail(@RequestBody EmailReqDTO emailReqDTO) {
        try {
           return emailService.sendEmail(emailReqDTO);
        } catch (Exception e) {
            return new ResponseUtil(500, e.getLocalizedMessage(), null);
        }
    }
    
}
