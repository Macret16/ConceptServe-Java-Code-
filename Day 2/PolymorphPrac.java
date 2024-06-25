class A {
    void display() {
        System.out.println("Class A");
    }

    void display(int a) {
        System.out.println(a + 20);
    }
}

class B extends A {
    void display() {
        System.out.println("Class B"); // It searches here for display method, if it is not here, it will search in the
                                       // extended class.
        // if it finds the method here, it will give preference to this method first.
    }
}

public class PolymorphPrac {
    public static void main(String[] args) {
        // overriding example
        B b = new B();
        b.display();

        // overloading example
        A a = new A();
        a.display();
        a.display(10);
    }
}
