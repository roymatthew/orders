package edu.poc.orders.base;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import edu.poc.orders.exception.InvalidPaymentException;
import edu.poc.orders.exception.NotFoundException;

@ControllerAdvice
public class ExceptionHandlerAdvice
{

    public ExceptionHandlerAdvice()
    {

        // TODO Auto-generated constructor stub

    }
    
    /**
     * Handle all generic Exceptions and Sends Exception in JSON Format.
     * 
     * @param exception the Exception object
     * @return ResponseEntity containing exception details.
     */
    @ExceptionHandler(Exception.class)
    public static ResponseEntity<HttpStatus> handleGlobalException(final Exception exception)
    {

        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    }
    
    /**
     * Handle all InvalidPaymentException and Sends Exception in JSON Format.
     * 
     * @param exception the InvalidPaymentException object
     * @return ResponseEntity containing exception details.
     */
    @ExceptionHandler(InvalidPaymentException.class)
    public static ResponseEntity<HttpStatus> handleGlobalException(final InvalidPaymentException exception)
    {

        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

    }
    
    /**
     * Handle all NotFoundException and Sends Exception in JSON Format.
     * 
     * @param exception the NotFoundException object
     * @return ResponseEntity containing exception details.
     */
    @ExceptionHandler(NotFoundException.class)
    public static ResponseEntity<HttpStatus> handleGlobalException(final NotFoundException exception)
    {

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }    
        

}

