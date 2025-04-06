
class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLen() {
        return length;
    }

    public void setLen(double length) {
        this.length = length;

    }

    public double getWid() {
        return width;
    }

    public void setWid(double width) {
        this.width = width;

    }

    public void calc(double length,double width) {
        double area = length * width;
        double perimeter = 2 * (length * width);
        System.out.println("area"+" "+area+" "+"perimeter"+" "+perimeter);

    }

    void disp() {
        System.out.println("The length of this Rectangle" + length + "" + "The width of this Rectangle" + width);
    }

}

class q2 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(45, 12);
        r1.disp();
        r1.calc(45,12);

    }
     


}
