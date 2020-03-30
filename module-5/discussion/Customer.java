package discussionmodule5;

public class Customer {

	/* Declare all private variables and methods seen in the UML diagram. */
	private String firstName;
	private String lastName;
	private String email;
	private Address address; /* Reference to the Address variable in the Address.java. */
	
	
	
	public Customer() //no argument constructor
	{}
	
	
	
	public Customer(String firstName, String lastName, String email, Address address) //constructor to accept all private variables
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		//address?
		
	}

	public Customer(String firstName, String lastName) //accept the first and last name only
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public Customer(Customer toClone) //copy constructor
	{
		toClone.firstName = this.firstName;
		toClone.lastName = this.lastName;
		toClone.email = this.email;
		toClone.address = this.address;
	}
	
	
	
	
	/* getters and setters */
	public void setName(String first, String last)
	{
		this.firstName = first;
		this.lastName = last;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getName()
	{
		return firstName + " " + lastName;
	}
	
	public String getEmail()
	{
		return email;
	}
	
	
	
	
	public Address getAddress()
	{
		return this.address;
	}
	
	

	public void setAddress(Address addy)
	{
		this.address = addy;
	}
	
	
	
	
	public boolean equals(Customer otherCustomer)
	{
		return this.firstName.equals(otherCustomer.firstName) &&
			   this.lastName.equals(otherCustomer.lastName) &&
			   this.email.equals(otherCustomer.email) &&
			   this.address == null ? null : this.address.equals(otherCustomer.address);
	}
	
	public String toString()
	{
		return firstName + " " + lastName + "\n" + email +  "\n" + address;
	}
	
	
	
}