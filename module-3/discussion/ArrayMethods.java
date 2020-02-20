import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
 
public class ArrayMethods {
	
	public static void fillArray(int[] array, String fileName)
	{
		try
		{
			String inputFile = fileName;
			BufferedReader buff_the_reader = new BufferedReader(new FileReader(inputFile));
			
			for (int x = 0; x < 1000; x++) //the file contains an array of 1000 numbers.
			{
				array[x] = Integer.parseInt(buff_the_reader.readLine()); //read each number one by one
			} //end for loop
			
			//close the reader to prevent a resource leak, IMPORTANT
			buff_the_reader.close();
		}//end try
		
		catch(IOException ex)
		{
			System.out.println("Oops error.");
		}//end catch
		
	}//end fill array
	
	public static int findMax(int[] array)
	{
		int max = 0;
		
		for (int x = 0; x < 1000; x++) //same for loop as before
		{
			if (array[x] > max)
			{
				max = array[x];
			} //end if
		} //end for
		
		return max; 
		
	}//end method 1
	
	public static int findMin(int[] array)
	{
		int min = array[0];
		
		for (int x = 0; x < 1000; x++)
		{
			if (array[x] < min)
			{
				min = array[x];
			}//end if
		}//end for
		
		return min;
	}//end method 2
	
	public static int range(int[] array)
	{
		int range = findMax(array) - findMin(array);
		
		return range;
	} //end method 3
	
	public static int[] percentChange(int[]array, double[]change)
	{
		for (int x = 0; x < 999; x++)
		{
			change[x] = ((array[x + 1] - array[x]) /(double)array[x]) * 100;
		}//end for
	}//end method 4
	
	public static void main(String[] args)
	{
		int[] array = new int[1000]; //array of 1000 numbers
		double percentChange = new double[999];
		double change = 0;
		String file_name = "number_list.txt";
		int array_range = 0;
		
		fillArray(array, file_name);
		array_range = range(array);
		
		System.out.println("Array range = " + array_range);
		
		percentChange(array, percentChange);
		
		for (int x = 0; x < 1000; x++)
		{
			if (x == 999)
			{
				System.out.printf("Index: ", x, "Array: ", array[x], "Percent Change: ");
			}//end if
			
			else {
				change = percentChange[x];
				System.out.printf("Index: ", x, "Array: ", array[x], "Percent Change: ", change, '%');
			}//end else
		}//end for
	}//end main
	
}//end class
