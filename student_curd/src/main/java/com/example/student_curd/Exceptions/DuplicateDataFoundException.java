package com.example.student_curd.Exceptions;

public class DuplicateDataFoundException extends RuntimeException{
    public DuplicateDataFoundException(String message){
        super(message);
    }
}
