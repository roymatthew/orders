package edu.poc.orders.util;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;

import edu.poc.orders.vo.OrderItemVO;

/**
 * OrderTotalCalculator.
 *
 * @author rmathew
 */
public class OrderTotalCalculator
{

    /**
     * This method ___
     * @param orderItems
     * @return
     */
    
    public static BigDecimal calculate(final Set<OrderItemVO> orderItems)
    {
        BigDecimal orderTotal = BigDecimal.ZERO;
       
        for (Iterator<OrderItemVO> it = orderItems.iterator(); it.hasNext();)
        {
            OrderItemVO orderItem = it.next();
            final BigDecimal price = orderItem.getItem().getPrice().multiply(new BigDecimal(orderItem.getQuantity()));
            orderTotal = orderTotal.add(price);
        }
        return orderTotal;
        
    }

}

