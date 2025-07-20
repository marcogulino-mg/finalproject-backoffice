package com.marco.finalproject.finalproject_backoffice.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

// INFO: HTTP 404 IF MissingElementException is launched in a controller
@ResponseStatus(HttpStatus.NOT_FOUND)
public class MissingElementException extends RuntimeException {
    // Methods
    // Constructors
    public MissingElementException(String errorMessage) {
        super(errorMessage);
    }
}
