//Creating the class Digits to get the largest and scond largest digit
import java.util.Scanner;
import java.util.Arrays;

public class ExtendDigits {
     // Initialize the distribute function to distribute the digits
     public static int[] distribute(int number,int[] digits,int maxDigit) {
          
          int i = 0;
          
          //Distributing the digits
          while(number > 0) {
             digits[i++] = number%10;
             number /= 10;

            // Checking the index must be smaller than maxDigit
            if(i == maxDigit) digits = Arrays.copyOf(digits,30);
          }

          // return the digits array
          return digits;
     }

     //Initialize the function largest to get largest digit in array              
     public static int largest(int[] digits) {
          
          int largest = Integer.MIN_VALUE;

          //Finding the largest digit
          for(int i = 0;i<digits.length;i++) {
               largest = Math.max(digits[i],largest);
           }
    
      // Return the largest digit
      return largest;
     }

     //Initialize the secondLargest function to find second largest digit in array
     public static int secondLargest(int[] digits,int largest) {
 
         int secondLargest = 0;

         // Finding the second largest digit in array
         for(int i = 0; i< digits.length; i++) {  
            if(secondLargest <= digits[i] && digits[i] != largest) {
                secondLargest = digits[i];
             }
         }

       //Return the second largest digit
       return secondLargest;
     }

     public static void main(String[] args) {
        // Creating a scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Creating the number variable to get user's input
        int number = scanner.nextInt();

        //Creating the digits array to collect all digits
        int[] digits = new int[number];

        int maxDigit = 10;

         //Getting the largest and second largest digit in an array
        digits = distribute(number,digits,maxDigit);
        int largest = largest(digits);
        int secondLargest = secondLargest(digits,largest);
 
         // Printing the largest and second largest digit in an array
         System.out.println("The largest digit is: " + largest);
         System.out.println("The second largest digit is: " + secondLargest);

}}
