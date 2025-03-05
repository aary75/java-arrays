import java.util.Scanner;

public class Reverse {
     static int index = 0;

     public static int[] reverse(int number, int[] digits) {

        while(number > 0){
            digits[index++] = number % 10;
            number /= 10;
         }

        return digits;
     }

     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         int number = scanner.nextInt();

         int[] digits = new int[number];

         digits = reverse(number,digits);
 
         for(int i = 0; i < index; i++){
            System.out.print(digits[i] + " ");
         }
}}
