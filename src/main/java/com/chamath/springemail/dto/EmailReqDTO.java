package com.chamath.springemail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailReqDTO {
    private String email;
    private String subject;
    private String content;
}
