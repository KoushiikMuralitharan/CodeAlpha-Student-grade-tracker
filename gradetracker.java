import java.util.Scanner;
public class gradetracker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Student Mark Tracker");

        // Array to store student names
        String[] students = new String[5];
        // 2D array to store marks for each student
        int[][] marks = new int[5][3]; // Assuming 3 subjects

        // Input student names
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            students[i] = scanner.nextLine();
        }

        // Input marks for each student
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nEnter marks for " + students[i] + ":");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[i][j] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline
        }

        // Display student names and marks
        System.out.println("\nStudent Mark Sheet:");
        for (int i = 0; i < students.length; i++) {
            System.out.println("\nName: " + students[i]);
            System.out.println("Marks:");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Subject " + (j + 1) + ": " + marks[i][j]);
            }
        }

        // Calculate and display average marks for each student
        System.out.println("\nAverage Marks:");
        for (int i = 0; i < students.length; i++) {
            int totalMarks = 0;
            for (int j = 0; j < marks[i].length; j++) {
                totalMarks += marks[i][j];
            }
            double averageMarks = (double) totalMarks / marks[i].length;
            System.out.println(students[i] + ": " + averageMarks);
        }

        scanner.close();
    }
}
