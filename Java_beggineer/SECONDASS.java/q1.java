
class Student {

    String name;
    String rollno;
    int age;

    public Student(String name, String rollno, int age) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
    }

    public Student(String name, int rollno, int age) {
        this.name = name;
        this.rollno = String.valueOf(rollno);
        this.age = age;
    }

    void disp() {
        System.out.println("Name: " + name + ", Roll No: " + rollno + ", Age: " + age);
    }
}

public class q1 {

    public static void main(String[] args) {
        Student obj1 = new Student("Pratik", "CS54", 19);
        Student obj2 = new Student("Riya", 101, 20);

        obj1.disp();
        obj2.disp();
    }
}
