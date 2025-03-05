// Creating the class MultiplicationTable to create table of given nmber
import java.util.Scanner;

public class MultiplicationTable {
      // Initializing the function createTable to add table elements into array
      public static void createTable(int[] table, int number) {
           
            for(int i = 1; i <= 10; i++) {
          
              table[i - 1] = number * i;
             
          }
      }

      public static void main(String[] args) {
           // Creating the scanner class to get user's input
           Scanner scanner = new Scanner(System.in);

           // Declaring the array table with size 10
           int[] table = new int[10];

           // Declaring a variable number for table formation
           int number = scanner.nextInt();

           // Declaring the function createTable for table creation
           createTable(table,number);
 
           // Printing the table
           for(int i = 0;i < table.length; i++) {
              System.out.println(table[i]);
           }
}}
