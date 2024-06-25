import java.util.Stack;
import java.util.*;

public class stackPrac {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10);
        stack.push(50);
        stack.push(30);
        stack.push(40);

        System.out.println("Peek : " + stack.peek());

        // iterator
        Iterator value = stack.iterator();
        System.out.println("Stack :");
        while (value.hasNext()) {
            System.out.print(value.next() + "\n");
        }

        stack.sort(null);
        System.out.println("After sort :");
        Iterator value1 = stack.iterator();
        while (value1.hasNext()) {
            System.out.print(value1.next() + "\n");
        }

        stack.pop();
        System.out.println("After Peek : " + stack.reversed());
    }
}
