
class A {

    private int value;

    public void setValue(int x) {
        this.value = x;
    }

    public int getValue() {
        return ++value;
    }
}

public class Encapsulation {

    public static void main(String[] args) {
        A obj = new A();
        obj.setValue(100);
        System.out.println(obj.getValue());
    }
}
