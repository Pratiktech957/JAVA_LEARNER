
class image {

    private double imageWidth;
    private double imageHeight;
    private double colorCode;

    public image() {
        this.imageWidth = 0;
        this.imageHeight = 0;
        this.colorCode = 0;
    }

    public image(double imageWidth, double imageHeight, double colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode = colorCode;
    }

    public double getWid() {
        return imageWidth;
    }

    public void setWid(double imageWidth) {
        this.imageWidth = imageWidth;
    }

    public double getHei() {
        return imageHeight;
    }

    public void setHei(double imageHeight) {
        this.imageHeight = imageHeight;
    }

    public double getColorCode() {
        return colorCode;
    }

    public void setColorCode(double colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return "Image Width: " + imageWidth + ", Height: " + imageHeight + ", Color Code: " + colorCode;
    }

    public void disp() {
        System.out.println(toString());
    }
}

public class q4 {

    public static void main(String[] args) {
        image m1 = new image(100, 244, 255);
        m1.disp();

        image m2 = new image();
        m2.setWid(500);
        m2.setHei(300);
        m2.setColorCode(128);
        System.out.println("Using Default Constructor and Setters:");
        m2.disp();
    }
}
