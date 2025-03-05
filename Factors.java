import java.util.Scanner;
import java.util.Arrays;

public class Factors {
     static int index = 0;
     public static int[] findFactors(int[] factors,int maxIndex, int number) {

         for( int i = 1;i <= number; i++) {
              if(index == maxIndex){
                   maxIndex *= 2;
                  factors = Arrays.copyOf(factors,maxIndex);
                  
              }

              if(number % i == 0) factors[index++] = i;
         }
        
       return factors;
     }

     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int number = scanner.nextInt();

         int maxIndex = 10;

         int[] factors = new int[maxIndex];

         factors =  findFactors(factors,maxIndex,number);
        
         for(int i = 0; i<index; i++) {
             System.out.print(factors[i] + " ");
         }
}}
