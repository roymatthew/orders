package edu.poc.orders.vo;

import java.math.BigDecimal;

public class ItemVOFactory
{
    
    public static ItemVO createItem(final String sku, final String aPrice)
    {
        return new ItemVO(sku, new BigDecimal(aPrice));
        
    }

}

