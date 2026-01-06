package com.biadevcosta.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationsException extends RuntimeException {
    public UnsupportedMathOperationsException(String message) {
        super(message);
    }
}
