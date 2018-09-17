package edu.poc.orders.exception;

/**
 * NotFoundException.
 *
 * @author rmathew
 */
public class NotFoundException extends Exception
{
    /**
     * Creates a new instance of <code>NotFoundException</code>.
     * 
     * @param msg a <code>String</code> error message
     */
    public NotFoundException(final String msg)
    {
        super(msg);
    }

    /**
     * Creates a new instance of <code>NotFoundException</code>.
     * 
     * @param e the root cause <code>Exception</code> instance
     */
    public NotFoundException(final Exception e)
    {
        super(e);
    }

    /**
     * Creates a new instance of <code>NotFoundException</code>.
     * 
     * @param msg a <code>String</code> error message
     * @param e the root cause <code>Exception</code> instance
     */
    public NotFoundException(final String msg, final Exception e)
    {
        super(msg, e);
    }
}

