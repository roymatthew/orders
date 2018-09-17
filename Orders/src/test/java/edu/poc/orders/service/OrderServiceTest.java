package edu.poc.orders.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import edu.poc.orders.persistence.OrderRepository;


/**
 * OrderServiceTest
 *
 * @author rmathew
 */
@SpringBootTest
public class OrderServiceTest
{
    /**
     * Private field that ___
     */
    @InjectMocks
    private OrderService service = new OrderServiceImpl();
    
    /**
     * Private field that ___
     */
    @Mock
    private OrderRepository repository;
    
    
    /**
     * Initializer.
     */
    @Before
    public void initialize()
    {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test()
    {
        Mockito.doReturn(OrderFactory.createMockOrderEntity()).when(repository)
        .findByOrderId(Matchers.anyLong());
        
        Assert.assertNotNull(service.getOrderByOrderId(Long.valueOf(100)));
    }

}

