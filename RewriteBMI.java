import java.util.Scanner;

public class RewriteBMI{
      public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int numberOfPersons = scanner.nextInt();

         double[][] personData = new double[numberOfPersons][3];
        
         String[] weightStatus = new String[numberOfPersons];

         for(int i = 0;i<numberOfPersons;i++) {
              System.out.println("For person " + (i+1));
              System.out.println("Weight (in Kilograms)     Height(in metres)");
              personData[i][0] = scanner.nextDouble();

            
              personData[i][1] = scanner.nextDouble();

              personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

              if(personData[i][2] <= 18.5) weightStatus[i] = "Underweight";
              else if(personData[i][2] > 18.5 && personData[i][2] >= 24.9) weightStatus[i] = "Normal";
              else if(personData[i][2] >= 25.0 && personData[i][2] <=39.9) weightStatus[i] = "Overweight";
              else weightStatus[i] = "Obese";
       }

       System.out.println("BMI Report");

       for(int i = 0;i<numberOfPersons;i++) {
               System.out.println("Person " + (i+1));
               System.out.print("Weight(in Kgs): ");
               System.out.println(personData[i][0]);
 
               System.out.print("Height(in metres): ");
               System.out.println(personData[i][1]);

               System.out.print("BMI: ");
               System.out.println(personData[i][2]);

               System.out.print("Weight Status: ");
               System.out.println(weightStatus[i]);
         System.out.println();       
}
}}
