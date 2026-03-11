import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask for the student's marks
        System.out.print("Enter the marks: ");
        int marks = scanner.nextInt();

        // Declare a variable for the grade
        char grade;

        // Calculate the grade based on marks
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Display the result
        System.out.println("The grade for " + marks + " marks is: " + grade);

        // Close the scanner
        scanner.close();
    }
}
