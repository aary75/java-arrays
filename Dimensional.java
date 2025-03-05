//Creating the Dimensional class to convert 2d array into 1d Array
import java.util.Scanner;

public class Dimensional {
        // Initializing the change function to convert 2d array into 1d array
        public static int[] change(int[][] array2d,int[] array1d,int rows,int cols) {
           int index = 0;
 
            // Changing the array
            for(int i = 0; i< rows; i++) {
                 for(int j = 0; j < cols; j++) {
                      array1d[index++] = array2d[i][j];
                 }
            }

        // Returning the 1D array
        return array1d;

       }
         
        public static void main(String[] args) {
           // Creating a scanner class to get user's input
           Scanner scanner = new Scanner(System.in);

           // Getting the number of rows
           System.out.print("Enter the rows: ");
           int rows = scanner.nextInt();

           // Getting the number of cols
           System.out.print("Enter the cols: ");
           int cols = scanner.nextInt();

           // Declare the 2d array
           int[][] array2d = new int[rows][cols];

           // Initializing the 2d array
           for(int i = 0; i < rows; i++ ) { 
                 for(int j = 0; j < cols; j++) {
                     array2d[i][j] = scanner.nextInt();
                 }
           }

           // Declare the 1d array
           int[] array1d = new int[rows * cols];
           
           // Change it into 1d array
           array1d = change(array2d,array1d,rows,cols);
           
           // Printing the 1d array
           for(int i = 0; i < array1d.length; i++) {
               System.out.print(array1d[i] + " ");
           }
    }}
