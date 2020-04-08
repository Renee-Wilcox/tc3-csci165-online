
public class Product {

	private String name;
	private String description;
	private double price;
	private int skuNum; 
	
	public Product()
	{
		/* No argument. */
	}
	
	public Product(String name, String description, double price, int skuNum)
	{
		this.name = name;
		this.description = description;
		this.price = price;
		this.skuNum = skuNum;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	
	public int getSKU()
	{
		return skuNum;
	}
	

	
	
	public boolean equals(Product otherProduct)
	{
		return this.name == otherProduct.name &&
			   this.description == otherProduct.description &&
			   this.price == otherProduct.price &&
			   this.skuNum == otherProduct.skuNum;
	
	}
	
	
	
	public String toString()
	{
		return String.format("Name: %s\nDescription: %s\nPrice: %s\nSKU: %s\n", name, description, price, skuNum);
	}
	
}//end class
