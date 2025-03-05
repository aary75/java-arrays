import java.util.Scanner;

public class Salary {
     static double totalNewSalary = 0;
     static double totalBonus = 0;
     public static void compute(double[] oldSalary, double[] yearsOfService, double[] newSalary, double[] bonus) {
           
           for(int i = 0; i<10; i++) {
               if(oldSalary[i] < 0 || yearsOfService[i] < 0) System.out.print("Invalid input");
               else{
                    if(yearsOfService[i] >= 5){
                         newSalary[i] = oldSalary[i] + (0.05 * oldSalary[i]);
                         bonus[i] = 0.05 * oldSalary[i];
                    }
                    else {
                         newSalary[i] = oldSalary[i] + (0.02 * oldSalary[i]);
                         bonus[i] = 0.02 * oldSalary[i];
                    }
                totalNewSalary += newSalary[i];
                totalBonus += bonus[i];
    }
}}
         
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] oldSalary = new double[10];

        double[] yearsOfService = new double[10];

        double[] newSalary = new double[10];

        double[] bonus = new double[10];

        double totalOldSalary = 0;

        for(int i = 0; i< 10; i++) {
            oldSalary[i] = scanner.nextInt();
            totalOldSalary += oldSalary[i];

            yearsOfService[i] = scanner.nextInt();
        }

        compute(oldSalary,yearsOfService,newSalary,bonus);        
        
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total new Salary: " + totalNewSalary);
        System.out.println("Total bonus: " + totalBonus);
}}
