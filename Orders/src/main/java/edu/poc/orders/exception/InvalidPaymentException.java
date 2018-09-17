package edu.poc.orders.exception;

/**
 * InvalidPaymentException.
 *
 * @author rmathew
 */
public class InvalidPaymentException extends Exception
{
    /**
     * Creates a new instance of <code>InvalidPaymentException</code>.
     * 
     * @param msg a <code>String</code> error message
     */
    public InvalidPaymentException(final String msg)
    {
        super(msg);
    }

    /**
     * Creates a new instance of <code>InvalidPaymentException</code>.
     * 
     * @param e the root cause <code>Exception</code> instance
     */
    public InvalidPaymentException(final Exception e)
    {
        super(e);
    }

    /**
     * Creates a new instance of <code>InvalidPaymentException</code>.
     * 
     * @param msg a <code>String</code> error message
     * @param e the root cause <code>Exception</code> instance
     */
    public InvalidPaymentException(final String msg, final Exception e)
    {
        super(msg, e);
    }
}

