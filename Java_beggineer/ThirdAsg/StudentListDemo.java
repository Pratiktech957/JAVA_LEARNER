
import java.util.*;

class Student {

    String name;
    int age;
    int mark;

    Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String toString() {
        return name + " - Age: " + age + ", Mark: " + mark;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.name.equals(s.name) && this.age == s.age && this.mark == s.mark;
        }
        return false;
    }
}

public class StudentListDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Student> list = new LinkedList<>();

        list.add(new Student("Pratik", 20, 90));
        list.add(new Student("Aman", 21, 85));
        list.add(new Student("Sara", 22, 88));

        System.out.println("All Students:");
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("\nEnter name, age, mark to search:");
        String name = sc.next();
        int age = sc.nextInt();
        int mark = sc.nextInt();

        Student searchStudent = new Student(name, age, mark);

        if (list.contains(searchStudent)) {
            System.out.println("Student found (content comparison using equals).");
        } else {
            System.out.println("Student not found.");
        }

        list.remove(searchStudent);
        System.out.println("\nAfter removal:");
        for (Student s : list) {
            System.out.println(s);
        }

        System.out.println("\nTotal students: " + list.size());
    }
}
