
import java.util.*;

// Student.java
class Student {

    String name;
    int rollNo;
    int age;

    public Student(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll No: " + rollNo + ", Age: " + age;
    }
}

// Comparator to sort by roll number
class RollNoComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollNo, s2.rollNo);
    }
}

// Comparator to sort by age
class AgeComparator implements Comparator<Student> {

    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}

// Driver class
public class StudentTest {

    public static void main(String[] args) {
        Student[] students = {
            new Student("Pratik", 103, 20),
            new Student("Riya", 101, 19),
            new Student("Amit", 102, 21)
        };

        // Sort by Roll No
        Arrays.sort(students, new RollNoComparator());
        System.out.println("Students sorted by Roll No:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort by Age
        Arrays.sort(students, new AgeComparator());
        System.out.println("\nStudents sorted by Age:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
