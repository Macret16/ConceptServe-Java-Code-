import java.util.HashMap;
import java.util.Iterator;

public class hashmapPrac {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10,"Animals");
        map.put(20,"Vegetables");
        map.put(30, "Aliens");
        System.out.println("Map : "+map);

        System.out.println("Contains Vegetables? : "+map.containsKey(20));
        map.remove(10);
        System.out.println("Remove \"Animals\" : "+map);
    }
}
