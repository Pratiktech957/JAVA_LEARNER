import java.util.Scanner;

public class q7 {

    public void finalize() {
        System.out.println("destroyed before garbage collection");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your charcter");
        char ch = sc.next().charAt(0);
        System.out.println("You entered: " + ch);
        try {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("vowel");
            } else {
                System.out.println("consenant");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        finally {
            System.out.println("programme excecute fine...args..args..");
        }

        q7 obj = new q7();

        obj = null;
        System.gc();

    }

}
