package com.chamath.springemail.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;
}
