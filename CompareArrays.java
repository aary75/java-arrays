// Create CompareArrays class to find which number is positive (even or odd), negative or zero
import java.util.Scanner;

public class CompareArrays {

       // Create the compare functions to compare the numbers
       public static void compare(int[] numbers) {
           
           for(int i = 0; i< numbers.length; i++ ) {
                  // Checking number is positive or not
                 if(numbers[i] > 0 ) {

                      System.out.println(numbers[i]% 2 == 0 ? numbers[i] + " is an even positive number." : numbers[i] + " is an odd positive number.");

                   }

                  // Checking the number is negative or not
                 else if(numbers[i] < 0) {

                      System.out.println(numbers[i] + " is a negative number.");

                   }
 
                 // Checking the number is zero or not
                 else {

                      System.out.println(numbers[i] + " is zero.");

                   }
        }}
  
     public static void main(String[] args) {
        // Creating the scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Declaring the array
        int[] numbers = new int[5];

        // Initializing the array
        for(int i = 0; i< numbers.length; i++) {

               numbers[i] = scanner.nextInt();
     
        }
        
        // Declaring the functions for comparison
        compare(numbers);
}}
