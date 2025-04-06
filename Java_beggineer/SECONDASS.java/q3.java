
class Car implements Comparable<Car> {

    String model;
    String color;
    int speed;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed + " km/h";
    }

    @Override
    public int compareTo(Car other) {
        return this.speed - other.speed;
    }
}

public class q3 {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Red", 200);
        Car car2 = new Car("BMW", "Black", 180);

        if (car1.compareTo(car2) > 0) {
            System.out.println("Car 1 is faster:\n" + car1);
        } else if (car1.compareTo(car2) < 0) {
            System.out.println("Car 2 is faster:\n" + car2);
        } else {
            System.out.println("Both cars have the same speed.");
            System.out.println(car1);
            System.out.println(car2);
        }
    }
}
