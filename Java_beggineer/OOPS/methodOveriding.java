
class Shape {

    void draw() {
        System.out.println("cant say shape type ");
    }
}

class square extends Shape {

    @Override
    void draw() {
        super.draw();
        System.out.println("Square shape");
    }
}

public class methodOveriding {

    public static void main(String[] args) {
        Shape s1 = new square();
        s1.draw();

    }
}
