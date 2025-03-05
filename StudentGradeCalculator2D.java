import java.util.Scanner;

public class StudentGradeCalculator2D {

    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Array to store marks for Physics, Chemistry, and Maths (3 subjects)
        // 2D array: rows represent students, columns represent subjects
        int[][] marks = new int[numberOfStudents][3]; 
        double[] percentages = new double[numberOfStudents]; 
        String[] grades = new String[numberOfStudents]; 

        // Input marks for each student in 3 subjects
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1));

            // Input marks for Physics
            marks[i][0] = getValidMarks("Physics", scanner);
            
            // Input marks for Chemistry
            marks[i][1] = getValidMarks("Chemistry", scanner);
            
            // Input marks for Maths
            marks[i][2] = getValidMarks("Maths", scanner);

            // Calculate the percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
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
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
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
