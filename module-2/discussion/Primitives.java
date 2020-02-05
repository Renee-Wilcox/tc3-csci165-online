
import java.util.Scanner;
import java.lang.Math;

public class Primitives{
    public static void main(String[] args){
        
    //#1

        byte small = 1;
        short tinyInteger = 18;
        char letter = 'A';
        char letterCode = '\u0101';
        int number = 8;
        long fiveDigit = 12345;
        float littleFloater = 6; 
        double doubleInt = 82.29888;

        double smallToLarge = fiveDigit / (double) number; //Widened. Small to large.
        int largeToSmall = (int)doubleInt; //Narrowed. Large to small.

        System.out.printf("byte - %d \n", small);
        System.out.printf("character value(literal) - %C \n", letter);
        System.out.printf("character value(unicode) - %c \n", letterCode);
        System.out.printf("short - %d, int - %d, long - %d", tinyInteger, number, fiveDigit);
        System.out.printf("float - %f, double - %f, Widecast small to large - %.4f, Narrow cast large to small - %d \n", littleFloater, doubleInt, smallToLarge, largeToSmall);

        System.out.printf("\n     \n");

    //#2 

        Scanner userInput = new Scanner(System.in);
        int value = 0;
        double total = 0; 
        System.out.print("Please enter integer: ");

        value = userInput.nextInt();

        for (int i = 2; i < 5; i++)
        {
            total = Math.pow((double)value, (double)i);

            System.out.printf("Input to the power of:  %d", i + "=");
            System.out.print(total);
        }

    //#3

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("Max value: " + max + "  Min value: " + min);

        //comparing small and large
        System.out.printf("Comparing" + tinyInteger + "and" + number + "=" + Integer.compare(tinyInteger, number));
        System.out.printf("Comparing" + min + "and" + number + "=" + Integer.compare(min, number));

        //comparing values
        System.out.printf("Comparing 3 and 3..." + Integer.compare(3,3));
        System.out.printf("Comparing 3 and -3 (unsigned)." + Integer.compare(3,-3));
        //unsigned will NOT print/store negative numbers, will instead print out junk values for said negative number

    //4
        System.out.println("Enter a dividend and divisor: ");
        int dividend = userInput.nextInt();
        int divisor = userInput.nextInt();

        double quotient = (double)dividend / divisor;
        double modulusDiv = (double)dividend % divisor;

        //print results
        System.out.printf("Using regular division: %.4f \n", quotient);
        System.out.printf("Using floor division: %.4f \n", Math.floor(quotient));

        System.out.printf("Using modulus w/out floor: " + modulusDiv + "\n");
        System.out.printf("Using modulus with floor: " + Math.floor((double)dividend % divisor) + "\n");
    }
}