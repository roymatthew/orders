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

