
package edu.poc.orders.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.poc.orders.entity.Order;
import edu.poc.orders.exception.InvalidPaymentException;
import edu.poc.orders.persistence.OrderRepository;
import edu.poc.orders.rest.services.OrderController;
import edu.poc.orders.util.OrderTotalCalculator;
import edu.poc.orders.vo.OrderCountVO;
import edu.poc.orders.vo.OrderVO;
import edu.poc.orders.vo.PaymentVO;

@Service
public class OrderServiceImpl implements OrderService
{
    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(OrderServiceImpl.class);
    
    @Autowired
    private OrderRepository orderRepository;

    public OrderVO createOrder(final OrderVO anOrder)
    {
        BigDecimal orderTotal = anOrder.getOrderTotal();
        if (anOrder.getOrderTotal() == null)
        {
            orderTotal = OrderTotalCalculator.calculate(anOrder.getOrderItemVOs());
        }
        Order order = new Order(anOrder.getOrderItemVOs(), orderTotal);
        order = orderRepository.insert(order);
        final OrderVO savedOrder = new OrderVO(order);
        return savedOrder;

    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.poc.orders.service.OrderService#listAllOrders()
     */

    public List<OrderVO> listAllOrders()
    {
        final List<Order> orderEntities = orderRepository.findAll();
        final List<OrderVO> orders = new ArrayList<>();
        OrderVO orderVO = null;
        for (Order order : orderEntities)
        {
            orderVO = new OrderVO(order);
            orders.add(orderVO);
        }
        return orders;

    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.poc.orders.service.OrderService#getOrderByOrderId(java.lang.Long)
     */

    public OrderVO getOrderByOrderId(final Long orderId)
    {
        final Order order = orderRepository.findByOrderId(orderId);
        final OrderVO orderVO = new OrderVO(order);
        return orderVO;

    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.poc.orders.service.OrderService#makePayment(edu.poc.orders.vo.PaymentVO)
     */

    public OrderVO makePayment(final PaymentVO aPayment) throws InvalidPaymentException
    {
        final Order order = orderRepository.findByOrderId(aPayment.getOrderId());
        if (aPayment.getAmount().compareTo(order.getOrderTotal()) == 1)
        {
            throw new InvalidPaymentException("Overpayment not allowed");
        }
        else if (aPayment.getAmount().compareTo(order.getOrderTotal()) == 0)
        {
            // update order status to shipped
            order.setStatus(OrderVO.SHIPPED);
            orderRepository.save(order);
            LOG.info("Order#" + aPayment.getOrderId() + " has been shipped");
        }
        
        //make the payment

        final OrderVO orderVO = new OrderVO(order);
        return orderVO;

    }

    /* (non-Javadoc)
     * @see edu.poc.orders.service.OrderService#getOrderCounts()
     */
    
    public OrderCountVO getOrderCounts()
    {
        final List<Order> orderEntities = orderRepository.findAll();
        final OrderCountVO vo = new OrderCountVO();
        Long wpayCount = Long.valueOf(0);
        Long shippedCount = wpayCount;
        for (Order order : orderEntities)
        {
            if (OrderVO.SHIPPED.equals(order.getStatus()))
            {
                shippedCount++;
            }
            else
            {
                wpayCount++;
            }
        }
        vo.setNumberShipped(String.valueOf(shippedCount));
        vo.setNumberWaitingForPayment(String.valueOf(wpayCount));
        return vo;
        
    }

}
