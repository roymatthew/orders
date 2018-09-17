package edu.poc.orders.vo;

/**
 * Value Object representing Order ItemVO.
 *
 * @author rmathew
 */
public class OrderItemVO
{
    

    private ItemVO itemVO;
    private int quantity;
    
    /**
     * Constructs a ___
     * @param itemVO
     * @param quantity
     */
    public OrderItemVO(ItemVO itemVO, int quantity)
    {
        super();
        this.itemVO = itemVO;
        this.quantity = quantity;
    }
    
    /**
     * Constructs a ___
     */
    private OrderItemVO()
    {
        
        super();
        // TODO Auto-generated constructor stub
        
    }

    /**
     * Getter for itemVO.
     *
     * @return the itemVO
     */
    public ItemVO getItem()
    {
        return itemVO;
    }
    /**
     * Setter for itemVO.
     *
     * @param itemVO the itemVO to set
     */
    
    public void setItem(ItemVO itemVO)
    {
        this.itemVO = itemVO;
    }
    /**
     * Getter for quantity.
     *
     * @return the quantity
     */
    public int getQuantity()
    {
        return quantity;
    }
    /**
     * Setter for quantity.
     *
     * @param quantity the quantity to set
     */
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString()
    {
        return "OrderItemVO [itemVO=" + itemVO + ", quantity=" + quantity + "]";
    }
}

