import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("All the Even are:");
                System.out.println(i);
                evenSum += i;
            }
        }
        System.out.println();
        System.out.println("ITS THE DIVIDER");
        for (int j = 1; j < n; j++) {
            if (j % 2 == 1) {
                System.out.println("All the odd numbers are:");
                System.out.println(j);
                oddSum += j;

            }

        }

        System.out.println(evenSum);
        System.out.println(oddSum);

    }
}
