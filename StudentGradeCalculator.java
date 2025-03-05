import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input for number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Input Physics marks and validate
            physicsMarks[i] = getValidMarks("Physics", scanner);
            
            // Input Chemistry marks and validate
            chemistryMarks[i] = getValidMarks("Chemistry", scanner);
            
            // Input Maths marks and validate
            mathsMarks[i] = getValidMarks("Maths", scanner);

            // Calculate percentage
            double totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine the grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "Grade A";
            } else if (percentages[i] >= 60) {
                grades[i] = "Grade B";
            } else if (percentages[i] >= 40) {
                grades[i] = "Grade C";
            } else {
                grades[i] = "Grade D";
            }
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\nStudent Report:");
        System.out.println("------------------------------------------------------");
        System.out.println("Student | Physics | Chemistry | Maths | Percentage | Grade");
        System.out.println("------------------------------------------------------");
        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%7d | %7d | %9d | %5d | %.2f%% | %s\n", 
                (i + 1), physicsMarks[i], chemistryMarks[i], mathsMarks[i], percentages[i], grades[i]);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to get valid marks for each subject (positive and within the valid range)
    public static int getValidMarks(String subject, Scanner scanner) {
        int marks;
        while (true) {
            System.out.print("Enter marks for " + subject + " (0-100): ");
            marks = scanner.nextInt();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Invalid input. Please enter positive marks between 0 and 100.");
            }
        }
        return marks;
    }
}
