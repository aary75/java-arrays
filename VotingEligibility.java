// Creating the class VotingEligibility to check student is eligible for voting or not
import java.util.Scanner;

public class VotingEligibility {
      public static void main(String[] args) {
         // Creating the scanner class to get user's input
         Scanner scanner  = new Scanner(System.in);

         // Declare the array with name age of size 10
         int[] age = new int[10];

         // Entering the age of students and check they are eligible for voting or not
         for(int i = 0;i<10;i++) {
             System.out.print("Enter your age: ");
             age[i] = scanner.nextInt();

             int eligible = age[i];


             if(eligible >= 18) {
                System.out.println("The student with the age " + eligible + " can vote.");
             } 
             else if(eligible < 0) {
                 System.out.println("The age is invalid.");
             }
             else {
                 System.out.println("The student with the age " + eligible + " cannot vote.");
             }
         }
}}
