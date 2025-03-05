// Creating the MeanHeight class to calculate the mean of height's of all players
import java.util.Scanner;

public class MeanHeight {
     // Initializing the function sum to get the sum of all heights
     public static double sum(double[] height) {

          double sum = 0;

          // Summation of all heights
          for(int i = 0;i < height.length; i++) {

              sum += height[i];

           }
  
        // Return the sum
        return sum;
      }

     public static void main(String[] args) {
         // Creating the scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

         //Declaring the array height with data type double and size 11
         double[] height = new double[11];

         // Initializing the array height
         for(int i = 0; i < 11; i++) {
             height[i] = scanner.nextDouble();
         }
         
         double sumHeight = sum(height);

         // Printing the mean height of all players
         System.out.print("Mean height of all players is " + sumHeight/height.length);
}}
