package edu.poc.orders.service;

import java.math.BigDecimal;

import edu.poc.orders.vo.OrderVO;

/**
 * TODO This class ___
 *
 * @author rmathew
 */
public class OrderFactory
{

    /**
     * This method ___
     * @return
     */
    
    public static OrderVO createMockOrder()
    {
        final OrderVO order = new OrderVO(OrderItemFactory.createMockOrderItems(), BigDecimal.TEN);
        return order;
        
    }

}

