import java.util.Vector;

public class vectorList {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println(vector);

        vector.ensureCapacity(20);
        System.out.println(vector.capacity());

        vector.addElement(45);
        System.out.println(vector);

        System.out.println("Contains all? : "+vector.containsAll(vector));
        System.out.println("Contains 45? : " + vector.contains(45));
        
        System.out.println("Element at index 2: " + vector.get(2));

        vector.insertElementAt(35, 3);
        System.out.println(vector);

        System.out.println("Hashcode of vector : " + vector.hashCode());
        
        System.out.println(vector.parallelStream());
        
    }
}
