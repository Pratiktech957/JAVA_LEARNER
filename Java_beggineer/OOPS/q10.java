import java.util.*;

// Interface for loose coupling
interface EnrollmentSystem {
    void enroll(Student s, Course c);
    void drop(Student s, Course c);
    void showEnrollmentDetails();
}

// Student class - student info only (High Cohesion)
class Student {
    String studentId;
    String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getInfo() {
        return studentId + " - " + name;
    }
}

// Course class - course info only (High Cohesion)
class Course {
    String courseId;
    String courseName;

    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }

    public String getInfo() {
        return courseId + " - " + courseName;
    }
}

// Enrollment class - manages enrollment logic
class Enrollment implements EnrollmentSystem {
    Map<Course, List<Student>> enrollments = new HashMap<>();

    public void enroll(Student s, Course c) {
        enrollments.putIfAbsent(c, new ArrayList<>());
        enrollments.get(c).add(s);
        System.out.println(s.name + " enrolled in " + c.courseName);
    }

    public void drop(Student s, Course c) {
        if (enrollments.containsKey(c)) {
            enrollments.get(c).remove(s);
            System.out.println(s.name + " dropped from " + c.courseName);
        }
    }

    public void showEnrollmentDetails() {
        System.out.println("\n--- Enrollment Details ---");
        for (Course c : enrollments.keySet()) {
            System.out.println("Course: " + c.getInfo());
            for (Student s : enrollments.get(c)) {
                System.out.println(" - " + s.getInfo());
            }
        }
    }
}

// Main class to run everything
public class q10{
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("S101", "Ram");
        Student s2 = new Student("S102", "Sita");

        // Create courses
        Course c1 = new Course("C001", "Java Basics");
        Course c2 = new Course("C002", "Data Structures");

        // Use interface for enrollment system (loose coupling)
        EnrollmentSystem system = new Enrollment();

        // Enroll students
        system.enroll(s1, c1);
        system.enroll(s2, c1);
        system.enroll(s1, c2);

        // Drop student
        system.drop(s2, c1);

        // Show final enrollments
        system.showEnrollmentDetails();
    }
}




