
package edu.poc.orders.rest.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import edu.poc.orders.exception.InvalidPaymentException;
import edu.poc.orders.exception.NotFoundException;
import edu.poc.orders.service.OrderService;
import edu.poc.orders.vo.OrderCountVO;
import edu.poc.orders.vo.OrderVO;
import edu.poc.orders.vo.PaymentVO;

/**
 * TODO This class ___
 *
 * @author rmathew
 */
@RestController
public class OrderController
{

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(OrderController.class);

    /**
     * Private field that ___
     */
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/orders", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<OrderCountVO> listOdersCount()
    {

        return new ResponseEntity<OrderCountVO>(orderService.getOrderCounts(), HttpStatus.OK);

    }

    @RequestMapping(value = "/all/orders", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<OrderVO>> listAllOrders()
    {
        return new ResponseEntity<List<OrderVO>>(orderService.listAllOrders(), HttpStatus.OK);

    }

    @RequestMapping(value = "/order/{orderNumber}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<OrderVO> getOrderDetails(@PathVariable final String orderNumber) throws NotFoundException
    {

        Long orderId = null;

        try
        {
            orderId = Long.valueOf(orderNumber);
        }
        catch (final NumberFormatException e)
        {
            LOG.error(e.getMessage());
            throw new NotFoundException(e);
        }

        final OrderVO order = orderService.getOrderByOrderId(orderId);

        return new ResponseEntity<OrderVO>(order, HttpStatus.OK);

    }

    /**
     * This method ___
     * 
     * @param anOrder
     * @return
     */
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<OrderVO> createOrder(@RequestBody final OrderVO anOrder)
    {
        return new ResponseEntity<>(orderService.createOrder(anOrder), HttpStatus.CREATED);

    }

    /**
     * This method ___
     * 
     * @param aPayment
     * @return
     * @throws InvalidPaymentException
     */
    @RequestMapping(value = "/payment", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<OrderVO> makePayment(@RequestBody final PaymentVO aPayment) throws InvalidPaymentException
    {

        OrderVO orderVO = null;

        try
        {
            orderVO = orderService.makePayment(aPayment);
        }
        catch (final InvalidPaymentException e)
        {
            LOG.error(e.getMessage());
            throw e;

        }
        return new ResponseEntity<>(orderVO, HttpStatus.OK);

    }

}
