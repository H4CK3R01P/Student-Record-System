package Student_record;

import java.util.*;
// Student class
class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Getters and setters
    public int getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getMarks() { return marks; }
    public void setMarks(int marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Marks: " + marks;
    }
}

public class StudentRecordSystem {
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;
        System.out.println("===== Student Record Management System =====");

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> updateStudent();
                case 4 -> deleteStudent();
                case 5 -> {
                    exit = true;
                    System.out.println("Exiting system...");
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Add student
    private static void addStudent() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Student student = new Student(id, name, marks);
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View all students
    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("\nStudent Records:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Update student
    private static void updateStudent() {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.print("Enter new name (leave blank to keep unchanged): ");
                String name = scanner.nextLine();
                if (!name.isEmpty()) s.setName(name);

                System.out.print("Enter new marks (-1 to keep unchanged): ");
                int marks = scanner.nextInt();
                scanner.nextLine();
                if (marks != -1) s.setMarks(marks);

                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student ID not found!");
    }

    // Delete student
    private static void deleteStudent() {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (Student s : students) {
            if (s.getId() == id) {
                students.remove(s);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student ID not found!");
    }
}
