package discussionmodule5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Driver 
{
	{
		
		Customer customers[] = new Customer[1000]; //Defines an array of 1000 customer objects
		
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
				
			}
			
			readIt.close();
			
			
			/* When the array has been filled iterate through the it and print the toString for each instance. */
			Scanner input = new Scanner(System.in);
			for (int i = 0; i < customers.length; i++)
			{
				System.out.print(customers[index].toString());
					
				System.out.print("----------------------_-----" );
			
				System.out.print("Press enter to continue viewing customer records, type STOP to exit");
				
				/*
				 * Pause at each print and require a key press to move to the next instance....unless the word
				 * STOP is entered. */
				
				String option = input.nextLine();
				if (option == "stop")
				{
					break;
				}
			}
			
			
			
			
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		/* Driver part 2 */
		int index = 0;
		Account[] custAcc = new Account[1000]; //creates accounts for 1000 customers.
		
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
			Account(customers[index], balance, creditLimit, date);
			
			/* Same thing as you did before, but with Account records */
			Scanner input = new Scanner(System.in);
			for (int j = 0; j < custAcc.length; j++)
			{
				System.out.print(custAcc[index].toString());
					
				System.out.print("----------------------_-----" );
			
				System.out.print("Press enter to continue viewing customer account records, type STOP to exit");
				
				/*
				 * Pause at each print and require a key press to move to the next instance....unless the word
				 * STOP is entered. */
				
				String option = input.nextLine();
				if (option == "stop")
				{
					break;
				}
        }
      }
	}
}//end class
	
	

