package com.example.Car_Management.Exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
public class ErrorDetails {
    private String message;
    private LocalDateTime timestamp;


}
