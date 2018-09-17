package edu.poc.orders.vo;

public class OrderCountVO
{
    
    private String numberWaitingForPayment;
    private String numberShipped;
    /**
     * Getter for numberWaitingForPayment.
     *
     * @return the numberWaitingForPayment
     */
    public String getNumberWaitingForPayment()
    {
        return numberWaitingForPayment;
    }
    /**
     * Setter for numberWaitingForPayment.
     *
     * @param numberWaitingForPayment the numberWaitingForPayment to set
     */
    
    public void setNumberWaitingForPayment(String numberWaitingForPayment)
    {
        this.numberWaitingForPayment = numberWaitingForPayment;
    }
    /**
     * Getter for numberShipped.
     *
     * @return the numberShipped
     */
    public String getNumberShipped()
    {
        return numberShipped;
    }
    /**
     * Setter for numberShipped.
     *
     * @param numberShipped the numberShipped to set
     */
    
    public void setNumberShipped(String numberShipped)
    {
        this.numberShipped = numberShipped;
    }

}

