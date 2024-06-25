import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class queuePrac {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        System.out.println(q);

        q.remove();
        System.out.println("q.remove : " + q);

        q.poll();
        System.out.println("q.poll : " + q);

        q.offer(45);
        System.out.println("q.offer(45) : " + q);
    }
}
