package com.mindtree.sba.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomBrandException {

    @ExceptionHandler(value = BrandNameNotPresentException.class)
    public ResponseEntity<?> brandNameNotPresentException( BrandNameNotPresentException ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }
}
