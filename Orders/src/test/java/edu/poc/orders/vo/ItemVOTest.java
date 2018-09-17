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
package edu.poc.orders.vo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test Cases for ItemVO.
 *
 * @author rmathew
 */
public class ItemVOTest
{

    /**
     * Test method for {@link edu.poc.orders.vo.ItemVO#equals(java.lang.Object)}.
     */
    @Test
    public void testNotEqualsObject()
    {
        final ItemVO item1 = ItemVOFactory.createItem("abc", "5.5");
        final ItemVO item2 = ItemVOFactory.createItem("def", "8.2");
        Assert.assertNotEquals(item1, item2);
    }
    
    /**
     * Test method for {@link edu.poc.orders.vo.ItemVO#equals(java.lang.Object)}.
     */
    @Test
    public void testEqualsObject()
    {
        final ItemVO item1 = ItemVOFactory.createItem("abc", "5.5");
        final ItemVO item2 = ItemVOFactory.createItem("abc", "5.5");
        Assert.assertEquals(item1, item2);
    }    

}

