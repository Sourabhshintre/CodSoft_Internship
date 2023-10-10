import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Student Grade Calculator");
        System.out.print("Enter the total number of subjects: ");
        int numSubj = scanner.nextInt();
        int outofmks = numSubj*100;

        int totalMks = 0;
        for (int i = 1; i <= numSubj; i++) {
            System.out.print("Enter marks obtained in the subject " + i + ": ");
            int submks = scanner.nextInt();
            totalMks += submks;
        }

        double avgper = (double) totalMks / numSubj;

        char grade;
        if (avgper >= 90) {
            grade = 'A';
        } else if (avgper >= 80) {
            grade = 'B';
        } else if (avgper >= 70) {
            grade = 'C';
        } else if (avgper >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks Out Of: " + outofmks);
        System.out.println("Total Marks Obtained: " + totalMks);
        System.out.println("Average Percentage: " + avgper + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
