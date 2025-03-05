// Creating the ShoAndSumOfNumbers class to create the array and show all its elements
import java.util.Scanner;

// Initializing the function sum to do sum of all elements
public class ShowAndSumOfNumbers {
      public static double sum(double[] number) {

           double sum = 0;
         // Performing the sum of all elements
         for( int i = 0; i< number.length; i++ ) {
             System.out.print(number[i] + " ");
             sum += number[i];
          }

          // return the sum value
         return sum;
      }

      public static void main(String[] args) {
         // Creating the scanner class to get user's input
         Scanner scanner = new Scanner(System.in);

          // Declaring the array number with data type double and size 10
          double[] number = new double[10];

          int i = 0;

          double entity = scanner.nextDouble();
           
           // Entering the elements into array 
          while(i < number.length && entity != 0 && entity > 0) {
                number[i] = entity;
                
                entity = scanner.nextDouble();
                i++;
          }

         // Initializing the function sum to get sum of all elements
         double answer = sum(number);
         System.out.println();
 
         // Printing the sum of all elements
         System.out.print("The sum of all numbers is "+answer);
         
}}
