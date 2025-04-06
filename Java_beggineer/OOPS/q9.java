// Vehicle interface (for loose coupling)
interface Vehicle {
    void accelerate();
    void brake();
}

// Car class implements Vehicle and overrides methods
class Car implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Car is accelerating smoothly.");
    }

    @Override
    public void brake() {
        System.out.println("Car is applying brakes.");
    }

    // Overloaded methods
    public void accelerate(int speed) {
        System.out.println("Car is accelerating to " + speed + " km/h.");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car will reach " + speed + " km/h in " + duration + " seconds.");
    }
}

// Bicycle class implements Vehicle and overrides methods
class Bicycle implements Vehicle {

    @Override
    public void accelerate() {
        System.out.println("Bicycle is pedaling faster.");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is slowing down.");
    }

    // Overloaded methods
    public void accelerate(String terrain) {
        System.out.println("Bicycle is accelerating on " + terrain + " terrain.");
    }

    public void accelerate(String terrain, int effortLevel) {
        System.out.println("Bicycle is accelerating on " + terrain + " with effort level " + effortLevel + ".");
    }
}

// Main class
public class q9 {
    public static void main(String[] args) {

        // Polymorphism via interface
        Vehicle myCar = new Car();
        Vehicle myBike = new Bicycle();

        // Call overridden methods
        myCar.accelerate();
        myCar.brake();

        myBike.accelerate();
        myBike.brake();

        // Overloading: call class-specific methods
        Car c = new Car();
        c.accelerate(80);
        c.accelerate(100, 5);

        Bicycle b = new Bicycle();
        b.accelerate("mountain");
        b.accelerate("road", 3);
    }
}
