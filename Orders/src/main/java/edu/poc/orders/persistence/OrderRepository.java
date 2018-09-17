package edu.poc.orders.persistence;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.poc.orders.entity.Order;

/**
 * TODO This class ___
 *
 * @author rmathew
 */
public interface OrderRepository extends MongoRepository<Order, String>
{
    
    /**
     * This method ___
     * @param orderId
     * @return
     */
    Order findByOrderId(final Long orderId);

}

