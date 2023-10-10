import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String nm;
    private int roll;
    private String grade;

    public Student(String nm, int roll, String grade) {
        this.nm = nm;
        this.roll = roll;
        this.grade = grade;
    }

    public String getnm() {
        return nm;
    }

    public int getroll() {
        return roll;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Name: " + nm + ", Roll Number: " + roll + ", Grade: " + grade;
    }
}

class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<Student>();
    }

    public void addStudent(String nm, int roll, String grade) {
        Student student = new Student(nm, roll, grade);
        students.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStud(int roll) {
        for (Student student : students) {
            if (student.getroll() == roll) {
                students.remove(student);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student with roll number " + roll + " not found.");
    }

    public void searchStud(int roll) {
        for (Student student : students) {
            if (student.getroll() == roll) {
                System.out.println("Student found: " + student);
                return;
            }
        }
        System.out.println("Student with roll number " + roll + " not found.");
    }

    public void displayStud() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
        } else {
            System.out.println("All Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}

public class StudentManagementApp {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Student Name: ");
                    String nm = scanner.nextLine();
                    System.out.print("Enter student Roll Number: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Student Grade: ");
                    String grade = scanner.nextLine();
                    system.addStudent(nm, roll, grade);
                    break;
                case 2:
                    System.out.print("Enter the roll number of the student to remove: ");
                    int removeroll = scanner.nextInt();
                    system.removeStud(removeroll);
                    break;
                case 3:
                    System.out.print("Enter the roll number of the student to search: ");
                    int searchroll = scanner.nextInt();
                    system.searchStud(searchroll);
                    break;
                case 4:
                    system.displayStud();
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
