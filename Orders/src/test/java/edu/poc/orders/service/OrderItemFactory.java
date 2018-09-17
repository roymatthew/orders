package edu.poc.orders.service;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import edu.poc.orders.vo.ItemVO;
import edu.poc.orders.vo.ItemVOFactory;
import edu.poc.orders.vo.OrderItemVO;

/**
 * TODO This class ___
 *
 * @author rmathew
 */
public class OrderItemFactory
{

    /**
     * This method ___
     * @return
     */
    
    public static Set<OrderItemVO> createMockOrderItems()
    {
        final Set<OrderItemVO> orderItems = new HashSet<>();
        orderItems.add(createMockOrderITem(ItemVOFactory.createItem("abc", "20.50"), 10));
        return Collections.unmodifiableSet(orderItems);
        
    }

    /**
     * This method ___
     * @param createItem
     * @param i
     * @return
     */
    
    public static OrderItemVO createMockOrderITem(final ItemVO createItem, int count)
    {
        final OrderItemVO orderItem = new OrderItemVO(createItem, count);
        return null;
        
    }

}

