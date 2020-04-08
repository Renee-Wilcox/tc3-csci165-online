
import java.util.Date;

public class Account {

	private String accountID;
	private Customer customer;
	private double balance = 0.0;
	private double creditLimit = 0.0;
	private Date dateCreated;
	private double discountLevel = 0.0;
	
	public Account()
	{
		/*No argument. */
	}
	
	public Account(Customer customer)
	{
		this.customer = customer;
	}
	
	
	public Customer getCustomer()
	{
		return this.customer;
	}
	
	
	public Account(Customer customer, double balance, double creditLimit, Date date)
	{
		this.accountID = createAccountID(customer.getFirstName(), customer.getLastName(), date);
		this.customer = customer;
		this.balance = balance;
		this.creditLimit = creditLimit;
		
	}
	
	
	
	private String createAccountID(String firstName, String lastName, Date date)
	{
		/* Private Helper Method for Account ID */
		
		
		//No Vowels
		String removeFirst = firstName.replaceAll("[aeiouAEIOU]", " ");
		String removeLast = lastName.replaceAll("[aeiouAEIOU]", " ");
		String noVowelName = removeFirst + removeLast;
		
		//Convert No-Vowel Name to Upper Case
		noVowelName.toUpperCase();
		
		//And date to a string, so we can....
		String dateString = date.toString();
		
		//Get slashes out of the date!!!
		String dateNoSlash = dateString.replaceAll("\\\\","");
		
		//Print the new string
		accountID = noVowelName + dateNoSlash;
		
		//return the account ID
		return accountID;
	}
	
	
	
	
	
	
	public double getBalance()
	{
		return balance;
	}
	
	public double getCreditLimit()
	{
		return creditLimit;
	}
	
	public void setBalance(double b)
	{
		this.balance = b;
	}
	
	public void setCreditLimit(double cl)
	{
		this.creditLimit = cl;
	}
	
	public String toString()
	{
		return String.format("Account ID:%s \n", "Customer: %s \n", "Balance: %s \n", "Credit Limit: %s \n", "Date created: %s \n", "Discount Level: %s \n",
				accountID, getCustomer(), getBalance(), getCreditLimit(), dateCreated, discountLevel);
	}
	
	boolean equals(Account otherAccount)
	{
		return this.accountID == otherAccount.accountID &&
			   this.customer == otherAccount.customer &&
			   this.balance == otherAccount.balance &&
			   this.creditLimit == otherAccount.creditLimit &&
			   this.dateCreated == otherAccount.dateCreated &&
			   this.discountLevel == otherAccount.discountLevel;
	}
	
	int compareTo(Account otherAccount)
	{
		/* Built around the BALANCE field */
		if (this.balance < otherAccount.balance)
		{
			return -1;
		}
		else if(this.balance > otherAccount.balance)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
}
