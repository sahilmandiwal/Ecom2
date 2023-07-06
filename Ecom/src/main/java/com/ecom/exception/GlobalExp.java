package com.ecom.exception;

import com.ecom.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExp {


        @ExceptionHandler(ResourceNotFoundExp.class)
        ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundExp ex) {
            ApiResponse response = new ApiResponse();
            response.setMessage(ex.getMessage());
            response.setCode(HttpStatus.NOT_FOUND);
            response.setStatus(false);
            return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
        }
}
