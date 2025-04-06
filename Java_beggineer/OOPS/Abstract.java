
abstract class Animal {

    abstract void speak();

}

class Dog extends Animal {

    void speak() {
        System.out.println("Bho Bho");
    }

}

class cat extends Animal {

    void speak() {
        System.out.println("meow meow");
    }
}

public class Abstract {

    public static void main(String[] args) {
        Animal obj = new Dog();
        Animal cat1 = new cat();
        obj.speak();
        cat1.speak();
    }

}
