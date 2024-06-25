import java.util.LinkedList;

public class linklistPrac {
    public static void main(String[] args) {
        LinkedList<Integer> linklist = new LinkedList<Integer>();
        linklist.add(10);
        linklist.add(20);
        linklist.add(30);
        linklist.add(40);

        linklist.removeLast(); // removes the last element of the link list
        linklist.addFirst(45);
        System.out.println(linklist);
        // linklist.clear();
        System.out.println(linklist);
        System.out.println("Last Element : " + linklist.getLast());

        linklist.offer(3); // Adds the specified element as the tail (last element) of this list
        System.out.println(linklist);
        System.out.println("Index of element 3 : " + linklist.indexOf(3));

        System.out.println(linklist.peek()); // returns head of the linklist
        int c[] = { 3, 4, 5 };
        System.out.println(linklist.containsAll(linklist)); // returns true or false if it contains all

    }
}
