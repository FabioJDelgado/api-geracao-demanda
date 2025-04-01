package com.faculdade.apigeracaodemanda.exceptions.handler;

import com.faculdade.apigeracaodemanda.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.List;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionListResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex, WebRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;

        List<ErroInfo> errors = ex
                .getBindingResult()
                .getFieldErrors()
                .stream()
                .map(fieldError -> new ErroInfo(fieldError.getField(), fieldError.getDefaultMessage()))
                .toList();

        ExceptionListResponse exceptionListResponse = new ExceptionListResponse(
            new Date(),
            status.value(),
            "Erro de validação de dados",
            ex.getMessage(),
            request.getDescription(false),
            errors
        );

        return ResponseEntity.status(status).body(exceptionListResponse);
    }

    @ExceptionHandler(DadosInconsistentesException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestExceptions(DadosInconsistentesException ex, WebRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(),
                status.value(),
                "Dados inconsistentes",
                ex.getMessage(),
                request.getDescription(false)
        );
        return ResponseEntity.status(status).body(exceptionResponse);
    }

    @ExceptionHandler(RecursoNaoEncontradoException.class)
    public final ResponseEntity<ExceptionResponse> handleResourceNotFoundExceptions(RecursoNaoEncontradoException ex, WebRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(),
                status.value(),
                "Recurso não encontrado",
                ex.getMessage(),
                request.getDescription(false)
        );
        return ResponseEntity.status(status).body(exceptionResponse);
    }

    /*@ExceptionHandler(RuntimeException.class)
    public final ResponseEntity<ExceptionResponse> handleAllExceptions(RuntimeException ex, WebRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;

        ExceptionResponse exceptionResponse = new ExceptionResponse(
                new Date(),
                status.value(),
                "Erro interno no servidor",
                ex.getMessage(),
                request.getDescription(false)
        );

        return ResponseEntity.status(status).body(exceptionResponse);
    }*/
}
