package com.project.coches.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.Map;

@RestControllerAdvice
public class ControllersExceptions {
    @ExceptionHandler(EmailValidationException.class)
    public ResponseEntity<Map<String,String>>emailException(EmailValidationException emailValidationException){
        return ResponseEntity.status(HttpStatus.CONFLICT)
                .body(Collections.singletonMap("ERROR",emailValidationException.getMessage()));
    }



/*    @ExceptionHandler({CustomerExistsException.class, CustomerNotExistException.class, PasswordIncorrectException.class, EmailValidationException.class, PurchaseNotExistException.class})
    public ProblemDetail badRequestException(RuntimeException runtimeException) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, runtimeException.getMessage());
    }

    @ExceptionHandler({UnauthorizedException.class, AuthenticationException.class, JWTVerificationException.class})
    public ProblemDetail unauthorizedException(AuthenticationException authenticationException) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.UNAUTHORIZED, authenticationException.getMessage());
    }

    @ExceptionHandler(AccessDeniedException.class)
    public ProblemDetail accessDeniedException(AccessDeniedException accessDeniedException) {
        return ProblemDetail.forStatusAndDetail(HttpStatus.UNAUTHORIZED, accessDeniedException.getMessage());
    }*/

}