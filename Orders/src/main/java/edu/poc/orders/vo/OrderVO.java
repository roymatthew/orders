package edu.poc.orders.vo;

import java.math.BigDecimal;
import java.util.Set;

import edu.poc.orders.entity.Order;

/**
 * Value Object that represents an Order.
 *
 * @author rmathew
 */
public class OrderVO
{
    
    /**
     * Private field that ___
     */
    public static final String WAITING_PAYMENT = "WPAY";
    /**
     * Private field that ___
     */
    public static final String SHIPPED = "SHIP";
    private Long orderId;
    
    private Set<OrderItemVO> orderItemVOs;
    
    private BigDecimal orderTotal;

    private String id;
    
    private String status;
    
    

    /**
     * Constructs a ___
     * @param orderItemVOs
     * @param orderTotal
     */
    public OrderVO(Set<OrderItemVO> orderItemVOs, BigDecimal orderTotal)
    {
        super();
        this.orderItemVOs = orderItemVOs;
        this.orderTotal = orderTotal;
    }

    /**
     * Constructs a ___
     * @param order
     */
    public OrderVO(final Order order)
    {
        
        this.id = order.id;
        this.orderId = order.getOrderId();
        this.setOrderItemVOs(order.getOrderItems());
        this.setOrderTotal(order.getOrderTotal());
        this.setStatus(order.getStatus());
        
    }

    /**
     * Constructs a ___
     */
    private OrderVO()
    {
        
        super();
        // TODO Auto-generated constructor stub
        
    }

    /**
     * Getter for orderTotal.
     *
     * @return the orderTotal
     */
    public BigDecimal getOrderTotal()
    {
        return orderTotal;
    }

    /**
     * Setter for orderTotal.
     *
     * @param orderTotal the orderTotal to set
     */
    
    public void setOrderTotal(BigDecimal orderTotal)
    {
        this.orderTotal = orderTotal;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString()
    {
        return "OrderVO [orderId=" + orderId + ", orderItemVOs=" + orderItemVOs + ", orderTotal=" + orderTotal + ", id="
            + id + "]";
    }

    /**
     * Getter for orderItemVOs.
     *
     * @return the orderItemVOs
     */
    public Set<OrderItemVO> getOrderItemVOs()
    {
        return orderItemVOs;
    }

    /**
     * Setter for orderItemVOs.
     *
     * @param orderItemVOs the orderItemVOs to set
     */
    
    public void setOrderItemVOs(Set<OrderItemVO> orderItemVOs)
    {
        this.orderItemVOs = orderItemVOs;
    }

    /**
     * Getter for id.
     *
     * @return the id
     */
    public String getId()
    {
        return id;
    }

    /**
     * Setter for id.
     *
     * @param id the id to set
     */
    
    public void setId(String id)
    {
        this.id = id;
    }

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
     * Getter for status.
     *
     * @return the status
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Setter for status.
     *
     * @param status the status to set
     */
    
    public void setStatus(String status)
    {
        this.status = status;
    }

}

