import java.util.HashSet;
import java.util.Set;

public class setPrac {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("Set : "+set);
        set.remove(4);
        System.out.println("Remove 4 : " + set);
        
        System.out.println("Set Size : " + set.size());
        
        set.clear();
        System.out.println("Set after clear() : " + set);

        Set<Integer> set2 = new HashSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set.addAll(set2);
        System.out.println("Set 1 after adding Set 2 : " + set);
        
        set.retainAll(set2);
        System.out.println("Set 1 after retainAll() : " + set);
    }
}
