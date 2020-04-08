
import java.util.ArrayList;

public class Invoice {

	private String invoiceNumber;
	private Account account;
	private Customer customer;
	private Date orderDate;
	private static ArrayList<Product> products = new ArrayList<>();
	
	/* Initialize the amount due. */
	double amountDue = 0;
	
	public Invoice()
	{
		/* No argument constructor. */
	}
	
	

	
	public Invoice(String invoiceNumber, Account acct, Date orderDate)
	{
		this.invoiceNumber = createInvoiceNumber(customer.getFirstName(), customer.getLastName(), orderDate);
		this.account = acct;
		this.orderDate = orderDate;
	}
	
	

	public String createInvoiceNumber(String firstName, String lastName, Date date)
	{
		/* Concatenate the name */
		String noSpacesName = firstName + lastName;
		
		//And date to a string, so we can....
		String dateString = date.toString();
				
		//Get slashes out of the date!!!
		String dateNoSlash = dateString.replaceAll("\\\\","");
			
		String invoiceNumber = noSpacesName + dateNoSlash;
		return invoiceNumber;
	}
	
	
	
	public Account getAccount()
	{
		return account;
	}
	
	public Date getDate()
	{
		return orderDate;
	}
	
	
	
	public void addProduct(Product p)
	{
		products.add(p);
	}
	
	
	
	public double getAmountDue()
	{
		for (int i = 0; i < products.size(); i++)
		{
			/* Create a sum of the prices. */
			amountDue += products.get(i).getPrice(); //calculate running total
		}
		
		return amountDue;
	}
	
	
	
	
	
	
	
	
	
	
	public String toString()
	{
		return invoiceNumber + account + orderDate + amountDue;
	}
	
	
	
	
	
	
	
	public int compareTo(Invoice otherInvoice)
	{
		if (this.amountDue < otherInvoice.amountDue)
			{
				return -1;
			}
	
		else if (this.amountDue > otherInvoice.amountDue)
			{
				return 1;
			}
			else
			{
				return 0;
			}
	}
	
	
}//end class
