// CSCI 2
// 02/18/2020
// Bunch of 2d array methods
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MatrixStuff {
	
	// I know you said 50x20 for this, But I can't imagine you want to dig through all that output
	// I can show it works a little more elegantly this way.
	private static final int ROWS = 10;
	private static final int COLS = 8;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int[][] matrix = new int[ROWS][COLS];
		
		System.out.println("\n--------ROW MAJOR--------\n");
		fillArrayRowMajor(matrix);
		printMatrix(matrix);
		
		System.out.println("\n------COLUMN MAJOR------\n");
		fillArrayColumnMajor(matrix);
		printMatrix(matrix);
		
		
		System.out.println("\nMax of matrix = " + findMax(matrix));
		System.out.println("Min of matrix = " + findMin(matrix));
		printRow(matrix, 2, COLS);
		System.out.println("Max of row = " + findMaxOfRow(matrix, 2));
		System.out.println("Min of row = " + findMinOfRow(matrix, 2));
		printColumn(matrix, 2, ROWS);
		System.out.println("Max of column = " + findMaxOfColumn(matrix, 2));
		System.out.println("Min of column = " + findMinOfColumn(matrix, 2) + "\n");
		
		System.out.println("Row of least change: " + smallestChange(matrix));
	}
	
	// Fills up to down
	public static void fillArrayRowMajor(int[][] matrix) throws FileNotFoundException {
		File file = new File("number_list.txt");
		Scanner sc = new Scanner(file);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (sc.hasNext()) matrix[i][j] = sc.nextInt();
				else System.out.println("File ran out of data.");
			}
		}

	}
	
	// Fills left to right
	public static void fillArrayColumnMajor(int[][] matrix) throws FileNotFoundException {
		File file = new File("number_list.txt");
		Scanner sc = new Scanner(file);
		// i < rows
		for (int i = 0; i < matrix[0].length; i++) {
			// i < cols
			for (int j = 0; j < matrix.length; j++) {
				if (sc.hasNext()) matrix[j][i] = sc.nextInt();
				else System.out.println("File ran out of data.");
			}
		}	
	}
	
	public static int findMax(int[][] matrix) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] > max) max = matrix[i][j];
			}
		}
		return max;
	}

	public static int findMin(int[][] matrix) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < min) min = matrix[i][j];
			}
		}
		return min;
	}

	public static int findMaxOfRow(int[][] matrix, int row) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < matrix[row].length; i++) {
				if (matrix[row][i] > max) max = matrix[row][i];
		}
		return max;
	}

	public static int findMinOfRow(int[][] matrix, int row) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < matrix[row].length; i++) {
			if (matrix[row][i] < min) min = matrix[row][i];
		}
		return min;
	}
	
	public static int findMaxOfColumn(int[][] matrix, int column) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][column] > max) max = matrix[i][column];
		}
		return max;
	}

	public static int findMinOfColumn(int[][] matrix, int column) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][column] < min) min = matrix[i][column];
		}
		return min;
	}

	public static void printRow(int[][] matrix, int row, int num_cols) {
		System.out.print("\nRow at index "+ row + ": [");
		for (int i = 0; i < num_cols; i++) {
			System.out.print(matrix[row][i]);
			if (i != num_cols -1) System.out.print(", ");
		}
		System.out.print("]\n");
	}
	
	public static void printColumn(int[][] matrix, int col, int num_rows) {
		System.out.print("\nColumn at index "+ col + ": [");
		for (int i = 0; i < num_rows; i++) {
			System.out.print(matrix[i][col]);
			if (i != num_rows -1) System.out.print(", ");
		}
		System.out.print("]\n");
	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("[");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
				if (j != matrix[0].length -1) System.out.print(", ");
			}
			System.out.print("]\n");
		}
	}

	// Returns the index of the row that experiences the least change from element to element.
	public static int smallestChange(int[][] matrix) {
		int minChange = Integer.MAX_VALUE;
		int indexOfLeastChange = 0;
		int totalChange = 0;
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length - 1; j++) {
				totalChange += Math.abs(matrix[i][j] - matrix [i][j+1]);
			}
			System.out.println("Row: " + i + ", Total Change: " + totalChange);
			if (totalChange < minChange) {
				minChange = totalChange;
				indexOfLeastChange = i;
			}
			totalChange = 0;
		}
		return indexOfLeastChange;
	}
}
