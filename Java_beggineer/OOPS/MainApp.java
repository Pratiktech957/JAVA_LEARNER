// College class with name and location
class College {
    String collegeName;
    String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
}

// Student class with ID, name and reference to College
class Student {
    int studentId;
    String studentName;
    College college;  // HAS-A relationship

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    // Method to display all info
    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Name: " + college.collegeName);
        System.out.println("College Location: " + college.collegeLoc);
        System.out.println("---------------------------------");
    }
}

// Main class to execute program
public class MainApp {
    public static void main(String[] args) {
        // Creating college objects
        College college1 = new College("SSVM", "Cuttack");
        College college2 = new College("KIIT", "Bhubaneswar");

        // Creating student objects and assigning colleges
        Student student1 = new Student(101, "Ram", college1);
        Student student2 = new Student(102, "Sita", college2);

        // Display student and college details
        student1.displayStudentInfo();
        student2.displayStudentInfo();
    }
}
