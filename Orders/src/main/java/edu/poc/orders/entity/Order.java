
package edu.poc.orders.entity;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.data.annotation.Id;

import edu.poc.orders.vo.OrderItemVO;
import edu.poc.orders.vo.OrderVO;

public class Order
{
    @Id
    public String id;
    private Set<OrderItemVO> orderItems;
    private BigDecimal orderTotal;
    private Long orderId;
    private String status;

    /**
     * Constructs a ___
     * 
     * @param orderItems
     * @param orderTotal
     */
    public Order(final Set<OrderItemVO> orderItems, final BigDecimal orderTotal)
    {
        super();
        this.orderItems = orderItems;
        this.orderTotal = orderTotal;
        this.orderId = System.currentTimeMillis();
        this.status = OrderVO.WAITING_PAYMENT;
    }

    public Order()
    {
        // TODO Auto-generated constructor stub
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
     * Getter for orderItems.
     *
     * @return the orderItems
     */
    public Set<OrderItemVO> getOrderItems()
    {
        return orderItems;
    }

    /**
     * Setter for orderItems.
     *
     * @param orderItems the orderItems to set
     */
    
    public void setOrderItems(Set<OrderItemVO> orderItems)
    {
        this.orderItems = orderItems;
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
