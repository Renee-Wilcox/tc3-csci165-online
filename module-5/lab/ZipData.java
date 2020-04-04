package discussionmodule5;

public class ZipData {

	private int zip;
	private String city;
	private String state;
	
	public ZipData(int zip, String city, String state)
	{
		this.zip = zip;
		this.city = city;
		this.state = state;
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
	
	public boolean equals(ZipData otherZD)
	{
		return this.zip == otherZD.zip &&
			   this.city == otherZD.city &&
			   this.state == otherZD.state;
	}
	
	public String toString()
	{
		return zip + city + state;
	}
}
