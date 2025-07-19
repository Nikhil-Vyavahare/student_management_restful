package com.example.student_curd.Exceptions;


public class DataNotFoundException extends RuntimeException {

    public DataNotFoundException(String massage){
        super(massage);
    }
}
