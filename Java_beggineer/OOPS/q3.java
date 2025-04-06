

    class Point {

        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point(Point other) {
            this.x = other.x;
            this.y = other.y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public void display() {
            System.out.println("Point(x=" + x + ", y=" + y + ")");
        }
    }

    public class q3 {

        public static void main(String[] args) {
            Point p1 = new Point(5, 10);
            System.out.print("Original Point p1: ");
            p1.display();

            Point p2 = new Point(p1);
            System.out.print("Copied Point p2: ");
            p2.display();

            p1.setX(20);
            p1.setY(40);

            System.out.println("\nAfter modifying p1:");
            System.out.print("p1: ");
            p1.display();
            System.out.print("p2: ");
            p2.display();
        }
    }



