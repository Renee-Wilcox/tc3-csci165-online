import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.awt.*;
import java.util.Scanner;

public class MatrixStuff {

    public static void fillArrayRowMajor(int[][] matrix, String fileName)
    {
        try
        {
            String input = fileName;
            BufferedReader buffReader =  new BufferedReader(new FileReader(input));

        for (int horizontal = 0; horizontal < matrix.length; horizontal++)
        {

            //read in the row
            Scanner matrixRow = new Scanner(buffReader);
            System.out.println("Enter number of rows: ");
            int horizontal = matrixRow.nextInt();
       
            for (int vertical = 0; vertical < matrix[0].length; vertical++)
            {
                
            }
        }
        } //end try
        
        catch(IOException ex)
		{
			System.out.println("Oops error.");
		}//end catch

    }//fill array of row major

    public static int findMax(int[][] matrix)
    {
        int max = matrix[0][0];
        for(int i = 0; matrix.length; i++)
            for(int j =0; matrix[vertical].length;j++){
              if (matrix[horizontal][vertical] > max)
                 max = matrix[horizontal][vertical];
            }//end for

        return max;
    }//findMax

    public static int findMin(int[][] matrix)
        {
            int min = matrix[0][0];
            for(int i = 0; matrix.length; i++)
            for(int j =0; matrix[vertical].length;j++){
              if (matrix[horizontal][vertical] < min)
                 min = matrix[horizontal][vertical];
            }//end for

            return min;
    }//findMin

    public static int findMaxOfRow(int[][] matrix, int row)
    {
        for(int j =0; matrix[vertical].length;j++){
              max = matrix[row];

            }//end for
    }//findMaxofRow


    public static int findMinOfRow(int[][] matrix, int row)
    {

    }//findMinOfRow

    public static int findMaxOfColumn(int[][] matrix, int column)
    {
            int max = matrix[0][0];

            for(int j =0; matrix[vertical].length;j++){

              if (matrix[horizontal][vertical] > max)
                 max = matrix[horizontal][vertical];
                
            return max;

    }//findMaxOfColumn

    public static int findMinOfColumn(int[][] matrix, int column)
    {
            int min = matrix[0][0];

            for(int j =0; matrix[vertical].length;j++){

              if (matrix[horizontal][vertical] < min)
                 min = matrix[horizontal][vertical];
                
            return min;
    }//findMinOfColumn

    public static void fillArrayColumnMajor(int[][] matrix)
     {

        try
        {
            String input = fileName;
            BufferedReader buffReader =  new BufferedReader(new FileReader(input));

        for (int horizontal = 0; horizontal < matrix.length; horizontal++)
        {
            for (int vertical = 0; vertical < matrix[0].length; vertical++)
            { 
                Scanner matrixColumn = new Scanner(buffReader);
                System.out.println("Enter number of columns: ");
                int vertical = matrixColumn.nextInt();
        }
        } //end try
        
        catch(IOException ex)
		{
			System.out.println("Oops error.");
		}//end catch

     }//fillArrayColumnMajor

    public static void printRow(int[][] matrix, int row, int num_cols)
    {

    }//print row

    public static int smallestChange(int[][] matrix)
    {
            int index = 0;
            int min = horizontal[index];

            for (int i = 1; i < horizontal.length; i++){
            if (matrix[horizontal][vertical] <= min){
            min = matrix[horizontal][vertical];
            index = i;
        }
    }
        return index;
    }//smallestChange


    public static void main(String[] args)
    {
        int[][] matrix = new int[50][20];
        String fileName = "number_list.txt";

        //fill the arrays row and column major
        fillArrayRowMajor(matrix, fileName);
        fillArrayColumnMajor(matrix);

        //find min and max
        findMin(matrix);
        findMax(matrix);

        //find column/row min/max
        findMaxOfColumn(matrix, column);
        findMinOfColumn(matrix, column);
        findMaxOfRow(matrix, row);
        findMinOfRow(matrix, row);

        //print row
        printRow(matrix, row, num_cols);

        //smallest change?
        smallestChange(matrix);

    }
}