package com.example.student_curd.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorResponse {
    
    LocalDateTime localDateTime;
    String errorMessage;
    String errorDitails;
    String errorCode;
    
    public ErrorResponse( String errorMessage, String errorDitails, String errorCode) {
        this.localDateTime = LocalDateTime.now();
        this.errorMessage = errorMessage;
        this.errorDitails = errorDitails;
        this.errorCode = errorCode;
    }
    
    
    

}
