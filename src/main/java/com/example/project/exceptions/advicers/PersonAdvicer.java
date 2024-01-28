package com.example.project.exceptions.advicers;

import com.example.project.exceptions.PersonNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PersonAdvicer {

    @ResponseBody
    @ExceptionHandler(PersonNotFound.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String personNotFoundHandler(PersonNotFound ex) { return ex.getMessage(); }
}
