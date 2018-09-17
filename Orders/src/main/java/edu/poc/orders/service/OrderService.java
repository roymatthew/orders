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
package edu.poc.orders.service;

import java.util.List;

import edu.poc.orders.exception.InvalidPaymentException;
import edu.poc.orders.vo.OrderCountVO;
import edu.poc.orders.vo.OrderVO;
import edu.poc.orders.vo.PaymentVO;

/**
 * OrderService interface.
 *
 * @author rmathew
 */
public interface OrderService
{
    
    OrderVO createOrder(final OrderVO anOrder);
    
    List<OrderVO> listAllOrders();
    
    OrderVO getOrderByOrderId(final Long orderId);

    /**
     * This method ___
     * @param aPayment
     * @return
     * @throws InvalidPaymentException 
     */
    
    OrderVO makePayment(PaymentVO aPayment) throws InvalidPaymentException;

    /**
     * This method ___
     * @return
     */
    
    OrderCountVO getOrderCounts();

}

