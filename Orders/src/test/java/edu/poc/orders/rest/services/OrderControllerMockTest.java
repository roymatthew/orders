package edu.poc.orders.rest.services;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import edu.poc.orders.service.OrderFactory;
import edu.poc.orders.service.OrderService;

/**
 * TODO This class ___
 *
 * @author rmathew
 */
@SpringBootTest
public class OrderControllerMockTest
{
    
    @InjectMocks
    private OrderController controller;
    
    @Mock
    private OrderService service;
    
    /**
     * Mock MVC.
     */
    private MockMvc mockMvc;
    
    /**
     * Initializer.
     */
    @Before
    public void initialize()
    {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }
    
    /**
     * Method to test mortgage conditions end point.
     * 
     * @throws Exception
     */
    @org.junit.Test
    public void testGetOrderByOrderId() throws Exception
    {
        Mockito.doReturn(OrderFactory.createMockOrder()).when(service)
            .getOrderByOrderId(Matchers.anyLong());
        mockMvc.perform(get("/order/65656")
            .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }    
   

}

