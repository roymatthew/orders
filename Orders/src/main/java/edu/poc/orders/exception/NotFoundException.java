/*
 *    Copyright &copy; Flagstar Bank 2018.
 *
 *    Copyright in the application source code, and in the information and
 *    material therein and in their arrangement, is owned by Flagstar Bank, FSB
 *    unless otherwise indicated.
 *
 *    You shall not remove or obscure any copyright, trademark or other notices.
 *    You may not copy, republish, redistribute, transmit, participate in the
 *    transmission of, create derivatives of, alter edit or exploit in any
 *    manner any material including by storage on retrieval systems, without the
 *    express written permission of Flagstar Bank.
 */
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

