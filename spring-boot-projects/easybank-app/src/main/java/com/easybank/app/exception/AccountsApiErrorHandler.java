package com.easybank.app.exception;

import com.easybank.app.dto.ErrorResponseDto;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class AccountsApiErrorHandler {

    @ExceptionHandler(AccountNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ErrorResponseDto handleAccountNotFoundException(Exception ex, HttpServletRequest request){
        ErrorResponseDto response = new ErrorResponseDto();
        HttpStatus status = HttpStatus.NOT_FOUND;
        response.setStatus(status.value());
        response.setError(status.getReasonPhrase());
        response.setMessage(ex.getMessage());
        response.setTimestamp(LocalDateTime.now());
        response.setPath(request.getRequestURI());
        return response;
    }

}
