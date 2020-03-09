import java.util.Scanner;

//Initial class
public class Temperature
{
        //define its elements as private, to ensure that domains are enforced at all times
        private float tempValue = 0;
        private char scale;

//Getters
public float getCelsius()
{
        float degreesF = getFahrenheit();
        return 5 * (degreesF - 32) / 9;
}

public float getFahrenheit()
{
        float degreesC = getCelsius();
        return 9 * (degreesC / 5) + 32;
}

//Setters
public void setValue(float tempValue)
{
        if (tempValue > -200 && tempValue < 200)
        {
                this.tempValue = tempValue;
        }
}

public void setScale(char scale)
{
        if (scale == 'C')
        {
                this.scale = 'C';
        }

        else if (scale == 'F')
        {
                this.scale = 'F';
        }

        else
        {
                this.scale = 'C';
        }
        //return fahrenheit(F) or celsius(C)
}

public void setTempAndScale(float tempValue, char scale)
{
        //call both temp and scale functions, that way we need to only write the instructions once
        setValue(tempValue);
        setScale(scale);
}
//Constructors

public Temperature()
{} //no argument. 

public void TempScale(float tempValue, char scale)
{      
        //method constructor to accept both the temp and scale
        setValue(tempValue);
        setScale(scale);
}

//Comparison methods

public boolean equals(Temperature t)
{
        return this.tempValue == t.tempValue &&
               this.scale == t.scale;
}

int compareTo(Temperature t)
{
        if (this.tempValue > t.tempValue) 
        {
                return 1;
        }

        else if (this.tempValue < t.tempValue)
        {
                return -1;
        }

        else    
        {
                return 0; 
        }

}//missing return statement?


//toString...
public String toString()
{
        return ("Temperature in Celsius: " + this.getCelsius() +
        "Temperature in Fahrenheit: " + this.getFahrenheit());

}//end toString


}//end class



