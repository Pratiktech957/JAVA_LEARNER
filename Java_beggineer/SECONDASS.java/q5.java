// Student.java

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

    // compareTo method to compare by roll number
    @Override
    public int compareTo(Student other) {
        return this.rollNumber.compareTo(other.rollNumber);
    }

    // toString method to display student details
    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber + ", Total Marks: " + totalMark;
    }
}

public class q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Student[] students = new Student[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Roll Number: ");
            String rollNumber = sc.nextLine();
            System.out.print("Total Marks: ");
            int totalMark = sc.nextInt();
            sc.nextLine(); // consume newline

            students[i] = new Student(name, rollNumber, totalMark);
        }

        // Bubble Sort based on rollNumber
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].compareTo(students[j + 1]) > 0) {
                    // Swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        // Display sorted students
        System.out.println("\nStudents sorted by Roll Number:");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}
