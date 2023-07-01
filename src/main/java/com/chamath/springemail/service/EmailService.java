package com.chamath.springemail.service;

import com.chamath.springemail.dto.EmailReqDTO;
import com.chamath.springemail.util.ResponseUtil;

public interface EmailService {

    ResponseUtil sendEmail(EmailReqDTO emailReqDTO);
        
}