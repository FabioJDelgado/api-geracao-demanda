package com.faculdade.apigeracaodemanda.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DadosInconsistentesException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DadosInconsistentesException(String message) {
        super(message);
    }
}