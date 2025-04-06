
abstract class Animal {

    public abstract void sound();

    public abstract void eat();
}

class Dog extends Animal {

    public void sound() {
        System.out.println("Dog is barking");
    }

    public void eat() {
        System.out.println("dog is eating");
    }

}

class Lion extends Animal {

    public void sound() {
        System.out.println("lion is roaring");
    }

    public void eat() {
        System.out.println("lion is eating");
    }

}

public class demo {

    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
        obj.eat();
        Animal obj1 = new Lion();
        obj1.sound();
        obj1.eat();

    }

}
