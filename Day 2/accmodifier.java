class Student {
    private int roll=30; // only same class can access private variables
    protected String name="Karan"; // protected variables can be accessed through objects but not directly
    public int age=20; // public can be accessed anywhere in the package or outside the package
    int id=10;
}

public class accmodifier {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.age); //public access modifier
        System.out.println(s.id); //default access modifier
        //System.out.println(s.roll); //private access modifier, cannot be accessed
        System.out.println(s.name); //protected access modifier, cannot be accessed directly
    }
}