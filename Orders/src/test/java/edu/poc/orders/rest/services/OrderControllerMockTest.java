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
package edu.poc.orders.rest.services;

import java.util.Optional;

import org.junit.Before;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;

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
    @Test
    public void testGetOpenMortgageConditions() throws Exception
    {
        Mockito.doReturn(null).when(service)
            .get(Matchers.anyString());
        mockMvc.perform(get("/loan/123456789/conditions/open")
            .header(HttpHeaders.AUTHORIZATION,
                "Basic " + AUTHORIZATION_HEADER)
            .header(USER_PROFILE_HEADER, getUserProfileHeader(Optional.empty()))
            .contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
    }

}

