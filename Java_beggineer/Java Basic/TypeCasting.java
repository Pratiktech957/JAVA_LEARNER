
public class TypeCasting {

    public int add(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void main(String[] args) {

        TypeCasting obj = new TypeCasting();
        System.out.println("the sum  of the two number");
        System.out.println( obj.add(5,8));
    


        // Widening (Automatic)
        int num = 100;
        long bigNum = num;
        float floatNum = bigNum;
        System.out.println("Widening:");
        System.out.println("int: " + num);
        System.out.println("long: " + bigNum);
        System.out.println("float: " + floatNum);

        // Narrowing (Manual)
        double d = 123.45;
        int i = (int) d;
        short s = (short) i;
        System.out.println("\nNarrowing:");
        System.out.println("double: " + d);
        System.out.println("int (after casting): " + i);
        System.out.println("short (after casting): " + s);
    }
}
