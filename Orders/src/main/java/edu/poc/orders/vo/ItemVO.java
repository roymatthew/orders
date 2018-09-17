package edu.poc.orders.vo;

import java.math.BigDecimal;

/**
 * Value Object that represents an order item.
 *
 * @author rmathew
 */
public class ItemVO
{
    
    /**
     * Constructs a ___
     */
    private ItemVO()
    {
        
        super();
        // TODO Auto-generated constructor stub
        
    }

    private String sku;
    private BigDecimal price;
    /**
     * Constructs a ___
     * @param sku
     * @param price
     */
    public ItemVO(String sku, BigDecimal price)
    {
        super();
        this.sku = sku;
        this.price = price;
    }
    /**
     * Getter for sku.
     *
     * @return the sku
     */
    public String getSku()
    {
        return sku;
    }
    /**
     * Setter for sku.
     *
     * @param sku the sku to set
     */
    
    public void setSku(String sku)
    {
        this.sku = sku;
    }
    /**
     * Getter for price.
     *
     * @return the price
     */
    public BigDecimal getPrice()
    {
        return price;
    }
    /**
     * Setter for price.
     *
     * @param price the price to set
     */
    
    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString()
    {
        return "ItemVO [sku=" + sku + ", price=" + price + "]";
    }
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((sku == null) ? 0 : sku.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof ItemVO))
        {
            return false;
        }
        ItemVO other = (ItemVO) obj;
        if (price == null)
        {
            if (other.price != null)
            {
                return false;
            }
        }
        else if (!price.equals(other.price))
        {
            return false;
        }
        if (sku == null)
        {
            if (other.sku != null)
            {
                return false;
            }
        }
        else if (!sku.equals(other.sku))
        {
            return false;
        }
        return true;
    }

}

