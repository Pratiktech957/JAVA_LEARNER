// Animal.java

class Animal {

    String name;
    String color;
    String type; // pet or wild

    // Constructor
    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    // Override hashCode() to generate a unique identifier
    @Override
    public int hashCode() {
        return name.hashCode() + color.hashCode() + type.hashCode();
    }

    // Optional: override toString() for display
    @Override
    public String toString() {
        return "Animal: " + name + ", Color: " + color + ", Type: " + type;
    }
}

// Driver class
public class q6 {

    public static void main(String[] args) {
        Animal a1 = new Animal("Dog", "Brown", "Pet");
        Animal a2 = new Animal("Tiger", "Orange", "Wild");
        Animal a3 = new Animal("Cat", "White", "Pet");

        System.out.println(a1 + " -> HashCode: " + a1.hashCode());
        System.out.println(a2 + " -> HashCode: " + a2.hashCode());
        System.out.println(a3 + " -> HashCode: " + a3.hashCode());
    }
}
