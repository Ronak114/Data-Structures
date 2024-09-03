public class a63_inheritance {
    // do for hybrid inheritance and Interfaces.
    public static void main(String args[]) {
        Dog jem = new Dog();
        jem.legs = 4;
        System.out.println(jem.legs);
        jem.eat();
    }
}

// base class
class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Mammals extends Animal {
    int legs;

    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammals {
    String breed;
}

class Fish extends Animal {
    void swim() {
        System.out.println("swims");
    }
}

class Birds extends Animal {
    void fly() {
        System.out.println("fly");
    }
}