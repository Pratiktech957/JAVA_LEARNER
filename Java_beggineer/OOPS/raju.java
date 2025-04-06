import java.util.Scanner;

interface client {
    void input();
    void output();
}

class Raju implements client {

    String name;
    double sal;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Username:");
        name = sc.nextLine();
        System.out.println("Enter salary:");
        sal = sc.nextDouble();
        sc.close(); // optional but good practice to close Scanner
    }

    public void output() {
        System.out.println("Name: " + name + ", Salary: " + sal);
    }

    public static void main(String[] args) {
        client obj = new Raju();
        obj.input();
        obj.output();
    }
}
