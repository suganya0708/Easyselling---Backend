package com.app.easyselling.common;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<APIErrorResponse> handleException(ProductNotFoundException e){
        APIErrorResponse apiResponse = new APIErrorResponse();
        apiResponse.setMessage(e.getMessage ());
        apiResponse.setStatus (404);
        apiResponse.setTimeStamp (System.currentTimeMillis ());

        return new ResponseEntity<APIErrorResponse>(apiResponse,HttpStatus.NOT_FOUND);


    }
}
