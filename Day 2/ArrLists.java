import java.util.ArrayList;

public class ArrLists {
    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(32); // To add something in list
        list.add(56);
        list.add(43);
        list.add(21);
        list.add(76);
        System.out.println(list);
        System.out.println("List Size : "+list.size()); // to get the list size
        list.set(0, 30); // to replace an element on the given index
        System.out.println(list);
        list.remove(0); // to remove an element on the given index
        list.addLast(58); // to add an element in the last

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2 = (ArrayList)list.clone(); // To clone a already made list to a new one 
        System.out.println("List 1 : " + list + "\nList 2 : " + list2);
        
        list2.remove(2);
        System.out.println("List 2 : " + list2);
        System.out.println("Element at 3rd Index(list1) : "+list.get(3));
        System.out.println("Is List Empty? :" +list.isEmpty());
        System.out.println("Reversed List :" + list.reversed());
        list.addAll(list2); // appends all elements of the list given in parameter
        System.out.println(list);
        list.sort(null);
        System.out.println(list);
    }
}
