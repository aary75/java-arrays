import java.util.Scanner;

public class BMIReport{
      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int numberOfPersons = scanner.nextInt();

         double[] weight = new double[numberOfPersons];
         double[] height = new double[numberOfPersons];
         double[] bmi = new double[numberOfPersons];
         String[] weightStatus = new String[numberOfPersons];

         for(int i = 0;i<numberOfPersons;i++) {
              System.out.println("For person " + (i+1));
              System.out.print("Weight (in Kilograms): ");
              weight[i] = scanner.nextDouble();

              System.out.print("Height (in metres): ");
              height[i] = scanner.nextDouble();

              bmi[i] = weight[i] / (height[i] * height[i]);

              if(bmi[i] <= 18.5) weightStatus[i] = "Underweight";
              else if(bmi[i] > 18.5 && bmi[i] >= 24.9) weightStatus[i] = "Normal";
              else if(bmi[i] >= 25.0 && bmi[i] <=39.9) weightStatus[i] = "Overweight";
              else weightStatus[i] = "Obese";
       }

       System.out.println("BMI Report");

       for(int i = 0;i<numberOfPersons;i++) {
               System.out.println("Person " + (i+1));
               System.out.print("Weight(in Kgs): ");
               System.out.println(weight[i]);
 
               System.out.print("Height(in metres): ");
               System.out.println(height[i]);

               System.out.print("BMI: ");
               System.out.println(bmi[i]);

               System.out.print("Weight Status: ");
               System.out.println(weightStatus[i]);
         System.out.println();       
}
}}
