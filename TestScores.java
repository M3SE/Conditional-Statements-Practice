import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 0 and 100: ");
        int score = Integer.valueOf(scanner.nextLine());

        // Validate the input
        if (score < 0 || score > 100) {
            System.out.println("Invalid input. Please enter a number between 0 and 100.");
        } else {
            // Determine the grade
            String grade;
            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Your grade is a " + grade + ".");
        }
    }
}