abstract class Animal {
    abstract void run();
    abstract void eat();
    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal{
    void run() {
        System.out.println("Running...");
    }
    
    void eat() {
        System.out.println("Eating...");
    }
}

public class abstractPrac {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.run();
        dog.sleep();
    }
}