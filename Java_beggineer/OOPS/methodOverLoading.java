// method overloading same method name but different parameter 

class polymorphism {

    void add() {
        int x = 10, y = 45;
        int sum = x + y;
        System.out.println("Sum of the number" + " " + sum);
    }

    int add(int x, int y) {
        int sum = x + y;
        return sum;

    }

    int add(int x, int y, int z) {
        int c = x + y + z;
        return c;
    }

}

public class methodOverLoading {

    public static void main(String[] args) {
        polymorphism p1 = new polymorphism();
        p1.add();
        int add = p1.add(5, 10);
        System.out.println(add);
        int add1 = p1.add(5, 10, 45);
        System.out.println(add1);

    }

}
