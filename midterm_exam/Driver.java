import java.util.Scanner;

public class Driver {
	
	
	
	/* We will put our arrays inside of main. */
	public static void main(String[] args)
	{
			/*Call 3 sample fraction objects to test the methods */
			Fraction f1 = new Fraction();
			Fraction f2 = new Fraction();
			Fraction f3 = new Fraction();
			
			/* Set numerator and denominator test values for all 3 */
			f1.setNumerator(9);
			f1.setDenominator(3);
			
			f2.setNumerator(8);
			f2.setDenominator(1);
			
			f3.setNumerator(5);
			f3.setDenominator(8);
			
			/* Test toDecimal */
			System.out.println("Ratio of fraction 1: " + f1.toDecimal());
			System.out.println("Ratio of fraction 2: " + f2.toDecimal());
			System.out.println("Ratio of fraction 3: " + f3.toDecimal());
			
			
			/*Test toString */
			System.out.println("Fraction #1: " + f1);
			System.out.println("Fraction #2: " + f2);
			System.out.println("Fraction #3: " + f3);
			
			/* Reduce fractions to lowest terms */
			f1.reduce();
			f2.reduce();
			f3.reduce();
			System.out.println("F1 Reduced: " + f1);
			System.out.println("F2 Reduced: " + f2);
			System.out.println("F3 Reduced: " + f3);
			
			
			/* Test operational methods.
			 * add/subtract/multiply (Do not divide) */
			System.out.println("Addition: " + f1.add(f3));
			System.out.println("Subtraction: " + f1.subtract(f3));
			System.out.println("Multiplication: " + f1.multiply(f3));

			/* BONUS: if we were testing division....
			 * System.out.println(f1.divide(f3));
			 */
		
			
			/* test equals and compareto */
			

			System.out.println("Testing equals method on #1 and #2: " + f1.equals(f2));
			System.out.println("Testing equals method on #1 and #3: " + f1.equals(f3));
			System.out.println("Testing equals method on #2 and #3: " + f2.equals(f3));

			System.out.println("Comparing fractions #1 and #2: " + f1.compareTo(f2));
			System.out.println("Comparing fractions #1 and #3: " + f1.compareTo(f3));
			System.out.println("Comparing fractions #2 and #3: " + f2.compareTo(f3));

			/* Check copy constructor */
			Fraction fra1 = new Fraction();
			Fraction fra2 = new Fraction(f1);
			
			System.out.println("Copy constructor that returns false: ");
			System.out.print(fra1 == fra2);
			System.out.println("Copy constructor that returns true: ");
			System.out.print(fra1.equals(fra2));
		
			
			
			
			/* FUNCTION TESTS COMPLETE.
			   LET'S CREATE A NEW ARRAY OF FRACTIONS FROM TWO ARRAYS CONTAINING NUMERATORS AND DENOMINATORS.
			 */
	
		/* Create 2 array instances for both the numerator and denominator. */
		int[] numerators = {1, 2, 3, 4, 11, 6, 7, 8, 13};
		int[] denominators = {2, 5, 4, 6, 3, 8, 21, 13, 5};
		
		/* Read in the numerators */
		Scanner topArray = new Scanner(System.in);
		for (int i = 0; i < numerators.length; i++)
		{
			numerators[i] = topArray.nextInt();
		}
			topArray.close();
		
		/* Read in the denominators */
		Scanner bottomArray = new Scanner(System.in);
		
		for (int i = 0; i < denominators.length; i++)
		{
			denominators[i] = bottomArray.nextInt();
		}
			bottomArray.close();
		
		/* We're going to create 9 new Fraction objects, which will form the fraction from numerators[i] and denominators[i] */
		Fraction fractArray[] = new Fraction[9];
		
		for (int i = 0; i < fractArray.length; i++)
		{
			 fractArray[i] = new Fraction(numerators[i], denominators[i]);
		}
	
	/* Use a loop to iterate through the array. */
		/* We are iterating through the new FractArray that we have created for the 9 Fraction objects. */
		for (int i = 0; i < fractArray.length; i++)
		{
			//Call Reduce and print the toString for each fraction.
			fractArray[i].reduce();
			System.out.println("Fraction: " + fractArray[i].toString());

	/* Write code to determine the smallest/largest fractions in the array.
	   Print with a descriptive message. */
			
		Fraction smallest = fractArray[0];
		Fraction largest = fractArray[0];
		
			
			System.out.println("The smallest fraction in the array is: " + smallest);
			System.out.println("The largest fraction in the array is: " + largest);
			
		
		
		}//end for loop
	}//end main
}//end driver class

