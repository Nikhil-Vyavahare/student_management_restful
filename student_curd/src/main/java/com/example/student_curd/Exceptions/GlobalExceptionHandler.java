package com.example.student_curd.Exceptions;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.example.student_curd.entity.ErrorResponse;




@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DataNotFoundException.class)
    public ResponseEntity<?> handelDataNotFound(DataNotFoundException dnfex , WebRequest webRequest){
        ErrorResponse errorResponse = new ErrorResponse(dnfex.getMessage(),webRequest.getDescription(false),"DATA NOT FOUND");
        return new  ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DuplicateDataFoundException.class)
    public ResponseEntity<?> handlDuplicateData(DuplicateDataFoundException ddfex,WebRequest webRequest){
        ErrorResponse errorResponse = new ErrorResponse(ddfex.getMessage(),webRequest.getDescription(false),"DUPLICATE DATA FOUND");
        return new  ResponseEntity<>(errorResponse,HttpStatus.CONFLICT);
    }

}




