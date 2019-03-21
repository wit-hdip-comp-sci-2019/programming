
/**
 * The full Product class which was specifically developed to demonstrate the 
 * use of ArrayList.
 * 
 * @author Siobhan Drohan, Mairead Meagher
 */

public class Product
{
    private String productName;
    private int productCode;
    private double unitCost;
    private boolean inCurrentProductLine;

    public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine)
    {
        this.productName = productName;
        this.productCode = productCode;
        this.unitCost = unitCost;
        this.inCurrentProductLine = inCurrentProductLine;
    }
    
    public Product()
    {
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public double getUnitCost()
    {
        return unitCost;
    }

    public int getProductCode()
    {
        return productCode;
    }
    
    public boolean getInCurrentProductLine()
    {
        return inCurrentProductLine;
    }    
    
    /**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @param productCode the productCode to set
	 */
	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	/**
	 * @param unitCost the unitCost to set
	 */
	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	/**
	 * @param inCurrentProductLine the inCurrentProductLine to set
	 */
	public void setInCurrentProductLine(boolean inCurrentProductLine) {
		this.inCurrentProductLine = inCurrentProductLine;
	}

	/**
     * Builds a String representing a user friendly representation of the object state
     * @return Details of the specific product
     */
    public String toString()
    {
        return "Product description: " + productName
             + ", product code: " + productCode
             + ", unit cost: €" + unitCost
             + ", currently in product line: " + inCurrentProductLine;
    }
    
}
