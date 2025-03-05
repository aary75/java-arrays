// Creating the fizzBuxzz class to create position array
import java.util.Scanner;

public class FizzBuzz {
    // Initializing the convert function to get value for every position
    public static String[] convert(String[] fizz,int number) {
          
          // Alloting the values to position
          for(int i = 0;i<number;i++) {
                 if((i + 1) % 3 == 0 && (i + 1) % 5 == 0) fizz[i] = "FizzBuzz";
                 else if((i+1) % 5 == 0 ) fizz[i] = "Buzz";
                 else if((i+1) % 3 == 0 ) fizz[i] = "Fizz";
                 else fizz[i] = String.valueOf(i+1);
         }

        // Returning the array
        return fizz;
    }

    public static void main(String[] args) {
         // Creating the scanner class to get user's input
         Scanner scanner = new Scanner(System.in);
         
         // Creating the number to get user's input
         int number = scanner.nextInt();

         // Initializing the array with data type string and size the user's input
         String[] fizz = new String[number];

          // Start the function to allocation of values
         fizz = convert(fizz,number);
         
         // Printing the array
         for(int i = 0;i<fizz.length; i++) {
              System.out.println("Position " + (i + 1) + " = " + fizz[i]);
         }
   }}
