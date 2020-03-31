package discussionmodule5;

public class Driver {

	
	/* Create a driver class with a main method. */
	public static void main(String[] args)
	{
			Address addr1 = new Address("Sample St", 40092); /*similar to employee.java */
			Customer janeLee = new Customer("Jane", "Lee", "janellee@example.net", addr1);
			
			addr1.setZip(21919); /*Privacy leak on line 12 */
			
			Customer johnDoe = new Customer("John", "Doe", "johndoe@example.net", new Address("Sample St", 40092));
			
			System.out.println(janeLee);
			System.out.println(johnDoe);
			
	
			
	}
}
