/* CSCI 165 
 * Midterm Project
 * 3/15/2020
 */

import java.lang.Math;

/* Declare a class called Fraction - to represent a ratio of two integers, numerator and denominator. */

public class Fraction {
	/* Private int variables for the numerator and denominator, but will be
	 accessed through getters and setters. */
	
	private int numerator;
	private int denominator;
	
	

	
	
	
	/*Here come the getters and setters! */
	public int getNumerator()
	{
		return numerator;
	}
	
	/* Allows the user to set the numerator. */
	public void setNumerator(int n)
	{
		this.numerator = n;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	/* Allows the user to set the denominator, but if they input zero it will set the denominator to 1. */
	public void setDenominator(int d)
	{
/* Enforce one of two conditions that if denominator = 0 it should be set to 1.*/
	
		    this.denominator = d;
		
			if (denominator == 0)
		{
			this.denominator = 1;
		}
		
	}
	
	
	
	
	
	
	/*We will set up two constructors - one to set the num and denom to 1 ("default", no argument) */
	public Fraction()
	{
		numerator = 1;
		denominator = 1;
		
	}
	
	/* And another one to accept both a numerator and a denominator.
	 (This is an overloaded constructor) */
	
	public Fraction(int numerator, int denominator)
	{
		setNumerator(Math.abs(numerator));
		setDenominator(Math.abs(denominator));
			
		/* Math.abs means take the absolute value if a negative value for numerator
		   or denominator are passed. The other condition has been enforced. */
	}
	
	
	
	
	
	
	
	/* instance methods */
	/* We must find the Greatest Common Denominator (GCD) before we can reduce. */
	private int gcd(int numerator, int denominator)
	{
		int getGCD;
		
		if (this.denominator == 0)
		{
	        return this.numerator;
		}

		/* Calculates the GCD for the numerator and denominator instance variables, aka "this" */
		else if (this.numerator > this.denominator)
		{
	            getGCD = this.numerator = this.numerator - this.denominator;
		}
		else
		{
	            getGCD = this.denominator = this.denominator - this.numerator;
	    }

	    return getGCD;
	}
	
	
	
	
	
	
	public void reduce()
	{
		/* reduces "this" fraction to lowest terms */
		int commonD = gcd(this.numerator, this.denominator); //find the GCD of both the numerator and denominator
		
		/* call setter methods on the num and den. */
		setNumerator(numerator / commonD); //divide them both
		setDenominator(denominator / commonD); //by the commonD (aka the GCD)
	}
	
	
	
	
	
	
	
	
	public double toDecimal() /*returns the ratio as a double*/
	{
		return (double)numerator / denominator; //which will output a decimal value for the fraction

	}
	
	
	
	
	
	/* Next will be adding methods for add, subtract, multiply (no division) which accept a Fraction object as an 
	 argument and return an object that is the result of adding/subtracting/multiplying
	 the argument to "this" fraction. */
	public Fraction add(Fraction f)
	{
		/* Adding Fraction 'f' to 'this' */
		int n = f.numerator + this.numerator;
		int d = f.denominator + this.denominator;
		return new Fraction(n, d);
		
	}
	
	public Fraction subtract(Fraction f)
	{
		/* Same thing, but for subtraction. */
		int n = f.numerator - this.numerator;
		int d = f.denominator - this.denominator;
		return new Fraction(n, d);
		
	}
	
	public Fraction multiply(Fraction f)
	{
		/*Same thing, but for multiplication. */
		int n = f.numerator * this.numerator;
		int d = f.denominator * this.denominator;
		return new Fraction(n, d);
		
	}
	
	/* I'm just going to divide here because it makes sense (as in add, subtract, multiply....we should divide, too, right?
	   but I'll comment it out because it's not required.
	 
	   DIVISION METHOD
	   ==================================
	   
	   int n = this.numerator / f.denominator;
	   int d = this.denominator / f.numerator;
	   return new Fraction(n, d);
	   
	 */
	
	
	
	
	
	
	
	
	
	
	/* But there are compareTo and equals methods. */
	public boolean equals(Fraction f)
	{
		return this.numerator == f.numerator &&
			   this.denominator == f.denominator;
		
	}
	
	
	
	
	public int compareTo (Fraction f)
	{
		if (this.numerator == f.getNumerator() && this.denominator == f.getDenominator())
		{ 
			return 0;
		}
  		else if (this.numerator < f.getNumerator() && this.denominator < f.getDenominator())
		{
  			return -1;
		}
  		else
  		{
  			return 1;
  		}
	}

	
	
	
	
	
	
	/* Add a suitable toString method, converting improper fractions to mixed */
	 public String toString() {
		
		String output;
		
		/* If the numerator is greater than the denominator, it will convert the improper fraction to a mixed one, and 
		 * the toString output will be called when driver calls for "System.out.println(x.toString());" */
	
		if (numerator > denominator)
		{
			int whole = Math.floorDiv(numerator, denominator);

			int mixed  = whole * denominator;
			
			output = whole + " " + mixed + "/" + denominator;
			return output;
		}
		
		else
		{
			output = numerator + "/" + denominator;
			return output;
		}
			
	 }

	 
	 
	 
	 
	 
	 /* Remember the constructor from earlier? We're going to create a copy constructor 
	    to copy this:
	   
	    public Fraction(int numerator, int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);
	}
		Question : How will we copy this? 
		See below.
	  */
	 
	 /* This is a copy constructor. */
	 public Fraction (Fraction arg)
	 {
		 //To invoke this, we need to create copy instances of the variables in the original overloaded constructor.
		 //From arg to this (field-by-field copy)
		 arg.numerator = this.numerator;
		 arg.denominator = this.denominator;
	 }
	 
	
		
}//end Fraction class




		 