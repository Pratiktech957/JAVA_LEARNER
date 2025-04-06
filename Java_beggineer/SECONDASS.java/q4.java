
import java.util.Scanner;

class Student implements Comparable<Student> {

    String name;
    String rollNumber;
    int totalMark;

    // Constructor
    public Student(String name, String rollNumber, int totalMark) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.totalMark = totalMark;
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Total Marks: " + totalMark;
    }

    // compareTo method to compare by totalMark
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.totalMark, other.totalMark);
    }
}

public class q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create array of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input students
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            String roll = sc.nextLine();
            System.out.print("Total Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); // consume newline

            students[i] = new Student(name, roll, marks);
        }

        // Search student by roll number
        System.out.print("Enter roll number to search: ");
        String searchRoll = sc.nextLine();
        boolean found = false;

        for (Student s : students) {
            if (s.rollNumber.equals(searchRoll)) {
                System.out.println("Student Found:\n" + s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with Roll Number " + searchRoll + " not found.");
        }

        sc.close();
    }
}
