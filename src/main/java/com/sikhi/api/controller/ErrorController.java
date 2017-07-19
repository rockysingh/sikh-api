package com.sikhi.api.controller;

import com.sikhi.api.exception.ErrorResponse;
import com.sikhi.api.exception.ResultNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(ResultNotFoundException.class)
    @ResponseStatus(value= HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorResponse requestHandlingNoHandlerFound(ResultNotFoundException e) {
        return new ErrorResponse(HttpStatus.NOT_FOUND.value(),e.getMessage());
    }


    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse requestHandlingNoHandlerFound(IllegalArgumentException e) {
        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(),e.getMessage());
    }
}
