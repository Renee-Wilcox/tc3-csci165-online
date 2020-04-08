
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Address {

	/* declare private variables and methods seen in the UML diagram. */
	private String street; 
	private String city;
	private String state;
	private int zip;
	public static ArrayList<ZipData> zipDatabase = new ArrayList<ZipData>(); //ArrayList to hold ZipData objects
	
	
	static //static block to call FillList
	{
		fillList();
	}
	
	
	
	private static void fillList()
	{

		try {
			
			File zip_db = new File("zip_code_database.csv");
			Scanner zipRead = new Scanner(zip_db);
			
				String current = zipRead.next();
				String[] zipdat = current.split(",");
			
			while (zipRead.hasNext()){
			
				int zip = Integer.parseInt(zipdat[1]);
				String city = zipdat[2];
				String state = zipdat[3];
				
				ZipData newZip = new ZipData(zip, city, state);
				zipDatabase.add(newZip);
				
			}
			zipRead.close();
			
		}
	
		catch(FileNotFoundException e)
		{
			System.out.println("File not found.");
		}
		
	}
	
	
	
	
	public static ZipData locate(int zip)
	{
		ZipData returnZipMatch = null; 
		
		for (int i = 0; i < zipDatabase.size(); i++)
		{
			if (zip == zipDatabase.get(i).getZip())
			{
				returnZipMatch = zipDatabase.get(i);
				
			}
		}
			return returnZipMatch;
	}
	
	
	
	
	
	/*constructors */
	public Address() //no argument
	{
		
	}
	
	public Address(String street, int zip)
	{
		this.street = street;
		
		/*auto-populate the city and state by grabbing the zip code and passing it into the locate method.
		  pull the city and state out of the returned ZipData instance */
		
		ZipData obj = locate(zip);
		this.state = obj.getState();
		this.city = obj.getCity();
		
		this.zip = zip;
		
	}
	
	public Address(Address toClone)
	{
		this.street = toClone.street;
		this.city = toClone.city;
		this.state = toClone.state;
		this.zip = toClone.zip;
		
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
		return street + " " + city + " " + state + " " + zip; //Similar to how we've done toStrings previously
	}
}
