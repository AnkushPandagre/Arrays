import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 3 Schools, 3 Classrooms per school, 5 Students per class
        int[][][] studentMarks = new int[3][3][5];

        // Inputting the marks using Scanner
        for (int school = 0; school < 3; school++) {
            System.out.println("Enter marks for School " + (school + 1) + ":");
            for (int classroom = 0; classroom < 3; classroom++) {
                System.out.println("  Classroom " + (classroom + 1) + ":");
                for (int student = 0; student < 5; student++) {
                    System.out.print("    Student " + (student + 1) + ": ");
                    studentMarks[school][classroom][student] = scanner.nextInt();
                }
            }
        }

        // Printing the marks (for verification)
        System.out.println("\nStudent Marks:");
        for (int school = 0; school < 3; school++) {
            System.out.println("School " + (school + 1) + ":");
            for (int classroom = 0; classroom < 3; classroom++) {
                System.out.println("  Classroom " + (classroom + 1) + ":");
                for (int student = 0; student < 5; student++) {
                    System.out.println("    Student " + (student + 1) + ": " + studentMarks[school][classroom][student]);
                }
            }
        }

       // ... (rest of the example code for calculations, etc. remains the same)

        scanner.close(); // Close the scanner to release resources
    }
}
