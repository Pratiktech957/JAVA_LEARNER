import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
            System.out.println("the sum of the number is " + sum);
        }

    }

}
