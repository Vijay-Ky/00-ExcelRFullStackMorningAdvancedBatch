package com.excelr.spring.boot.rest.crud.main.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler
{
    @ExceptionHandler
    //Add an exception handler using @ExceptionHandler
    public ResponseEntity<StudentErrorRespose> handleException(StudentNotFoundException ex)
    {
        //create a student error response
        StudentErrorRespose error = new StudentErrorRespose();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(ex.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        //return response entity
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    //add another exception handler to catch any exception(catch all)

    @ExceptionHandler
    public ResponseEntity<StudentErrorRespose> handleException (Exception ex)
    {
        StudentErrorRespose error = new StudentErrorRespose();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(ex.getMessage());
        error.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
}
