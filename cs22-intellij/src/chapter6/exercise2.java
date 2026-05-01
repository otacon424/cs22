package chapter6;

<<<<<<< Updated upstream
public class exercise2 {
=======
import java.util.Queue;
import java.util.LinkedList;


public class exercise2 {

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(4);

        System.out.println(q.size());
        System.out.println(q.peek());
        q.add(6);
        System.out.println(q.remove());
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        q.add(7);
        System.out.println(q.peek());
    }
>>>>>>> Stashed changes
}
