package com.example.Car_Management.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
@RestControllerAdvice
public class GeneralExceptionHandler extends  ResponseEntityExceptionHandler {
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleUserNotFound(Exception ex, WebRequest request) throws Exception {
        ErrorDetails errorDetails = new ErrorDetails(ex.getMessage(), LocalDateTime.now());
        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);

    }
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public final ResponseEntity<Object> handleArgumentException(MethodArgumentNotValidException ex) throws Exception {
//        String message=ex.getBindingResult().getFieldError().getDefaultMessage();
//        ErrorDetails errorDetails = new ErrorDetails(message,LocalDateTime.now());
//        return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
//
//    }
}