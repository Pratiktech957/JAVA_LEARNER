import java.text.NumberFormat;

public class err_02 {
    public static void main(String[] args) {
        String str = "123";


        try {

            int a = Integer.parseInt(str);
            System.out.println(a);

            // System.out.println("String NumberFormatException");

        }

        catch (NumberFormatException e) {
                  System.out.println("String"+ str + "cant be convertd to the Integer");

        }
        System.out.println("Main method Ended");

    }

}
