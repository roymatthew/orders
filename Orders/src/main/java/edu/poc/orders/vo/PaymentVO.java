package edu.poc.orders.vo;

import java.math.BigDecimal;

public class PaymentVO
{
    
    private Long orderId;
    private BigDecimal amount;
    /**
     * Getter for orderId.
     *
     * @return the orderId
     */
    public Long getOrderId()
    {
        return orderId;
    }
    /**
     * Setter for orderId.
     *
     * @param orderId the orderId to set
     */
    
    public void setOrderId(Long orderId)
    {
        this.orderId = orderId;
    }
    /**
     * Getter for amount.
     *
     * @return the amount
     */
    public BigDecimal getAmount()
    {
        return amount;
    }
    /**
     * Setter for amount.
     *
     * @param amount the amount to set
     */
    
    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString()
    {
        return "PaymentVO [orderId=" + orderId + ", amount=" + amount + "]";
    }

}

