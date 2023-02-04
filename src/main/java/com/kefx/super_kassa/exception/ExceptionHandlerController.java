package com.kefx.super_kassa.exception;

import com.kefx.super_kassa.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionHandlerController extends ResponseEntityExceptionHandler {

    @ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ExceptionDto> entityNotFound(EntityNotFoundException e) {
        return createResponseEntity(e, HttpStatus.I_AM_A_TEAPOT);
    }

    private ResponseEntity<ExceptionDto> createResponseEntity(Exception e,HttpStatus status) {
        return ResponseEntity
                .status(status)
                .body(new ExceptionDto(e.getMessage(), status.value()));
    }
}