
import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class Driver {
	
	
	private static Product[] prodArray = new Product[1000]; //create an array of 1000 products
	private static Customer[] customers = new Customer[1000]; //Defines an array of 1000 customer objects
	private static Account[] custAcc = new Account[1000]; //creates accounts for 1000 customers.
	private static Invoice[] invArray = new Invoice[100]; //creates the invoice array
	
	public static void main(String[] args)
	{
		/* Fill the product array */
		try
		{
			int index = 0; 
			File productsFile = new File("products.txt");
			Scanner reader = new Scanner(productsFile);
			
			String current = readIt.next();
			String[] tabs = current.split("\t");
			
			while(reader.hasNext())
			{
				String name = tabs[1];
				String description = tabs[2];
				String price = tabs[3];
				String skuNum = tabs[4];
				
				prodArray[index] = new Product(name, description, price, skuNum);
				index++;
			
			}
		}
		
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	
	
		/* Customers, Address, and Accounts */
		try
		{
		int index = 0;
		
		File customerFile = new File("customers.txt");
		Scanner readIt = new Scanner(customerFile);
		
		String current = readIt.next();
		String[] fields = current.split("\t");
		
		while (readIt.hasNext()) 
		{
			String firstName = fields[1];
			String lastName = fields[2];
			String email = fields[3];
			String street = fields[4]; //???
			int zip = Integer.parseInt(fields[5]); /* The zip will auto populate the city and state for the street */
			
			
			/* Create an Address instance. */
			Address newAdd = new Address(street, zip);
			
			/* newAdd will auto-populate the city and state by grabbing the zip code and passing it into the locate method. It
			  will pull the city and state out of the returned ZipData instance and assign them to the Address. */
			
			
			/* Using the Address instance created above, build a Customer instance using the remaining data from the line. */
			/* This will add a new instance to the array */
			customers[index] = new Customer(firstName, lastName, email, newAdd);
			index++;
			
		}
		
		readIt.close();
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		int index = 0;
		for (int i = 0; i < 1000; i++)
        {
			/* For each Customer create a random date within the last 20 years to serve as the account created date. 
			 I'll accomplish this with three random numbers: I'll set this up. */
			
			Random rand = new Random();
			
			
			int month = rand.nextInt(12); // One for the month: 1 – 12
			int day = rand.nextInt(28); //* One for the day: 1 – 28 
			int year = rand.nextInt(20); //* One for the year: 1 – 20 
			int actualYear = year - 2020; //subtract this number from 2020 to get the actual year
			
			Date date = new Date(month, day, actualYear);
			
			/*  The balance should be set to a random number and the credit limit should be set to 50% of the balance. 
		 * Discount level can remain zero */
			double balance = rand.nextDouble();
			double creditLimit = balance / 2;
			
			
			//Add the account into the array.
			custAcc[i] = new Account(customers[index], balance, creditLimit, date);
			index++;
			
        }
		
		/* Invoice */
			Random price = new Random(20); /*Random out of 20 */
			for (int i = 0; i < 100; i++)
			{
				invArray[i] = new Invoice(invoiceNumber, account, orderDate, amountDue);
				index++;
				
				for (int a = 0; a < 20; a++)
				{
					invArray[i].addProduct(prodArray[i]);
				}
				
				
				
						
				Scanner input = new Scanner(System.in);
				for (int j = 0; j < invArray.length; j++)
				{
					System.out.print(invArray[index].toString());
						
					System.out.print("----------------------_-----" );
				
					System.out.print("Press enter to continue viewing invoice records, type STOP to exit");
					
					/*
					 * Pause at each print and require a key press to move to the next instance....unless the word
					 * STOP is entered. */
					
					String option = input.nextLine();
					if (option == "stop")
					{
						break;
					}
			}
		
	}//end main
			
			
}//end class
