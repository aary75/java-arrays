import java.util.Scanner;

public class MultiplicationTable6To9 {
       public static void multiply(int[] array, int number) {
          
          for(int i = 1; i<= array.length; i++) {
              array[i - 1] = number * i;

           }
       }

       public static void printing(int[] array,int number) {
           
           for(int i = 0; i < array.length; i++) {
              System.out.println(number + " * " + (i + 1) + " = " + array[i]);
           }
       }

       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
 
           int[] multiplicationResult = new int[10];

           int number = scanner.nextInt();

          if(number >= 6 && number <= 9) {
               multiply(multiplicationResult,number);
               printing(multiplicationResult,number);
          }
          
          

}}
