package com.upc.chinoesquina.controller;

import com.upc.chinoesquina.model.ErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.xml.bind.ValidationException;
import java.sql.SQLException;

@ControllerAdvice
public class ExceptionHandlerController {
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ValidationException.class)
    ErrorException validationExceptionHandler(ValidationException e){
        return new ErrorException("400", e.getMessage());
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(SQLException.class)
    ErrorException databaseExceptionHandler(SQLException e){
        return new ErrorException("500", e.getMessage());
    }
}
