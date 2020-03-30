package discussionmodule5;

public class Address {

	/* declare private variables and methods seen in the UML diagram. */
	private String street; 
	private String city;
	private String state;
	private int zip;
	
	
	
	
	
	/*constructors */
	public Address() //no argument
	{
		
	}
	
	public Address(String street, int zip)
	{
		this.street = street;
		this.zip = zip;
	}
	
	public Address(Address toClone)
	{
		toClone.street = this.street;
		toClone.city = this.city;
		toClone.state = this.state;
		toClone.zip = this.zip;
		
	}
	
	
	
	
	
	/* getters and setters */
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public void setZip(int zip)
	{
		this.zip = zip;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public int getZip()
	{
		return zip;
	}
	
	public String getCity()
	{
		return city;
		
	}
	
	public String getState()
	{
		return state;
	}
	
	
	
	
	public boolean equals(Address otherAddress)
	{
		return this.street == otherAddress.street &&
			   this.city == otherAddress.city &&
			   this.state == otherAddress.state &&
			   this.zip == otherAddress.zip;
	}
	
	
	
	
	@Override
	public String toString()
	{
		return street + "" + city + "" + state + "" + zip; //Similar to how we've done toStrings previously
	}
}
