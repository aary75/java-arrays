// Creating a OddEvenArray to distribute the odd and even numbers between 1 and given number
import java.util.Scanner;

public class OddEvenArray {
      // Initializing the allocation function to distribute the odd and even numbers
      public static void allocation(int number,int[] evenArray, int[] oddArray, int oddIndex, int evenIndex) {

           // Distributing odd and even numbers
           for(int i = 1; i <= number; i++) {
               if(i % 2 == 0) evenArray[evenIndex++] = i;
               else oddArray[oddIndex++] = i;
           }
      }

      public static void main(String[] args) {
          // Creating a scanner class to get user's input
          Scanner scanner = new Scanner(System.in);

          // Creating a variable number to get user's input
          int number = scanner.nextInt();

          // Creating two variables oddIndex and evenIndex as the index of OddArray and evenArray
          int oddIndex = 0;
          int evenIndex = 0;

          // Creating the variable size to adjust the size of evenArray and oddArray
          int size = 0;

          // Adjusting the size
          if(number % 2 != 0) size = (number / 2) + 1;
          else size = number / 2;

          //Declaring the evenArray and oddArray
          int[] evenArray = new int[size];
          int[] oddArray = new int[size];

          // Declare the function allocatioin to distribute odd and even numbers
          allocation(number,evenArray,oddArray,oddIndex,evenIndex);

           // Adjusting the index of evenArray to according to even or odd length of evenArray
          if(evenArray.length % 2 == 0) evenIndex = evenArray.length; 
          else evenIndex = evenArray.length - 1;
        
          // Printing even numbers
          System.out.print("Array of Even numbers: ");
          for(int i = 0; i< evenIndex; i++) {
               System.out.print(evenArray[i] + " ");
          }

          // Printing odd numbers
          oddIndex = oddArray.length;
          System.out.print("Array of Odd numbers: ");
          for(int i = 0; i < oddIndex; i++) {
              System.out.print(oddArray[i] + " ");
          }
}}
