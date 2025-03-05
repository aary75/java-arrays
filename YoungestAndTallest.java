import java.util.Scanner;

public class YoungestAndTallest {
    public static int[] findTallestAndYoungest(int[] age,int[] height) {
         
         int[] result = new int[2];

         if((age[0] < age[1]) && (age[0] < age[2])) result[0] = 0;
         else if((age[1] < age[0]) && (age[1] < age[2])) result[0] = 1;
         else result[0] = 2;

         if((height[0] > height[1]) && (height[0] > height[2])) result[1] = 0;
         else if((height[1] > height[0]) && (height[1] > height[2])) result[1] = 1;
         else result[1] = 2;
 
      return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] age = new int[3];

        int[] height = new int[3];


         System.out.println("First age and height is of Aman");
         System.out.println("Second age and height is of Akbar");
         System.out.println("Third age and height is of Anthony");
          
         System.out.println("Enter their age and height: ");
         for(int i = 0; i < 3; i++) {
              age[i] = scanner.nextInt();
              height[i] = scanner.nextInt();
         }
 
        int[] result = findTallestAndYoungest(age,height);
        
       if(result[0] == 0) System.out.println("Aman is youngest");
       else if(result[0] == 1) System.out.println("Akbar is youngest");
       else System.out.println("Anthony is youngest");

       if(result[1] == 0) System.out.print("Aman is tallest");
       else if(result[1] == 1) System.out.print("Akbar is tallest");
       else System.out.print("Anthony is tallest");
}}
