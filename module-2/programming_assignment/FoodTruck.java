import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.text.DateFormat;  
import java.util.Date;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import java.util.ArrayList;

public class FoodTruck {
    public static void main(String[] args)
    {
        //we will load the menu + prices into an array.
        try{
        File fileMenu = new File("menu.txt");
        File filePrices = new File("prices.txt");
        }

        catch(FileNotFoundException ex)
        {
            System.out.println("Either file not found.");
        }

        ArrayList<String> menuData = new ArrayList();
        ArrayList<String> priceData = new ArrayList();

        //loop with hasNext call
        while(fileMenu.hasNextLine())
        {
            menuData.add(fileMenu.nextLine());
        }
        while(filePrices.hasNextLine())
        {
            priceData.add(filePrices.nextLine());
        }

        //ask the user to enter their FULL NAME (single string)
        Scanner nameInput = new Scanner(System.in);
        String fullName = "";

        System.out.println("Welcome to the CS food truck \n");
        System.out.println("Enter your name: ");
        fullName = nameInput.nextLine();


        //output the total price

        //tax rate = 6.25, output
        final double tax_rate = 0.0625; //we can ASSUME that the tax rate is constant
        
        //add tax rate to total price and multiply by quantity

        //current date and time in MM/DD/YYYY format
        DateFormat dateFormat = "MM/DD/YYYY HH:mm:ss";


        
        //let's make the receipt, plus write it to an external file. 
        //we will make a unique 'invoice number' for a customer

        //traditional

        //initials
        String firstInitial = fullName.substring(0,2);
        String lastInitial = fullName.substring().CharAt(fullName.indexOf(" ") - 2);

        //convert to uppercase 
        String first = firstInitial.toUpperCase();
        String last = lastInitial.toUpperCase();

        //numeric value (aka convert the letters to numeric (integer) value)
        String firstNum = (int) first;
        String lastNum = (int) last;

        String newNum = firstNum + lastNum * fullName.length();

        //concatenate the initials
        String ID = firstInitial + lastInitial + newNum + dateFormat;

        //date
        //system window output

        String.format("");
        //exported
        FileWriter receipt = new FileWriter("");

        receipt.write();
        receipt.close();


    }
}