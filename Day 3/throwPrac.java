public class throwPrac {

    public static void display(){
        int a = 47;
        int b = 0;
        try {
            System.out.println(a / b);
            throw new ArithmeticException("Arithmetic Throw");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occured");
            throw e;
        } finally {
            System.out.println("Finally Block is executed");
        }
    }

    public static void main(String[] args) {
        try{
            display();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main throw");
        }
    }
}