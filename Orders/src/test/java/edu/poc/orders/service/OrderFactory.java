package edu.poc.orders.service;

import java.math.BigDecimal;

import edu.poc.orders.entity.Order;
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

    /**
     * This method ___
     * @return
     */
    
    public static Order createMockOrderEntity()
    {
        final OrderVO orderVO = new OrderVO(OrderItemFactory.createMockOrderItems(), BigDecimal.TEN);
        final Order order = new Order();
        order.setOrderId(System.currentTimeMillis());
        order.setOrderItems(orderVO.getOrderItemVOs());
        order.setOrderTotal(orderVO.getOrderTotal());
        order.setStatus(OrderVO.WAITING_PAYMENT);

        return order;
        
    }

}

