import java.util.Scanner;

public class Driver
{

        //create an array of 5 Temperature objects
        Temperature obj[] = new Temperature[5]; 
        

    public void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //set up for input from the user.
        for (int i = 0; i < obj.length; i++)
        {
            obj[i] = new Temperature(); //instantiating data....
        }
        //start putting data inside your array

        obj[0].setTempAndScale(0.0f, 'C');
        obj[1].setTempAndScale(32.0f, 'F');
        obj[2].setTempAndScale(-40.0f, 'C');
        obj[3].setTempAndScale(-40.0f, 'F');  
        obj[4].setTempAndScale(0.0f, 'C');

        //create random temp object to compare to
        Temperature tmp = new Temperature();
        tmp.setTempAndScale(30.0f, 'F');

        for (Temperature t: obj)
        {
            System.out.println("toString: " + t.toString());

            //get it in both Celsius and Fahrenheit
            System.out.println("Temp in C is: " + tmp.getCelsius());
            System.out.println("Temp in F is: " + tmp.getFahrenheit());

            //compare values
            System.out.println("Comparing current temp to 40F: ");
        
        if (t.compareTo(tmp) < 0) {
            System.out.println("temp is higher than 40F ");
        }
        else if (t.compareTo(tmp) > 0) {
            System.out.println("temp is a lower than 40F");

        }
        else
        {
            System.out.println("The two temps are equal.");
        }//end if-else
        }//end for loop
     }//end of main
}//end class

